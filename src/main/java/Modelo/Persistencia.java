/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Programação
 */
public class Persistencia<E> {

    public void GravaEmDisco(E elemento, String nome) throws FileNotFoundException, IOException {
        FileOutputStream arquivo = new FileOutputStream(nome);
        ObjectOutputStream saida = new ObjectOutputStream(arquivo);
        saida.writeObject(elemento);
        saida.close();
        arquivo.close();
    }

    public E RecuperarObjeto(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream arquivo = new FileInputStream(name);
        ObjectInputStream entrada = new ObjectInputStream(arquivo);
        E elemento = (E) entrada.readObject();
        entrada.close();
        arquivo.close();
        return elemento;

    }
}
