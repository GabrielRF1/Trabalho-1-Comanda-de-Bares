/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Programação
 */
public abstract class Usuario implements Serializable {

    protected String nome;
    protected List<Comanda> comandas;

    public Usuario(String nome,String cpf) {
        this.nome = nome;
        this.cpf=cpf;
    }
    
    
    
    public void abrirComanda() {
      
    }

    public void adicionarPedido() {

    }

    public void visualizarComanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}