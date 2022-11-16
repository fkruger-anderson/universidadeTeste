/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class AlunoDAO {
    private static final List<Aluno> alunos = new ArrayList<>();
    
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public Aluno buscarAlunoMatricula(String matriculaAluno) {
        return alunos.stream()
                     .filter(a -> a.getMatricula().equalsIgnoreCase(matriculaAluno))
                     .findFirst()
                     .orElse(null);
    }
    
    public Aluno buscarAlunoCPF(String CPF) {
        return alunos.stream()
                     .filter(a -> a.getCPF().equalsIgnoreCase(CPF))
                     .findFirst()
                     .orElse(null);
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }
}
