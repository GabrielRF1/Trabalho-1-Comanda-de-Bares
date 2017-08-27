/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import javax.swing.JOptionPane;

/**
 *
 * @author Programação
 */
public class Gerente extends Usuario {

    public Gerente(String nome, String log) {
        super(nome, log);
    }

    public void cancelarPedido(int mesa, Pedido pe) {
        Comanda c = comandas.get(mesa);
        if (c.getPedidos().contains(pe)) {
            c.getPedidos().remove(pe);
            comandas.put(mesa, c);
        } else {
            JOptionPane.showMessageDialog(null, "Pedido inexistênte");
        }
    }

    public void receberPagamento(int mesa) {
        Comanda c = comandas.get(mesa);
        fecharComanda(mesa);
    }

    private void fecharComanda(int mesa) {
        Comanda c = comandas.get(mesa);
        c.fecharComanda();
        comandas.put(mesa, c);
    }
}
