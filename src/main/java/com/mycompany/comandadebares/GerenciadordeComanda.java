/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 17100518
 */
public class GerenciadordeComanda {

    Map<Cliente, Comanda> comandas;

    public GerenciadordeComanda() {
        comandas = new HashMap<>();
    }

    public void addNewOrUpdatedComanda(Comanda com) {
        comandas.put(com.getCliente(), com);
    }

    public void removeaComanda(Comanda com) {
        comandas.remove(com.getCliente());
    }

}
