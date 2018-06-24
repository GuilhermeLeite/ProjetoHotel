/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public abstract class Quartos extends Serviço{
    
    static ArrayList<Quartos> s = new ArrayList<>();
    
    float valorDiaria;
    static int totalDisponivel;
    int maxPessoas;
    boolean possuiHomeTheater;
    int camaAdicional;
    static final int maxDisponivel = 85;        
    int qtdDias;
    
    
    
    //

    public static int getTotalDisponivel() {
        totalDisponivel = maxDisponivel - s.size();
        return totalDisponivel;
    }

    public static ArrayList<Quartos> getS() {
        return s;
    }

    public static void setS(ArrayList<Quartos> s) {
        Quartos.s = s;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getMaxPessoas() {
        return maxPessoas;
    }

    public void setMaxPessoas(int maxPessoas) {
        this.maxPessoas = maxPessoas;
    }

    public boolean isPossuiHomeTheater() {
        return possuiHomeTheater;
    }

    public void setPossuiHomeTheater(boolean possuiHomeTheater) {
        this.possuiHomeTheater = possuiHomeTheater;
    }

    public int getCamaAdicional() {
        return camaAdicional;
    }

    public void setCamaAdicional(int camaAdicional) {
        this.camaAdicional = camaAdicional;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    
    @Override
    public String toString() {
        String fim = "";
        for(Quartos q : s){
            fim += q.getClass().getName()+"|"+valorDiaria+"|"+camaAdicional+"|"+possuiHomeTheater+"|"+maxPessoas+"|"+qtdDias;
            fim.concat(";");
        }
        if (fim != null && fim.length() > 0 && fim.charAt(fim.length() - 1) == ';') {
            fim = fim.substring(0, fim.length() - 1);
        }
        
        return fim; //To change body of generated methods, choose Tools | Templates.
        
    }
    
    public void addQuarto(Quartos quarto){
        totalDisponivel --;
        s.add(quarto);
        super.addServiço(this);
    }
    
}
