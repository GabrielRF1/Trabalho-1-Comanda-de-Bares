/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

/**
 *
 * @author Programação
 */
public class Gerente extends Funcionario {

    public void cancelarPedido() {
    }

    public void receberPagamento() {
    }

    public void fecharComanda(int n) {
        comandas.get(n).fecharComanda();
    }
}
