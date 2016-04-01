/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carolina
 */
public class ControladorVentana implements ActionListener {

    private Principal principal;
    
    public ControladorVentana(Principal principal) {
        this.principal = principal;
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getActionCommand().equals("Calcular")){
             System.out.println("FUNCIONA!!!");
        }
        
    }
    
}
