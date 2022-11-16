/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aluno;
import Model.Curso;
import Model.DAO.CursoDAO;
import Model.DAO.TurmaDAO;
import Model.Turma;
import View.Helper.ReAlunosCursoHelper;
import View.ReAlunosCursoView;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author ander
 */
public class ReAlunosCursoController {
    private final ReAlunosCursoHelper helper;

    public ReAlunosCursoController(ReAlunosCursoView view) {
        this.helper = new ReAlunosCursoHelper(view);
    }

    public void alunosMatriculadosCurso() {
        Curso curso = helper.pegarCurso();
        
        TurmaDAO turmaDAO = new TurmaDAO();
        Set<Aluno> alunosCurso = turmaDAO.getTurmas()
                                         .stream()
                                         .filter(t -> t.getCurso().equals(curso))
                                         .map(Turma::getAlunosMatriculados)
                                         .flatMap(Collection::stream)
                                         .collect(Collectors.toSet());
        
        helper.popularTableAlunos(alunosCurso);
    }

    public void atualizarCursos() {
        CursoDAO cursoDAO = new CursoDAO();
        
        List<Curso> cursos = cursoDAO.getCursos();
        helper.popularCursos(cursos);
    }
}