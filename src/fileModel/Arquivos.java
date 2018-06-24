/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class Arquivos {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    private File f;

    public Arquivos(String nome) {
        try {
            this.f = new File("src/arquivos/" + nome + ".txt");
            this.f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public File getFile() {
        return f;
    }

    public boolean novoDado(File path, String conteudo) {
        boolean b = false;
        try {
            FileWriter escritor = new FileWriter(path, true);
            escritor.write(conteudo + "\n");
            escritor.close();
            b = true;
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    public List<String> lerArquivo(File path) {
        List<String> texto = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader(path);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();
            while (linha != null) {
                texto.add(linha);
                linha = leitor.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return texto;
    }
    
    public boolean regravarDados(File path, List<String> lista) {
        boolean b = false;
        int i=0;
        StringBuilder texto= new StringBuilder();
        FileWriter escritor;
        try {
            escritor = new FileWriter(path, false);
            PrintWriter pw = new PrintWriter(escritor);
           
            while(i<lista.size()){
                texto.append(lista.get(i)).append("\n");
                i++;
            }
            pw.print(texto);
            escritor.close();
            b = true;
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }
}


