/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class CursoDAO {
    private static final List<Curso> cursos = new ArrayList<>();

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
