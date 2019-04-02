/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author Administrator
 */
public class Main_card extends JPanel implements ActionListener{
    
    private final JButton demands_b = new JButton("Demandes en attente");
    private final JButton stores_b = new JButton("Commerces locaux");
    private final JButton parameters_b = new JButton("Paramètres");
    private JPanel cards;
    private CardLayout c;
    private Demand_list_card demands;
    
    
    public Main_card(Demand_list_card demands, JPanel cards){
        super();
        this.demands = demands;
        this.cards = cards;
        c=(CardLayout)this.cards.getLayout();
    }
    
    public void init(){
        demands_b.addActionListener((ActionListener) this);
        this.add(demands_b);
        /*
        this.add(stores_b);
        this.add(parameters_b);
        */
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==demands_b){
            c.show(this.cards, "Demands");
        }
    }
}

