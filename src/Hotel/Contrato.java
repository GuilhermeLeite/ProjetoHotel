/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import fileModel.Arquivos;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class Contrato extends Contratos {
    Hóspede hospede = null;
    Serviços s = new Serviços();
    //criar arraylist de quartos separado, através de arquivos
    
    
    Arquivos arq;
    List<String> lista1;
    Calendar dataInicial;
    Calendar dataFinal;
    Tarifa tarifa = null;
    CartãoDeCrédito cartão = null;
    boolean estadoDoContrato = false; //onde false é um contrato aberto, um contrato fechado não pode ser alterado
    static int id =0;
    int code =0;
    
    
    Contrato(Hóspede hóspede, int i){
        arq = new Arquivos("contratos");
        File arquivo = arq.getFile();
        lista1 = arq.lerArquivo(arquivo);
        setId(i);
        setCode(id);
        setCartão(new CartãoDeCrédito());
        setS(s);
        setHospede(hóspede);
        setTarifa(new Tarifa());
        
        System.out.println(""+this.toString());
        
        arq.novoDado(arquivo, this.toString());
        setEstadoDoContrato();
        //to do
    }

    public Contrato(Hóspede hóspede, int i,String n){
        n="";
        arq = new Arquivos("contratos");
        File arquivo = arq.getFile();
        lista1 = arq.lerArquivo(arquivo);
        setId(i);
        setCode(id);
        setCartão(new CartãoDeCrédito());
        setS(s);
        setHospede(hóspede);
        setTarifa(new Tarifa());
        setEstadoDoContrato();
        System.out.println(""+this.toString());
    }

    
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Contrato.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Serviços getS() {
        return s;
    }

    public void setS(Serviços s) {
        s.setC(this);
        this.s = s;
    }
    
    public Hóspede getHospede() {
        return hospede;
    }

    public void setHospede(Hóspede hospede) {
        this.hospede = hospede;
    }

    
    public Calendar getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public CartãoDeCrédito getCartão() {
        return cartão;
    }

    public void setCartão(CartãoDeCrédito cartão) {
        this.cartão = cartão;
    }

    public boolean isEstadoDoContrato() {
        return estadoDoContrato;
    }
    
    public String getEstadoDoContrato(){
        if(isEstadoDoContrato()==true){
            return "Fechado";
        }
        else{
            return "Aberto";
        }
    }

    public void setEstadoDoContrato() {
        
        System.out.println(""+lista1.toString());
        
            String x = lista1.get(getCode());
            System.out.println(""+x);
            if(x.contains("Aberto")||x.contains("aberto")){
                        estadoDoContrato = false;
                    }else if(x.contains("Fechado")||x.contains("fechado")){
                        estadoDoContrato = true;
                    }
            
            
        
        
        System.out.println(""+this.getEstadoDoContrato());
    }

    @Override
    public String toString() {
        String fim;
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	//String date = sdf.format(getDataCadastro().getTime()); 
	//System.out.println(date);
        fim = ""+ getCode() + ";" + getEstadoDoContrato()+";"+getHospede().getCode()+ ";" + getHospede().getNome()+ ";"
                +  getDataInicial()+ ";" + getDataFinal()+ ";" + getCartão()+ ";" 
                + getTarifa().getTipoTarifa()+ ";"+ getS().getNumServiços()+ ";"+getS().getIdServiço();
        //fim = getId() + ";" + nome + ";" + cpf + ";"+ rg + ";"+ sexo + ";" + email + ";"  + telefone;
        return fim;
    }
    
    
    
}
