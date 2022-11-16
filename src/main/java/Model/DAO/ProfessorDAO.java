/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class ProfessorDAO {
    private static final List<Professor> professores = new ArrayList<>();

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> getProfessores() {
        return professores;
    }
    public Professor buscarProfessorMatricula(String matriculaProfessor) {
        return professores.stream()
                          .filter(a -> a.getMatricula().equalsIgnoreCase(matriculaProfessor))
                          .findFirst()
                          .orElse(null);
    }
    
    public Professor buscarProfessorCPF(String CPF) {
        return professores.stream()
                          .filter(a -> a.getCPF().equalsIgnoreCase(CPF))
                          .findFirst()
                          .orElse(null);
    }
    
}
