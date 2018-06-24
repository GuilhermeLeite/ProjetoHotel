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
public class LuxoSimples extends Quartos{
    float valorDiaria = 520;
    static int totalDisponivel = 5;
    int maxPessoas = 1;
    boolean possuiHomeTheater = false;    
    int camaAdicional = 0;
    final int maxDisponivel = 5;
    static ArrayList<LuxoSimples> a = new ArrayList<>();
    
    public LuxoSimples() {
        super.addQuarto(this);
        totalDisponivel--;
    }
    
}
