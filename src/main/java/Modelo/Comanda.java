/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    private float valorTotal;

    public Comanda(Cliente cliente, Usuario usuario) {
        this.comandaAberta = true;
        this.cliente = cliente;
        this.usuario = usuario;
        this.pedidos = new ArrayList<>();
        this.valorTotal = 0.0f;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
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
            AtualizarValorTotal(pe);
        } else {
        }
    }

    public void matarUmPedido(Pedido pe) {
        pedidos.remove(pe);

    }

    private void AtualizarValorTotal(Pedido pe) {
        valorTotal += pe.getValor();
    }
}
