/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class ExecutivoDuplo extends Quartos{
    float valorDiaria = 385;
    static int totalDisponivel = 15;
    int maxPessoas = 2;
    boolean possuiHomeTheater = false;    
    int camaAdicional = 0; //a ser setado
    final int maxDisponivel = 15;
    
    static ArrayList<ExecutivoDuplo> a = new ArrayList<>();

    public ExecutivoDuplo() {
        super.addQuarto(this);
        totalDisponivel--;
    }
    
        
    
}
