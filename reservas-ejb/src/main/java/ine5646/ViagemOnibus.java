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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
    @NamedQuery(name = "Viagens.findAll",
            query = "SELECT v FROM ViagemOnibus v")
})

public class ViagemOnibus implements Serializable {    


    @Id
    protected String dataViagem;
    protected String horario;
    protected String cidadeDestino;
    protected String cidadeOrigem;
    protected int valor;
    protected int numReservas;

    public ViagemOnibus(String data, String horario, String cidadeDestino, String cidadeOrigem, int valor, int numReservas) {
        this.dataViagem = data;
        this.horario = horario;
        this.cidadeDestino = cidadeDestino;
        this.cidadeOrigem = cidadeOrigem;
        this.valor = valor;
        this.numReservas = numReservas;
    }

    public ViagemOnibus() {
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
    
    
    
}
