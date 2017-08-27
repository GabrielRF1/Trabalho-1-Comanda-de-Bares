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
    protected Map<Integer, Comanda> comandas; //arrumar:
                                              //Mapa de comanda é inconsistente, visto que
                                              //1-Apenas o funcionário q abriu uma comanda poderá atender aquela mesa
                                              //2-se o funcionário que abriu a comanda não for o gerente, não será possível fechar a comanda
                                              //nem receber paamento

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
        comandas.put(cliente.getMesa(), c);
    }

    public void adicionarPedido(int mesa, Pedido pe) {
        Comanda c = comandas.get(mesa);
        c.addPedido(pe);
        comandas.put(mesa, c);

    }

    public void visualizarComanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
