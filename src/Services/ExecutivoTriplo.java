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
public class ExecutivoTriplo extends Quartos{
    float valorDiaria = 440;
    static int totalDisponivel = 20;
    int maxPessoas = 3;
    boolean possuiHomeTheater = false;    
    int camaAdicional = 0; //a ser setado
    final int maxDisponivel = 20;
    
    static ArrayList<ExecutivoTriplo> a = new ArrayList<>();
    
    public ExecutivoTriplo() {
        super.addQuarto(this);
        totalDisponivel--;
    }
    
}
