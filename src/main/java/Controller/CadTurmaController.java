/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Curso;
import Model.DAO.CursoDAO;
import Model.DAO.ProfessorDAO;
import Model.DAO.TurmaDAO;
import Model.Professor;
import Model.Turma;
import View.CadTurmaView;
import View.Helper.CadTurmaHelper;
import java.util.List;

/**
 *
 * @author ander
 */
public class CadTurmaController {
    private final CadTurmaHelper helper;

    public CadTurmaController(CadTurmaView view) {
        this.helper = new CadTurmaHelper(view);
    }

    public void cadastrarTurma() {
        Turma turma = helper.obterModelo();
        
        TurmaDAO turmaDAO = new TurmaDAO();
        turmaDAO.addTurma(turma);
        helper.limparTela();
        helper.mostrarMensagem("Turma cadastrada.");
    }

    public void atualizarProfessores() {
        ProfessorDAO professorDAO = new ProfessorDAO();
        List<Professor> professores = professorDAO.getProfessores();
        
        helper.popularProfessores(professores);        
    }

    public void atualizarCursos() {
        CursoDAO cursoDAO = new CursoDAO();
        List<Curso> cursos = cursoDAO.getCursos();
        
        helper.popularCursos(cursos);      
    }   
}