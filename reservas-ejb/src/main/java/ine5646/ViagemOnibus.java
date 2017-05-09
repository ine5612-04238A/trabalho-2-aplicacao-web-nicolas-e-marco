/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

/**
 *
 * @author HOME
 */
public class ViagemOnibus {
    protected String data;
    protected String horario;
    protected String cidadeDestino;
    protected String cidadeOrigem;
    protected int valor;
    protected int numReservas;

    public ViagemOnibus(String data, String horario, String cidadeDestino, String cidadeOrigem, int valor, int numReservas) {
        this.data = data;
        this.horario = horario;
        this.cidadeDestino = cidadeDestino;
        this.cidadeOrigem = cidadeOrigem;
        this.valor = valor;
        this.numReservas = numReservas;
    }

    public ViagemOnibus() {
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
    
    
    
}
