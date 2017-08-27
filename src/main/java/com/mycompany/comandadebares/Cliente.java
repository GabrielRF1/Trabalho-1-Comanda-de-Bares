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
public class Cliente {

    private String nome, mesa;

    public Cliente(String nome, String mesa) {
        this.nome = nome;
        this.mesa = mesa;
    }

    public String getNome() {
        return nome;
    }

    public String getMesa() {
        return mesa;
    }
}
