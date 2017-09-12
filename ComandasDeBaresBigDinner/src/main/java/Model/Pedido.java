/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 17100518
 */
public abstract class Pedido {

    private int quantidade;
    private String nome, descricao;

    public Pedido(int quantidade, String descricao, String nome) {
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.nome = nome;
    }

    public abstract double getValor();

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

}
