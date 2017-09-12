/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufsc.comandasdebaresbigdinner;

import Model.GerenciadordeComanda;
import Model.GerenciadordeUsuario;
import Model.Persistencia;
import Model.Usuario;
import com.ufsc.comandasdebaresbigdinner.Inicializador;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author 17100518
 */
public class MiniControl {

    private GerenciadordeComanda GC;
    private GerenciadordeUsuario GU;
    private Usuario lastLogged;
    private Persistencia p = new Persistencia();

    public MiniControl() throws IOException, FileNotFoundException, ClassNotFoundException {
        try {
            GC = (GerenciadordeComanda) p.RecuperarObjeto("Comanda.bin");
        } catch (FileNotFoundException ex) {
            GC = new GerenciadordeComanda();
        }
        try {
            GU = (GerenciadordeUsuario) p.RecuperarObjeto("Usuario.bin");
            lastLogged = GU.getUsuarioLogado();
        } catch (FileNotFoundException ex) {
            GU = new GerenciadordeUsuario();
        }
    }

    public Usuario getLastLogged() {
        return lastLogged;
    }

    public Persistencia getP() {
        return p;
    }

    public GerenciadordeComanda getGC() {
        return GC;
    }

    public GerenciadordeUsuario getGU() {
        return GU;
    }

  
}
