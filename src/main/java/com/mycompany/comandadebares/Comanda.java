/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Programação
 */
public class Comanda implements Serializable {

    private boolean comandaAberta;
    private final Cliente cliente;
    private final Usuario usuario;
    private final List<Pedido> pedidos;

    public Comanda(Cliente cliente, Usuario usuario) {
        this.comandaAberta = true;
        this.cliente = cliente;
        this.usuario = usuario;
        this.pedidos = new ArrayList<>();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void fecharComanda() {
        this.comandaAberta = false;
    }

    public void addPedido(Pedido pe) {
        if (comandaAberta) {
            pedidos.add(pe);
        } else {
        }
    }

    public void matarUmPedido(Pedido pe) {
            pedidos.remove(pe);
       
    }

    public float getValorTotal(Pedido pe) {
        float valorTotal = 0;
        for (Pedido iterador : pedidos) {
            valorTotal += iterador.getValor();
        }
        return valorTotal;

    }
}
