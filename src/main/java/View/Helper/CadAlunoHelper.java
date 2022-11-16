/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Aluno;
import View.CadAlunoView;

/**
 *
 * @author ander
 */
public class CadAlunoHelper {
    private final CadAlunoView view;

    public CadAlunoHelper(CadAlunoView view) {
        this.view = view;
    }

    public Aluno obterModelo() {
        String nome = view.getTfNome().getText();
        String CPF = view.getTfCPF().getText();
        
        return new Aluno(nome, CPF);
    }

    public void mostrarMensagem(String message) {
        view.exibirMensagem(message);
    }

    public void limparTela() {
        view.getTfNome().setText("");
        view.getTfCPF().setText("");
    }
}