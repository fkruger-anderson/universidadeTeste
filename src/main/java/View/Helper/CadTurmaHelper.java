/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Curso;
import Model.Professor;
import Model.Turma;
import View.CadTurmaView;
import java.util.List;

/**
 *
 * @author ander
 */
public class CadTurmaHelper {
    private final CadTurmaView view;

    public CadTurmaHelper(CadTurmaView view) {
        this.view = view;
    }

    public Turma obterModelo() {
        Professor professor = (Professor) view.getCbProfessor().getSelectedItem();
        Curso curso = (Curso) view.getCbCurso().getSelectedItem();
        String nomeDisciplina = view.getTfNomeDisciplina().getText();
        int qtd = Integer.parseInt(view.getTfQtdVagas().getText());
        
        return new Turma(curso, professor, nomeDisciplina, qtd);
    }

    public void popularCursos(List<Curso> cursos) {
        cursos.forEach(c -> view.getCbCurso().addItem(c));
    }

    public void popularProfessores(List<Professor> professores) {
        professores.forEach(p -> view.getCbProfessor().addItem(p));
    }

    public void mostrarMensagem(String message) {
        view.exibirMensagem(message);
    }

    public void limparTela() {
        view.getCbProfessor().setSelectedIndex(0);
        view.getCbCurso().setSelectedIndex(0);
        view.getTfNomeDisciplina().setText("");
        view.getTfQtdVagas().setText("");
    }
}