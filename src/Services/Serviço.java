/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Hotel.Serviços;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public abstract class Serviço extends Serviços {
    static int id=0;
    String nome;
    double valor;
    int qtdDias;
    
    
    public Serviço(){
        id++;
        
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ""+getClass().getName()+"+"+valor; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
