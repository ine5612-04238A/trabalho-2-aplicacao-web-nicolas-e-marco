/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import static ine5646.ViagemOnibus_.id;
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
    public Usuario buscar(String nome){
        return this.em.find(Usuario.class, nome);
    }

    @Override
    public void gravarViagem(ViagemOnibus viagem) {
        this.em.persist(viagem);
    }
    
    public List<ViagemOnibus> retornarListaViagens() {
        return this.em.createNamedQuery("Viagens.findAll").getResultList();
    }

    @Override
    public ViagemOnibus buscar(int id) {
        return this.em.find(ViagemOnibus.class, id);
    }

    @Override
    public void updateReserva(int id) {        
        ViagemOnibus e2 = this.em.find(ViagemOnibus.class, id);
        e2.setNumReservas(e2.numReservas-1);
        em.merge(e2);
        
    }
}
