/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import Services.Serviço;
import java.util.ArrayList;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class Serviços {
    Contrato c;
    ArrayList<Serviço> s = new ArrayList<>();
    
    public static int idServiços=0;

    public static int getIdServiço() {
        return idServiços;
    }

    public static void setIdServiço(int idServiço) {
        Serviços.idServiços = idServiço;
    }
    
    public void addServiço(Serviço se){
        s.add(se);
    }

    public Serviços() {
        System.out.println(":::"+this.toString());
        System.out.println(":::::"+s.size());
    }

    public Contrato getC() {
        return c;
    }

    public void setC(Contrato c) {
        this.c = c;
    }
    
    
    
    @Override
    public String toString() {
        String fim=""+getIdServiço()+";";
        
        for(Serviço e : s){
            fim+=e.toString();
        }
        if (fim != null && fim.length() > 0 && fim.charAt(fim.length() - 1) == '+') {
            fim = fim.substring(0, fim.length() - 1);
        }
        
        return fim;
        
    }
    
    public int getNumServiços(){
        int fim=0;
        for(Serviço e : s){
            if(e!=null){
                fim++;
            }
        }
        return fim;
    }
    
    
}
