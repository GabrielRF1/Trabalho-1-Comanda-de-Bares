/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandadebares;

import Modelo.Persistencia;
import Modelo.GerenciadordeComanda;
import Modelo.GerenciadordeUsuario;
import View.View;

/**
 *
 * @author Gabriel
 */
public class Inicializador {
public GerenciadordeUsuario GU = new GerenciadordeUsuario();
public GerenciadordeComanda GC = new GerenciadordeComanda();
    public static void main(String[] args) {
        View vi = new View();
        Persistencia p = new Persistencia();
        
        vi.TeladeLogin();
    }
}
