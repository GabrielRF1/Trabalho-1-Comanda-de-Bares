/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author 17100518
 */
public class View {
    public void MensagemdeErro(String string){
        JOptionPane.showMessageDialog(null, string);
    }
    public void TeladeLogin(){
        MenuLogin tLog = new MenuLogin();
        tLog.setVisible(true);
        
    }
}
