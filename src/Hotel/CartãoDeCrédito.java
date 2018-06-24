/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class CartãoDeCrédito {
    String numCartao = "";
    String bandeiraCartao = "";
    String expDate = "";

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        String fim = "";
        fim = getNumCartao() + "|" + getBandeiraCartao() + "|" + getExpDate();
        return fim;
    }
    
    
    
}
