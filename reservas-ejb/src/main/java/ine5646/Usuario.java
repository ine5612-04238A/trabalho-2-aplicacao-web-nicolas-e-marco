/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable {
    @Id
    private String email;
    private String nome;
    private String senha;
    private String tipoUsuario;
    protected ArrayList<Integer> codigosReserva;

    public Usuario(String nome, String email, String senha, String tipoUsuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.codigosReserva = new ArrayList();
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Integer> getCodigosReserva() {
        return codigosReserva;
    }

    public void setCodigosReserva(ArrayList<Integer> codigosReserva) {
        this.codigosReserva = codigosReserva;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    

   
}
