package Comparator;


import Model.Aluno;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ander
 */
public class AlunoByCPFComparator implements Comparator<Aluno>{ 
    
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getCPF().compareTo(o2.getCPF());
    }
}