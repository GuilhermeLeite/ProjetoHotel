/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.util.ArrayList;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public abstract class Hóspedes {
    static ArrayList<Hóspede> hóspedes = new ArrayList();

    public static ArrayList<Hóspede> getHóspedes() {
        return hóspedes;
    }

    public static void addHóspede(int i,Hóspede h) {
        if(h==null){
            Hóspede e = new Hóspede(i);
            Hóspedes.hóspedes.add(e);
        }
        else{
            Hóspede.setId(i);
            Hóspedes.hóspedes.add(h);
        }
        
        
    }
    
    
}
