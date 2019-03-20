/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class Store_list_card extends JPanel{
    
    //Main panel
    private final JPanel main_panel = new JPanel();
    private final JButton add_store = new JButton("Ajouter un commerce");
    
    public Store_list_card(){
        super();
    }
    
    public void init(){
        
        this.add(add_store);
    }
}
