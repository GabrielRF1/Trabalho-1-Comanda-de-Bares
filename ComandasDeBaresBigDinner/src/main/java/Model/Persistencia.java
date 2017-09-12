/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programação
 */
public class Persistencia<E> {

    public void GravaEmDisco(E elemento, String nome)  {
        try {
            FileOutputStream arquivo = new FileOutputStream(nome);
            try (ObjectOutputStream saida = new ObjectOutputStream(arquivo)) {
                saida.writeObject(elemento);
            }
        } catch (IOException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
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
