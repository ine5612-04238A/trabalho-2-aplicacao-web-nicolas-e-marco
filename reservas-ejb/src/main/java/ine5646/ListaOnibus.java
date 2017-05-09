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
public class ListaOnibus {
    protected ViagemOnibus[] lista;

    public ListaOnibus(ViagemOnibus[] lista) {
        this.lista = lista;
    }

    public ListaOnibus() {
    }

    public ViagemOnibus[] getLista() {
        return lista;
    }

    public void setLista(ViagemOnibus[] lista) {
        this.lista = lista;
    }
    
}
