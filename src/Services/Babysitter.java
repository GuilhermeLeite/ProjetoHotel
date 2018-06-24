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
public class Babysitter extends Serviço{
    int horasNormais;
    int horasDobradas;

    public int getHorasNormais() {
        return horasNormais;
    }

    public void setHorasNormais(int horasNormais) {
        this.horasNormais = horasNormais;
    }

    public int getHorasDobradas() {
        return horasDobradas;
    }

    public void setHorasDobradas(int horasDobradas) {
        this.horasDobradas = horasDobradas;
    }

    public Babysitter(int horasNormais, int horasDobradas) {
        this.horasNormais = horasNormais;
        this.horasDobradas = horasDobradas;
    }

    public double getValor() {
        valor=((90*horasDobradas)+(45*horasNormais))*qtdDias;
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        
            fim += this.getClass().getName()+"|"+getHorasDobradas()+"|"+getHorasNormais()+"|"+getValor()+"|"+getQtdDias();
            //fim.concat(";");
        
        if (fim != null && fim.length() > 0 && fim.charAt(fim.length() - 1) == ';') {
            fim = fim.substring(0, fim.length() - 1);
        }
        
        return fim;
    }
    
    
    
    
    
}
