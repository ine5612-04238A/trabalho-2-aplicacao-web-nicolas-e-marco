/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import javax.ejb.Local;

/**
 *
 * @author martin
 */
@Local
public interface EJBLocal {
    public void gravar(Usuario usuario);
    public Usuario buscar(String nome);
}