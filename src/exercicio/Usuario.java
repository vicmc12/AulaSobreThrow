/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author 31381243
 */
public class Usuario {
    private String Name;
    private String cpf;
    private String email;

    public Usuario(String Name, String cpf, String email) {
        this.Name = Name;
        this.cpf = cpf;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Name=" + Name + ", cpf=" + cpf + ", email=" + email + '}';
    }
    

}