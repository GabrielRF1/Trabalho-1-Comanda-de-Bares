/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graficos;

import javax.swing.JFrame;

/**
 *
 * @author Gabriel
 */
public class main {
    public static void main(String[] args) {
        Janela jan = new Janela();
        jan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jan.pack();
        jan.setVisible(true);
    }
}
