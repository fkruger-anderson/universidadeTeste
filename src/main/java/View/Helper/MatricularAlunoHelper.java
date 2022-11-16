/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Aluno;
import Model.Curso;
import Model.Turma;
import View.MatricularAlunoView;
import java.util.List;

/**
 *
 * @author ander
 */
public class MatricularAlunoHelper {
    private final MatricularAlunoView view;

    public MatricularAlunoHelper(MatricularAlunoView view) {
        this.view = view;
    }

    public void popularCursos(List<Curso> cursos) {
        view.getCbCurso().removeAllItems();
        cursos.forEach(c -> view.getCbCurso().addItem(c));
    }

    public void popularAlunos(List<Aluno> alunos) {
        view.getCbAluno().removeAllItems();
        alunos.forEach(a -> view.getCbAluno().addItem(a));
    }

    public Curso pegarCurso() {
        return (Curso) view.getCbCurso().getSelectedItem();
    }

    public void popularTurmas(List<Turma> turmasCurso) {
        view.getCbTurma().removeAllItems();
        turmasCurso.forEach(t -> view.getCbTurma().addItem(t));
    }

    public Aluno pegarAluno() {
        return (Aluno) view.getCbAluno().getSelectedItem();
    }

    public Turma pegarTurma() {
        return (Turma) view.getCbTurma().getSelectedItem();
    }
}