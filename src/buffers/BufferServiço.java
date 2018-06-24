/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buffers;

import java.util.List;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class BufferServiço {
    public static int idNovoServiço(List<String> l){
        int id = 0;
        String[] comp;
        int t =  l.size();
        if(t!=0){
            comp = l.get(t-1).split("\\;");
            id= Integer.parseInt(comp[0]);
            id++;
        } 
        return id;
    }
    
     public static List<String> fecharServiço(List<String> l, String u){      
         //IMPORTANTE
         
        String[] comp;
        int t = 0;
        while (t < l.size()) {
            comp = l.get(t).split("\\;");
            if (comp[1].equals(u)) {
                l.remove(t);
                break;
            }
            t++;
        }
        return l;
    }
     
    
     public static List<String> editarServiço(List<String> l, String id, String novo){      
        String[] comp;
        int t = 0;
        while (t < l.size()) {
            comp = l.get(t).split("\\;");
            if (comp[0].equals(id)) {
                l.set(t, novo);
                break;              
            }
            t++;
        }
        return l;
    }
     
     public static boolean verificarServiço(List<String> l, String id){      
        boolean b=true;
        String[] comp;
        int t = 0;
        while (t < l.size()) {
            comp = l.get(t).split("\\;");
            if (comp[0].equals(id)) {
                b=false;
                break;              
            }
            t++;
        }
        return b;
    }
}
