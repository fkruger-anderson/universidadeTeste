/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class Turma {
    private final String codTurma;
    private final Curso curso;
    private final Professor professor;
    private final String nomeDisciplina;
    private final int qtdVagas;
    private final List<Aluno> alunosMatriculados;
    
    private static int contadorTurma = 0;

    public Turma(Curso curso, Professor professor, String nomeDisciplina, int qtdVagas) {
        this.codTurma = "T" + ++contadorTurma;
        this.curso = curso;
        this.professor = professor;
        this.nomeDisciplina = nomeDisciplina;
        this.qtdVagas = qtdVagas;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getCodTurma() {
        return codTurma;
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%d)", getCodTurma(), getNomeDisciplina(), getQtdVagas());
    }
}