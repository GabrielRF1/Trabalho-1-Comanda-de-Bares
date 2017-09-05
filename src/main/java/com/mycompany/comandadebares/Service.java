/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

/**
 *
 * @author 17100518
 */
public class Service extends Pedido {

    private float preco;

    public Service(int quantidade, String descricao, float preco) {
        super(quantidade, descricao);
        this.preco = preco;
    }

    @Override
    public double getValor() {
        return quantidade * preco;
    }

}
