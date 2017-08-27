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

    private final String descricao;
    private final int quantidade;
    private final float valorDeVenda;
    private final float precoDecusto;
    private float lucroLocal, cargaTributaria;

    public Pedido(String descricao, int quantidade, float valorDeVenda, float precoDecusto) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorDeVenda = valorDeVenda;
        this.precoDecusto = precoDecusto;
    }

    public float calcularcagaTributaria(int porcentagemDeImposto) {
        cargaTributaria = (precoDecusto + calcLucro()) * (porcentagemDeImposto / 100);
        return cargaTributaria;
    }

    private float calcLucro() {
        lucroLocal = (valorDeVenda - precoDecusto) - cargaTributaria;
        return lucroLocal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValorDeVenda() {
        return valorDeVenda;
    }

}
