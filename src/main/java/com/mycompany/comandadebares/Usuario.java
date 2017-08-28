/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Programação
 */
public class Usuario implements Serializable {

    private final String nome, log;
    //arrumar:
                                              //Mapa de comanda é inconsistente, visto que
                                              //1-Apenas o funcionário q abriu uma comanda poderá atender aquela mesa
                                              //2-se o funcionário que abriu a comanda não for o gerente, não será possível fechar a comanda
                                              //nem receber paamento

    public Usuario(String nome, String log) {
        this.nome = nome;
        this.log = log;
    }

    public String getNome() {
        return nome;
    }

    public String getLog() {
        return log;
    }

    public Comanda abrirComanda(Cliente cliente,Map<Integer,Comanda> mp) {
        Comanda c = new Comanda(cliente, this);
        return mp.put(cliente.getMesa(), c);
    }

    public Comanda adicionarPedido(int mesa, Pedido pe, Map<Integer,Comanda> mp) {
        Comanda c = mp.get(mesa);
        c.addPedido(pe);
        return mp.put(mesa, c);

    }

    public void visualizarComanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
