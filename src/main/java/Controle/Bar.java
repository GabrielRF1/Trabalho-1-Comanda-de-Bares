/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Perisistencia.Persistencia;
import com.mycompany.comandadebares.Comanda;
import com.mycompany.comandadebares.GerenciadordeUsuario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gabriel
 */
public class Bar {

    public static void main(String[] args) {
        Map<Integer, Comanda> comandas = new HashMap<>();
        GerenciadordeUsuario GU = new GerenciadordeUsuario();
        Persistencia p = new Persistencia();
    }
}
