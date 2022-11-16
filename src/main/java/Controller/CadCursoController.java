/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Curso;
import Model.DAO.CursoDAO;
import View.CadCursoView;
import View.Helper.CadCursoHelper;

/**
 *
 * @author ander
 */
public class CadCursoController {
    private final CadCursoHelper helper;

    public CadCursoController(CadCursoView view) {
        this.helper = new CadCursoHelper(view);
    }

    public void cadastrarCurso() {
        Curso curso = helper.obterModelo();
        
        CursoDAO cursoDAO = new CursoDAO();
        cursoDAO.addCurso(curso);
        helper.limparTela();
        helper.mostrarMensagem("Curso cadastrado");
    }
}
