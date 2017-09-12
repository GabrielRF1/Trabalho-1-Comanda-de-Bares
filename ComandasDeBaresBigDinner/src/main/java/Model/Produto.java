/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Programação
 */
public class Produto extends Pedido {

    private final float precoDeCusto;
    private float taxaLucro, taxaRoubo;

    public Produto(String nome, String descricao, int quantidade, float precoDecusto, float lucro, float roubo) {
        super(quantidade, descricao, nome);
        this.precoDeCusto = precoDecusto;
        this.taxaLucro = lucro;
        this.taxaRoubo = roubo;
    }

    @Override
    public double getValor() {
        return ((this.taxaRoubo + this.taxaLucro + 1) * precoDeCusto)*super.getQuantidade();
    }

    public float getPrecoDeCusto() {
        return precoDeCusto;
    }

    public float getTaxaLucro() {
        return taxaLucro;
    }

    public float getTaxaRoubo() {
        return taxaRoubo;
    }

}
