/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ander
 */
public class Aluno extends Pessoa {
    private final String matricula;
    
    private static int contadorAluno = 0;

    public Aluno(String nome, String CPF) {
        super(nome, CPF);
        this.matricula = "A" + ++contadorAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", getMatricula(), super.getNome());
    }
}