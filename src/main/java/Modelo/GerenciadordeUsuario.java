/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Programação
 */
public class GerenciadordeUsuario implements Serializable {

    private Map<String, Usuario> usuarios;
    private Usuario usuarioLogado;
    public GerenciadordeUsuario() {
        usuarios = new HashMap<>();
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void addUsuario(Usuario u) {
        usuarios.put(u.getLog(), u);
    }

    public boolean autenticarUsuarioSenha(String user, String senha) {
        if (ConferirExistenciaDoLog(user)) {
            Usuario u = usuarios.get(user);
            String actualSenha = u.getSenha();
            if (senha.equals(actualSenha)) {
                usuarioLogado=usuarios.get(user);
                return true;
            }
        }
        return false;
    }
    public boolean ConferirExistenciaDoLog(String user){
    return usuarios.containsKey(user);
    }
}
