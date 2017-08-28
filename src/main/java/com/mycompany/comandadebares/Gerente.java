/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Programação
 */
public class Gerente extends Usuario {

    public Gerente(String nome, String log) {
        super(nome, log);
    }

    public Comanda cancelarPedido(int mesa, Pedido pe, Map<Integer, Comanda> mp) {
        Comanda c = mp.get(mesa);
        if (c.getPedidos().contains(pe)) {
            c.getPedidos().remove(pe);
            return mp.put(mesa, c);
        } else {
            JOptionPane.showMessageDialog(null, "Pedido inexistênte");
        }
        return null;
    }

    public int receberPagamento(int mesa, Map<Integer, Comanda> mp) {
        Comanda c = mp.get(mesa);
        return JOptionPane.showConfirmDialog(null, "Valor a pagar: R$" + (c.getValorTotal()));
    }

    public Comanda fecharComanda(int mesa, Map<Integer, Comanda> mp) {
        Comanda c = mp.get(mesa);
        c.fecharComanda();
        return mp.put(mesa, c);//se colocar em mapa, um valor com a mesma chave de antes sobreescreve?
    }
}
