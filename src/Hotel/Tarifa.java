/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class Tarifa {
    public Calendar dataAtual = Calendar.getInstance();
    boolean isReveillon, isNatal, isSãoJoão, isAltaEstação, isNormal;
    double valor;
    
    Tarifa(){
        calculoTarifa();
    }
    
    public void calculoTarifa(){
        getDataAtual();
        getTipoTarifa();
    }
    
    
    public double getValorTarifa(){
        
        
        return valor;
    }
    
    public String getTipoTarifa(){
        String fim="";
        if(!isIsAltaEstação()){
            fim = "Normal";
            valor=0;
        }else{
            fim = "Alta";
            valor = 25/100;
        }
        
        return fim;
    }
    
    
    
    //metodos de calculo de tarifa baseados na data atual

    public Calendar getDataAtual() {
        
        return dataAtual;
    }

    public boolean isIsReveillon() {
        
        isReveillon = dataAtual.get(Calendar.MONTH)==Calendar.JANUARY;
        return isReveillon;
    }

    public boolean isIsNatal() {
        isNatal = dataAtual.get(Calendar.MONTH)==Calendar.DECEMBER;
        return isNatal;
    }

    public boolean isIsSãoJoão() {
        isSãoJoão = dataAtual.get(Calendar.MONTH)==Calendar.JUNE;
        return isSãoJoão;
    }

    public boolean isIsAltaEstação() {
        isAltaEstação = !isIsNormal();
        return isAltaEstação;
    }

    public boolean isIsNormal() {
        isNormal = !(isIsSãoJoão() && isIsNatal()&&isIsReveillon());
        return isNormal;
    }
}
