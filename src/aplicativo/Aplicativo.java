/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deferson
 */
public class Aplicativo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new TelaLogin().setVisible(true);
        
             new TelaCadastroProduto(null).setVisible(true);
        
    }
    
   
    
}
