/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Programação
 */
public class Comanda implements Serializable {

    private boolean estadoDaComanda;
    protected Cliente cliente;
    protected Usuario usuario;
    protected List<Pedido> pedidos;
    protected float valorTotal;

    public Comanda(Cliente cliente, Usuario usuario) {
        this.estadoDaComanda = true;
        this.cliente = cliente;
        this.usuario = usuario;
        valorTotal = 0;
    }

    public void fecharComanda() {
        this.estadoDaComanda = false;
    }

    public void addPedido(Pedido pe) {
        pedidos.add(pe);
        atualizarValorTotal(pe);
    }

    private void atualizarValorTotal(Pedido pe) {
        valorTotal += (pe.quantidade * pe.valorDeVenda);

    }
}
