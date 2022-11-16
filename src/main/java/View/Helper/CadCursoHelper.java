/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Curso;
import View.CadCursoView;

/**
 *
 * @author ander
 */
public class CadCursoHelper {
    private final CadCursoView view;

    public CadCursoHelper(CadCursoView view) {
        this.view = view;
    }

    public Curso obterModelo() {
        String nomeCurso = view.getTfNomeCurso().getText();
        
        return new Curso(nomeCurso);
    }

    public void limparTela() {
        view.getTfNomeCurso().setText("");
    }

    public void mostrarMensagem(String message) {
        view.exibirMensagem(message);
    }   
}