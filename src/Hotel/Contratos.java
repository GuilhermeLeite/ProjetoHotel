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
public abstract class Contratos {
    static ArrayList<Contrato> contratos = new ArrayList();

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public static void addContrato(int i, Contrato c){
        if(c==null){
            Contrato d = new Contrato(null,i);
            contratos.add(d);
        }
        else{
            c.setId(i);
            contratos.add(c);
        }
        
    }
    
}
