/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exceptions.UniversidadeException;
import Model.DAO.ProfessorDAO;
import Model.Professor;
import View.CadProfessorView;
import View.Helper.CadProfessorHelper;

/**
 *
 * @author ander
 */
public class CadProfessorController {
    private final CadProfessorHelper helper;

    public CadProfessorController(CadProfessorView view) {
        this.helper = new CadProfessorHelper(view);
    }

    public void cadastrarProfessor() throws UniversidadeException {
        Professor professor = helper.obterModelo();
        
        ProfessorDAO professorDAO = new ProfessorDAO();
        if (professorDAO.buscarProfessorCPF(professor.getCPF()) != null) {
            throw new UniversidadeException("Professor já cadastrado.");
        }
        professorDAO.addProfessor(professor);
        helper.limparTela();
        helper.mostrarMensagem("Professor cadastrado");
    }
}
