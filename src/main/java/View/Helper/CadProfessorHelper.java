/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Professor;
import View.CadProfessorView;

/**
 *
 * @author ander
 */
public class CadProfessorHelper {
    private final CadProfessorView view;

    public CadProfessorHelper(CadProfessorView view) {
        this.view = view;
    }

    public Professor obterModelo() {
        String nome = view.getTfNome().getText();
        String CPF = view.getTfCPF().getText();
        String dataAdmissao = view.getTfDataAdmissao().getText();
        
        return new Professor(dataAdmissao, nome, CPF);
    }  

    public void limparTela() {
        view.getTfNome().setText("");
        view.getTfCPF().setText("");
        view.getTfDataAdmissao().setText("");
    }

    public void mostrarMensagem(String message) {
        view.exibirMensagem(message);
    }
}