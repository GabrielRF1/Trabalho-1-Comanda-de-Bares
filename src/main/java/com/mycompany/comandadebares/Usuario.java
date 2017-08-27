/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Programação
 */
public class Usuario implements Serializable {

    private String nome, log;
    private Map<String, Comanda> comandas;

    public Usuario(String nome, String log) {
        this.nome = nome;
        this.log = log;
        comandas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public String getLog() {
        return log;
    }

    public void abrirComanda(Cliente cliente) {
        Comanda c = new Comanda(cliente, this);
        comandas.put(cliente.getNome(), c);
    }

    public void adicionarPedido(Cliente cliente, Pedido pe) {
        Comanda c = comandas.get(cliente.getNome());
        c.addPedido(pe);

    }

    public void visualizarComanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
