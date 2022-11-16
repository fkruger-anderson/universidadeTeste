/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.CadAlunoView;
import View.CadCursoView;
import View.CadProfessorView;
import View.CadTurmaView;
import View.MatricularAlunoView;
import View.ReAlunosCursoView;
import View.ReAlunosTurmaView;
import View.ReTurmasAlunoView;

/**
 *
 * @author ander
 */
public class MenuController {

    public void navegarCadAluno() {
        CadAlunoView cadAlunoView = new CadAlunoView();
        cadAlunoView.setVisible(true);
    }

    public void navegarCadCurso() {
        CadCursoView cadCursoView = new CadCursoView();
        cadCursoView.setVisible(true);
    }

    public void navegarCadProfessor() {
        CadProfessorView cadProfessorView = new CadProfessorView();
        cadProfessorView.setVisible(true);
    }

    public void navegarCadTurma() {
        CadTurmaView cadTurmaView = new CadTurmaView();
        cadTurmaView.setVisible(true);
    }   

    public void navegarMatricularAluno() {
        MatricularAlunoView matricularAlunoView = new MatricularAlunoView();
        matricularAlunoView.setVisible(true);
    }

    public void navegarReAlunosTurma() {
        ReAlunosTurmaView reAlunosTurmaView = new ReAlunosTurmaView();
        reAlunosTurmaView.setVisible(true);
    }

    public void navegarReAlunosCurso() {
        ReAlunosCursoView reAlunosCursoView = new ReAlunosCursoView();
        reAlunosCursoView.setVisible(true);
    }

    public void navegarReTurmasAluno() {
        ReTurmasAlunoView reTurmasAlunoView = new ReTurmasAlunoView();
        reTurmasAlunoView.setVisible(true);
    }
}
