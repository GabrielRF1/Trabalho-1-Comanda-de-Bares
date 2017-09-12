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
public class Cliente {

    private String nome;
    private int mesa;

    public Cliente(String nome, int mesa) {
        this.nome = nome;
        this.mesa = mesa;
    }

    public String getNome() {
        return nome;
    }

    public int getMesa() {
        return mesa;
    }

}
