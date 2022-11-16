/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Curso;
import Model.Turma;
import View.ReTurmasAlunoView;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ander
 */
public class ReTurmasAlunoHelper {
    private final ReTurmasAlunoView view;

    public ReTurmasAlunoHelper(ReTurmasAlunoView view) {
        this.view = view;
    }

    public String pegarMatricula() {
        return view.getTfMatriculaAluno().getText();
    }

    public Curso pegarCurso() {
        return (Curso) view.getCbCurso().getSelectedItem();
    }

    public void popularTaTurmas(List<Turma> turmasAluno) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTaTumas().getModel();
        tableModel.setNumRows(0);
        
        for (Turma turma : turmasAluno) {
            tableModel.addRow(new Object[] {
                turma.getCodTurma(),
                turma.getNomeDisciplina(),
                turma.getProfessor().getNome(),
                turma.getCurso().getNome()
            });
        }
    }

    public void popularCursos(List<Curso> cursos) {
        view.getCbCurso().removeAllItems();
        cursos.forEach(c -> view.getCbCurso().addItem(c));
    }
}