/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import javax.ejb.EJB;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author HOME
 */
@ManagedBean
@RequestScoped
public class managerBus implements Serializable{

    
   @javax.ejb.EJB
    protected EJBLocal ejb;
    
    protected String data;
    protected String horario;
    protected String cidadeDestino;
    protected String cidadeOrigem;
    protected int valor;
    protected int numReservas;

   
    public EJBLocal getEjb() {
        return ejb;
    }

    public void setEjb(EJBLocal ejb) {
        this.ejb = ejb;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
    
     public String gravarNovaViagem() {
            ViagemOnibus viagem = new ViagemOnibus (this.data, this.horario, this.cidadeDestino, this.cidadeOrigem, this.valor, this.numReservas);
            this.ejb.gravarViagem(viagem);
            return "TelaFuncionario.xhtml"; 
}
}
