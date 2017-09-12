/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufsc.comandasdebaresbigdinner;


import View.MenuLogin;
import java.io.IOException;
/**
 *
 * @author Gabriel
 */
public class Inicializador {

    public static void main(String[] args) throws IOException, ClassNotFoundException {        
        MenuLogin ml = new MenuLogin();
        ml.setVisible(true);

    }

}
