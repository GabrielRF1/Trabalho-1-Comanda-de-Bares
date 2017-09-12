/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 17100518
 */
public class GerenciadordeComanda implements Serializable {

    private Map<Integer, Comanda> comandas;

    public GerenciadordeComanda() {
        comandas = new HashMap<>();
    }

    public Map<Integer, Comanda> getComandas() {
        return comandas;
    }
    
    public void addNewOrUpdatedComanda(Comanda com) {
        comandas.put(com.getCliente().getMesa(), com);
    }

    public void removeaComanda(Comanda com) {
        addNewOrUpdatedComanda(com);
        comandas.remove(com.getCliente().getMesa());
    }

}
