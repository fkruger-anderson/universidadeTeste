/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ander
 */
public class Curso {
    private final String codCurso;
    private final String nome;
    
    private static int contadorCurso = 0;

    public Curso(String nome) {
        this.codCurso = "C" + ++contadorCurso;
        this.nome = nome;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", getCodCurso(), getNome());
    }
}