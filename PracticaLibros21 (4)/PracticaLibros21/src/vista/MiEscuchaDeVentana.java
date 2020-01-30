/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Karla Abad
 */
public class MiEscuchaDeVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(null,"Abriendo");
    }

    @Override
    public void windowClosing(WindowEvent e) {
          JOptionPane.showMessageDialog(null,"Cerrando");
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
