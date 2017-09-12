/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author Programação
 */
public class Usuario implements Serializable {

    private final String nome, log, senha;
    private boolean gerente;

    public Usuario(String nome, String log, String senha, boolean gerente) {
        this.nome = nome;
        this.log = log;
        this.senha = senha;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public String getLog() {
        return log;
    }

    public boolean isGerente() {
        return gerente;
    }

    public String getSenha() {
        return senha;
    }

    public Comanda AbrirComanda(Cliente cliente) {
        Comanda c = new Comanda(cliente, this);
        return c;// retorna c, pois esse método entra como parametro de outro método do gerenciador 
    }            // assim como os outros

    public Comanda CancelarPedido(Cliente cliente, Produto pe, Map<Integer, Comanda> mp) {
        Comanda c = mp.get(cliente.getMesa());
        if (c.getPedidos().contains(pe)) {
            c.matarUmPedido(pe);
            return c;
        } else {
        }
        return null;
    }

    public Comanda ReceberPagamento(Cliente cliente, Map<Integer, Comanda> mp) {
        Comanda c = mp.get(cliente.getMesa());
        c.setValorTotal(0.0f);
        return c;
    }

    public Comanda FecharComanda(Cliente cliente, Map<Integer, Comanda> mp) {
        Comanda c = mp.get(cliente.getMesa());
        c.fecharComanda();
        return c;
    }

    public void VisualizarComanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
