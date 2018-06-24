/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class Hóspede extends Hóspedes{
    private String nome;
    private String cpf;
    private String email;
    private String rg;
    private char sexo;
    private String telefone;
    private Calendar dataCadastro;
    private String dataNascimento;
    private Contrato contrato = null;
    private String endereço;
    private String endereço2;
    private int code = 0;
    private static int id = 0;
    
    public Hóspede(int i){
        setId(i);
        setCode(id);
        setNome(nome);
        setCpf(cpf);
        setDataCadastro();
        setDataNascimento(dataNascimento);
        setEndereço(endereço);
        setEndereço2(endereço2);
        //setContrato();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro() {
        this.dataCadastro = Calendar.getInstance();
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(int id) {
        Contrato c = new Contrato(this,id);
        Contratos.addContrato(id,c);
        this.contrato = c;
    }
    
    public void setContrato4edit(int id){
        Contrato c = new Contrato(this,id,"");
        Contratos.addContrato(id,c);
        this.contrato = c;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEndereço2() {
        return endereço2;
    }

    public void setEndereço2(String endereço2) {
        this.endereço2 = endereço2;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Hóspede.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        String fim;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String date = sdf.format(getDataCadastro().getTime()); 
	System.out.println(date);
        fim = ""+ getCode() + ";" + getNome() + ";" + getSexo()+ ";"
                +  getTelefone()+ ";" + getEmail()+ ";" + getRg() + ";" 
                + getCpf() + ";"+ getEndereço() + ";"+ getEndereço2() + ";" 
                + getDataNascimento() + ";"  + date + ";" 
                + getContrato().getCode();
        //fim = getId() + ";" + nome + ";" + cpf + ";"+ rg + ";"+ sexo + ";" + email + ";"  + telefone;
        return fim;
    }
          
    
    
    
    
    
}
