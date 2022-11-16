/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Turma;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class TurmaDAO {
    private static final List<Turma> turmas = new ArrayList<>();
    
    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}