/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import static ine5646.ViagemOnibus_.id;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author martin
 */
@Stateless
public class EJB implements EJBLocal {

    @PersistenceContext
    private EntityManager em;
   
    @Override
    public void gravar(Usuario usuario){
        this.em.persist(usuario);
    }
        @Override
    public Usuario buscarEmail(String email) {
        return this.em.find(Usuario.class, email);
    }

    @Override
    public void gravarViagem(ViagemOnibus viagem) {
        this.em.persist(viagem);
    }
    
    @Override
    public List<ViagemOnibus> retornarListaViagens() {
        return this.em.createNamedQuery("Viagens.findAll").getResultList();
    }

    @Override
    public ViagemOnibus buscarViagem(int id) {
        return this.em.find(ViagemOnibus.class, id);
    }

    @Override
    public void updateReserva(int id) {
            ViagemOnibus e2 = this.em.find(ViagemOnibus.class, id);
            e2.setNumReservas(e2.numReservas-1);
            em.merge(e2);
    }

    @Override
    public boolean verificarViagem(int id) {
        if(this.buscarViagem(id)!=null){
           if(this.buscarViagem(id).getNumReservas()>0){
            return true;
        }
    } return false;

    }
    
    @Override
    public boolean verificarReservaJaRealizada(String email, int id) {
        Usuario u2 = this.em.find(Usuario.class, email);
        return u2.getCodigosReserva().contains(id);
        
    }
    
    @Override
    public void reservaUsuario(String email, int id) {
        Usuario u2 = this.em.find(Usuario.class, email);
        u2.getCodigosReserva().add(id);
        em.merge(u2);    
    }

    @Override
    public boolean verificarEmail(String email) {
          if(this.buscarEmail(email)!=null){
            return true;
    } return false;
    }

    @Override
    public ArrayList<Integer> retornarListaReservas(String email) {
        Usuario u2 = this.em.find(Usuario.class, email);
        return u2.getCodigosReserva();
    }

    @Override
    public void excluirReserva(String email, int id) {
        Usuario u2 = this.em.find(Usuario.class, email);
        for (int i = 0; i < u2.getCodigosReserva().size(); i++) {
            if (u2.getCodigosReserva().get(i).compareTo(id)==0) {
                u2.getCodigosReserva().remove(i);
                em.merge(u2); 
            }
        }
    }
}
