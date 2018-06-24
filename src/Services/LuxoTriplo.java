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
public class LuxoTriplo extends Quartos {
    float valorDiaria = 620;
    static int totalDisponivel = 20;
    int maxPessoas = 3;
    boolean possuiHomeTheater = false;    
    int camaAdicional = 0; //a ser setado
    final int maxDisponivel = 20;
    
    static ArrayList<LuxoSimples> a = new ArrayList<>();

    public LuxoTriplo() {
        super.addQuarto(this);
        totalDisponivel--;
    }
    
    
}
