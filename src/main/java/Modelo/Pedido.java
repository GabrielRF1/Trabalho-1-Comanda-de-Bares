/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 17100518
 */
public abstract class Pedido {

    protected int quantidade;
    protected String descricao;

    public Pedido(int quantidade, String descricao) {
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public abstract double getValor();

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
