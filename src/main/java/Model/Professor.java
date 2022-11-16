/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ander
 */
public class Professor extends Pessoa {
    private final String matricula;
    private final LocalDate dataAdmissao;
    
    private static int contadorProfessor = 0;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Professor(String dataAdmissao, String nome, String CPF) {
        super(nome, CPF);
        this.dataAdmissao = LocalDate.parse(dataAdmissao, dtf);
        this.matricula = "P" + ++contadorProfessor;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", getMatricula(), super.getNome());
    }
}