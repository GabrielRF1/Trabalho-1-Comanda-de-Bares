/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import View.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Programação
 */
public class Comanda implements Serializable {
    
    private boolean comandaAberta;
    private final Cliente cliente;
    private final Usuario usuario;
    private final List<Pedido> pedidos;
    private float valorTotal;

    public Comanda(Cliente cliente, Usuario usuario) {
        this.comandaAberta = true;
        this.cliente = cliente;
        this.usuario = usuario;
        this.pedidos = new ArrayList<>();
        valorTotal = 0;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void fecharComanda() {
        this.comandaAberta = false;
    }

    public void addPedido(Pedido pe) {
        if (comandaAberta) {
            pedidos.add(pe);
            atualizarValorTotal(pe);
        } else {
        }
    }

    private void atualizarValorTotal(Pedido pe) {
        valorTotal += (pe.getQuantidade() * pe.getValorDeVenda());

    }
}
