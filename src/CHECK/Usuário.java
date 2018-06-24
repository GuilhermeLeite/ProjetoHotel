/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHECK;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class Usuário {
    private String login;
    private String senha;
    public static int id=0;
    private int code = 0;

    public Usuário(String login, String senha) {
        id++;
        setCode(id);
        setLogin(login);
        setSenha(senha);
        System.out.println("novo id "+getId());
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        
        Usuário.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
    
}
