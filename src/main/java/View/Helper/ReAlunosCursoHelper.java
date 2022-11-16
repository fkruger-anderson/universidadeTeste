/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Aluno;
import Model.Curso;
import View.ReAlunosCursoView;
import java.util.List;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ander
 */
public class ReAlunosCursoHelper {
    private final ReAlunosCursoView view;

    public ReAlunosCursoHelper(ReAlunosCursoView view) {
        this.view = view;
    }
    
    public void popularCursos(List<Curso> cursos) {
        view.getCbCurso().removeAllItems();
        cursos.forEach(c -> view.getCbCurso().addItem(c));
    }
    
    public void popularTableAlunos(Set<Aluno> alunos) {
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

    public Curso pegarCurso() {
        return (Curso) view.getCbCurso().getSelectedItem();
    }
}