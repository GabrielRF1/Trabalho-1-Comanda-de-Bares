/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author Gabriel
 */
public class Aluno {
    protected int serie,numero;
    protected String nome;

    public Aluno(int serie, int numero, String nome) {
        this.serie = serie;
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "serie=" + serie + ", numero=" + numero + ", nome=" + nome + '}';
    }
    
}
