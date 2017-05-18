/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import javax.ejb.EJB;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author HOME
 */
@ManagedBean
@RequestScoped
public class managerReserva implements Serializable{

    
    @EJB
    protected EJBLocal ejb;
    
    protected int id;
    
    public EJBLocal getEjb() {
        return ejb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void reservar(){
        if(this.ejb.verificarViagem(id)){
            this.ejb.updateReserva(id);
            FacesMessage msg = new FacesMessage("Reserva feita");
            FacesContext.getCurrentInstance().addMessage("erro", msg);
        }
        else{
            FacesMessage msg = new FacesMessage("Reserva não cadastrada");
            FacesContext.getCurrentInstance().addMessage("erro", msg);
        }
    }
    
}