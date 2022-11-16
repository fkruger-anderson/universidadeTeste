/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Aluno;
import Model.Curso;
import Model.Professor;
import Model.Turma;

/**
 *
 * @author ander
 */
public class Banco {
    public static void inicia() {
        Aluno aluno1 = new Aluno("Anderson", "92345678912");
        Aluno aluno2 = new Aluno("Ricardo", "12345678923");
        Aluno aluno3 = new Aluno("Matheus", "12345678934");
        Aluno aluno4 = new Aluno("Gabriela", "12345678945");
        Aluno aluno5 = new Aluno("Ronan", "12345678956");
        
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.addAluno(aluno1);
        alunoDAO.addAluno(aluno2);
        alunoDAO.addAluno(aluno3);
        alunoDAO.addAluno(aluno4);
        alunoDAO.addAluno(aluno5);
        
        Professor professor1 = new Professor("15/11/2022", "Fernando", "78945612312");
        Professor professor2 = new Professor("16/11/2022", "Luana", "78945612323");
        
        ProfessorDAO professorDAO = new ProfessorDAO();
        professorDAO.addProfessor(professor1);
        professorDAO.addProfessor(professor2);
        
        Curso curso1 = new Curso("Engenharia de Software");
        CursoDAO cursoDAO = new CursoDAO();
        cursoDAO.addCurso(curso1);
        
        Turma turma1 = new Turma(curso1, professor2, "Programação 1", 3);
        Turma turma2 = new Turma(curso1, professor1, "Requisitos", 3);
        
        TurmaDAO turmaDAO = new TurmaDAO();
        turmaDAO.addTurma(turma1);
        turmaDAO.addTurma(turma2);
        
        turma1.getAlunosMatriculados().add(aluno1);
        turma1.getAlunosMatriculados().add(aluno2);
        turma1.getAlunosMatriculados().add(aluno4);
        
        turma2.getAlunosMatriculados().add(aluno1);
        turma2.getAlunosMatriculados().add(aluno4);
        turma2.getAlunosMatriculados().add(aluno5);
    }
}