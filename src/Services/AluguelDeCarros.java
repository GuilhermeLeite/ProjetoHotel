/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class AluguelDeCarros extends Serviço{
    String tipo="";
    boolean tanqueCheio;
    boolean seguro;
    int qtdDias;

    public AluguelDeCarros(boolean tanqueCheio, boolean seguro, int qtdDias) {
        this.tanqueCheio = tanqueCheio;
        this.seguro = seguro;
        this.qtdDias = qtdDias;
        super.addServiço(this);
    }

    @Override
    public String toString() {
        String fim = "";
        
            fim += this.getClass().getName()+"|"+isSeguro()+"|"+isTanqueCheio()+"|"+getValor()+"|"+getTipo()+"|"+getQtdDias();
            //fim.concat(";");
        
        if (fim != null && fim.length() > 0 && fim.charAt(fim.length() - 1) == ';') {
            fim = fim.substring(0, fim.length() - 1);
        }
        
        return fim; //To change body of generated methods, choose Tools | Templates.
    }

    public double getValor(){
        if(getTipo().equalsIgnoreCase("luxo")){
            valor+=100;
        }else{
            valor+=60;
        }            
        if(isSeguro())
            valor+=200;
            
        if(isTanqueCheio())
            valor+=250;
                
        return valor;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTanqueCheio() {
        return tanqueCheio;
    }

    public void setTanqueCheio(boolean tanqueCheio) {
        this.tanqueCheio = tanqueCheio;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
