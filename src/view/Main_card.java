/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.Demand;


/**
 *
 * @author Administrator
 */
public class Main_card extends JPanel implements ActionListener{
    
    private final JButton demands_b = new JButton("Demandes en attente");
    private final JButton accepted_b = new JButton("Demandes acceptées");
    //private final JButton stores_b = new JButton("Commerces locaux");
    
    private JPanel cards;
    private CardLayout c;
    private Demand_list_card demands_card;
    private Accepted_list_card accepted;
    
    private ArrayList<Demand> demands;
    
    public Main_card(ArrayList<Demand> demands, Demand_list_card demands_card, Accepted_list_card accepted, JPanel cards){
        super();
        
        this.demands = demands;
        this.demands_card = demands_card;
        this.accepted = accepted;
        
        this.cards = cards;
        c=(CardLayout)this.cards.getLayout();
    }
    
    public void init(){
        
        demands_b.addActionListener((ActionListener) this);
        this.add(demands_b);
        
        accepted_b.addActionListener((ActionListener) this);
        this.add(accepted_b);
        
        /*
        stores_b.addActionListener((ActionListener) this);
        this.add(stores_b);
        
        */
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==demands_b){
            c.show(this.cards, "Demands");
        }
        if(e.getSource()==accepted_b){
            //accepted.init();
            c.show(this.cards, "Accepted");
        }
    }
}

