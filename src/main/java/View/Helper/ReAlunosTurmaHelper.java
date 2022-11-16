/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Aluno;
import Model.Curso;
import Model.Turma;
import View.ReAlunosTurmaView;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ander
 */
public class ReAlunosTurmaHelper {
    private final ReAlunosTurmaView view;

    public ReAlunosTurmaHelper(ReAlunosTurmaView view) {
        this.view = view;
    }

    public Curso obterCurso() {
        return (Curso) view.getCbCurso().getSelectedItem();
    }

    public void popularTurmas(List<Turma> turmasCurso) {
        view.getCbTurma().removeAllItems();
        turmasCurso.forEach(t -> view.getCbTurma().addItem(t));
    }
    
    public void popularCursos(List<Curso> cursos) {
        view.getCbCurso().removeAllItems();
        cursos.forEach(c -> view.getCbCurso().addItem(c));
    }
    
    public void popularTableAlunos(List<Aluno> alunos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTaAlunos().getModel();
        tableModel.setNumRows(0);
        
        for (Aluno aluno : alunos) {
            tableModel.addRow(new Object[] {
                aluno.getMatricula(),
                aluno.getNome(),
                aluno.getCPF()
            });
        }
    }

    public Turma pegarTurma() {
        return (Turma) view.getCbTurma().getSelectedItem();
    }
}