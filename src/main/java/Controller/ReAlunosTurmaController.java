/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Comparator.AlunoByCPFComparator;
import Comparator.AlunoByNomeComparator;
import Model.Aluno;
import Model.Curso;
import Model.DAO.CursoDAO;
import Model.DAO.TurmaDAO;
import Model.Turma;
import View.Helper.ReAlunosTurmaHelper;
import View.ReAlunosTurmaView;
import java.util.List;

/**
 *
 * @author ander
 */
public class ReAlunosTurmaController {
    private final ReAlunosTurmaHelper helper;

    public ReAlunosTurmaController(ReAlunosTurmaView view) {
        this.helper = new ReAlunosTurmaHelper(view);
    }

    private List<Aluno> alunosMatriculadoTurma() {
        Turma turma = helper.pegarTurma();
        return turma.getAlunosMatriculados();
    }

    public void atualizarCursos() {
        CursoDAO cursoDAO = new CursoDAO();
        
        List<Curso> cursos = cursoDAO.getCursos();
        helper.popularCursos(cursos);
    }

    public void atualizarTurmas() {
        Curso curso = helper.obterCurso();
        
        TurmaDAO turmaDAO = new TurmaDAO();
        List<Turma> turmas = turmaDAO.getTurmas();
        
        List<Turma> turmasCurso = turmas.stream()
                                        .filter(t -> t.getCurso().equals(curso))
                                        .toList();
        
        helper.popularTurmas(turmasCurso);
    }

    public void buscarAlunosAlf() {
        List<Aluno> alunosAlf = alunosMatriculadoTurma().stream()
                                                        .sorted(new AlunoByNomeComparator())
                                                        .toList();
        helper.popularTableAlunos(alunosAlf);
    }

    public void buscarAlunosCPF() {
        List<Aluno> alunosCPF = alunosMatriculadoTurma().stream()
                                                        .sorted(new AlunoByCPFComparator())
                                                        .toList();
        helper.popularTableAlunos(alunosCPF);    
    }
}
