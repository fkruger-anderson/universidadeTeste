/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exceptions.UniversidadeException;
import Model.Aluno;
import Model.Curso;
import Model.DAO.AlunoDAO;
import Model.DAO.CursoDAO;
import Model.DAO.TurmaDAO;
import Model.Turma;
import View.Helper.MatricularAlunoHelper;
import View.MatricularAlunoView;
import java.util.List;

/**
 *
 * @author ander
 */
public class MatricularAlunoController {
    private final MatricularAlunoHelper helper;

    public MatricularAlunoController(MatricularAlunoView view) {
        this.helper = new MatricularAlunoHelper(view);
    }

    public void matricularAluno() throws UniversidadeException {
        Aluno aluno = helper.pegarAluno();
        Turma turma = helper.pegarTurma();
        
        if (turma.getAlunosMatriculados().stream().anyMatch(a -> a.equals(aluno))) {
            throw new UniversidadeException("Aluno já matriculado.");            
        }
        
        if (turma.getAlunosMatriculados().size() + 1 > turma.getQtdVagas()) {
            throw new UniversidadeException("Limite da turma excedido.");
        }
        
        turma.getAlunosMatriculados().add(aluno);
    }

    public void atualizarTurmas() {
        Curso curso = helper.pegarCurso();
        
        TurmaDAO turmaDAO = new TurmaDAO();
        List<Turma> turmas = turmaDAO.getTurmas();
        
        List<Turma> turmasCurso = turmas.stream()
                                        .filter(t -> t.getCurso().equals(curso))
                                        .toList();
        
        helper.popularTurmas(turmasCurso);
    }

    public void atualizarAlunos() {
        AlunoDAO alunoDAO = new AlunoDAO();
        
        List<Aluno> alunos = alunoDAO.getAlunos();
        helper.popularAlunos(alunos);
    }

    public void atualizarCursos() {
        CursoDAO cursoDAO = new CursoDAO();
        
        List<Curso> cursos = cursoDAO.getCursos();
        helper.popularCursos(cursos);
    }
    
}
