/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graficos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Gabriel
 */
public class Janela extends JFrame {

    JPanel PartedosBotoes;
    JPanel PartedaInfo;
    JButton B1, B2;
    JLabel Att;

    public Janela() {
        super();
        setLayout(new GridLayout(2, 2));
        B1 = new JButton("Botão 1");
        B2 = new JButton("Botão 2");
        Icon guile = new ImageIcon(getClass().getResource("Guile_win_comb.gif"));
        Att = new JLabel("Botão apertado: nenhum", guile, SwingConstants.CENTER);
        PartedosBotoes = new JPanel();
        PartedosBotoes.setBackground(Color.GREEN);
        Box box = Box.createVerticalBox();
        box.add(new JLabel("Selecione um botão"));
        box.add(new JLabel(" "));
        box.add(B1);
        box.add(new JLabel(" "));
        box.add(B2);
        PartedosBotoes.add(box);
        add(PartedosBotoes);
        PartedaInfo = new JPanel();
        PartedaInfo.setBackground(Color.cyan);
        PartedaInfo.add(Att);
        add(PartedaInfo);

        ButtonHandler Handler = new ButtonHandler();
        B1.addActionListener(Handler);
        B2.addActionListener(Handler);

    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == B1) {
                Att.setText("Botão apertado: Botão 1");
            } else {
                Att.setText("Botão apertado: Botão 2");
            }
        }

    }
}
