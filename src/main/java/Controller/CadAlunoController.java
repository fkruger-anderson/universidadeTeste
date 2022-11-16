/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exceptions.UniversidadeException;
import Model.Aluno;
import Model.DAO.AlunoDAO;
import View.CadAlunoView;
import View.Helper.CadAlunoHelper;

/**
 *
 * @author ander
 */
public class CadAlunoController {
    private final CadAlunoHelper helper;

    public CadAlunoController(CadAlunoView view) {
        this.helper = new CadAlunoHelper(view);
    }

    public void cadastrarAluno() throws UniversidadeException {
        Aluno aluno = helper.obterModelo();
        
        AlunoDAO alunoDAO = new AlunoDAO();
        if (alunoDAO.buscarAlunoCPF(aluno.getCPF()) != null) {
            throw new UniversidadeException("Aluno já cadastrado");
        }
        
        alunoDAO.addAluno(aluno);
        helper.limparTela();
        helper.mostrarMensagem("Aluno cadastrado");
    }
}