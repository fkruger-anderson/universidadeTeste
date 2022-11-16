/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exceptions.UniversidadeException;
import Model.Curso;
import Model.DAO.CursoDAO;
import Model.DAO.TurmaDAO;
import Model.Turma;
import View.Helper.ReTurmasAlunoHelper;
import View.ReTurmasAlunoView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class ReTurmasAlunoController {
    private final ReTurmasAlunoHelper helper;

    public ReTurmasAlunoController(ReTurmasAlunoView view) {
        this.helper = new ReTurmasAlunoHelper(view);
    }

    public void buscarTurmas() throws UniversidadeException {
        Curso curso = helper.pegarCurso();
        String matricula = helper.pegarMatricula();
        
        TurmaDAO turmaDAO = new TurmaDAO();
        List<Turma> turmasCurso = turmaDAO.getTurmas()
                                          .stream()
                                          .filter(t -> t.getCurso().equals(curso))
                                          .toList();
        
        List<Turma> turmasAluno = new ArrayList<>();
        for (Turma turma : turmasCurso) {
            boolean encontrado = turma.getAlunosMatriculados()
                                      .stream()
                                      .anyMatch(a -> a.getMatricula().equalsIgnoreCase(matricula));
            if (encontrado) {
                turmasAluno.add(turma);
            }
        }
        
        if (turmasAluno.isEmpty()) {
            throw new UniversidadeException("Aluno não encontrado, ou não matriculado.");
        }
        
        helper.popularTaTurmas(turmasAluno);
    }
    
    public void atualizarCursos() {
        CursoDAO cursoDAO = new CursoDAO();
        helper.popularCursos(cursoDAO.getCursos());
    }
}
