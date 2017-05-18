/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author martin
 */
@Local
public interface EJBLocal {
    public void gravar(Usuario usuario);
    public Usuario buscarEmail(String email);
    public void gravarViagem (ViagemOnibus viagem);
    public List<ViagemOnibus> retornarListaViagens();
    public ViagemOnibus buscarViagem(int id);
    public void updateReserva(int id);    
    public boolean verificarViagem(int id);
    }
