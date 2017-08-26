/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Programação
 */
public class GerenciadordeUsuario implements Serializable {

    Map<String, String> usuarios;

    public GerenciadordeUsuario() {
        usuarios = new HashMap<>();
    }

    public void addUsuario(String user, String senha) {
        usuarios.put(user, senha);
    }

    public boolean autenticarUsuario(String user) {
        boolean existe = false;
        existe = usuarios.containsKey(user);
        return existe;
    }

}
