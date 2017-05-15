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
public class managerBus implements Serializable{

    
    @EJB
    protected EJBLocal ejb;
    
    protected String dataViagem;
    protected String horario;
    protected String cidadeDestino;
    protected String cidadeOrigem;
    protected int valor;
    protected int numReservas;
    protected int id;

   
    public EJBLocal getEjb() {
        return ejb;
    }

    public void setEjb(EJBLocal ejb) {
        this.ejb = ejb;
    }

    public String getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(String dataViagem) {
        this.dataViagem = dataViagem;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumReservas() {
        return numReservas;
    }

    public void setNumReservas(int numReservas) {
        this.numReservas = numReservas;
    }
    
     public void gravarNovaViagem() {
            ViagemOnibus viagem = new ViagemOnibus (this.dataViagem, this.horario, this.cidadeDestino, this.cidadeOrigem, this.valor, this.numReservas, this.id);
            this.ejb.gravarViagem(viagem);
            FacesMessage msg = new FacesMessage("Cadastro com sucesso");
            FacesContext.getCurrentInstance().addMessage("erro", msg);
}
     public List<ViagemOnibus> listarViagens() {
            return this.ejb.retornarListaViagens();
}
}
