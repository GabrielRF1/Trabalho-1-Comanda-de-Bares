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
public class Pedido {

    protected String descricao;
    protected int quantidade;
    protected float valorDeVenda, precoDecusto, lucroLocal, cargaTributaria;

    public float calcularLucroLocal() {
        lucroLocal = (2 * precoDecusto) * cargaTributaria;
        return lucroLocal;
    }
}
