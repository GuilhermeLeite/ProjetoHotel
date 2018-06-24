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
public class SuítePresidencial extends Quartos {
    int maxPessoas = 4;
    float valorDiaria = 1200;
    static int totalDisponivel = 5;//total disponivel no momento
    boolean possuiHomeTheater = true;
    int camaAdicional = 0;
    final int maxDisponivel = 5; //o maximo que pode ficar disponivel
    
    static ArrayList<SuítePresidencial> a = new ArrayList<>();

    public SuítePresidencial() {
        super.addQuarto(this);
        totalDisponivel--;
    }

    
    
    
    
    
    
}
