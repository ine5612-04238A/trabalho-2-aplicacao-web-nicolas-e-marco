/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author martin
 */
@Entity
public class Funcionario extends Usuario {
    public Funcionario(String nome, String email, String senha, String tipoUsuario) {
        super(nome, email, senha, tipoUsuario);
    }
   
    
}
