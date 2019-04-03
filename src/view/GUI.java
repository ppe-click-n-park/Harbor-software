/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Demand;

import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class GUI extends JFrame{
    
    private ArrayList<Demand> demands = new ArrayList<>();
    private final CardLayout Main_layout = new CardLayout();
    private final JPanel cards = new JPanel(Main_layout);
    
    private Demand_list_card demands_card;
    private Accepted_list_card accepted_card;
    //private Store_list_card store_card;
    
    private Main_card main_card; 
    
    
    
    /**
     * Constructor
     * 
     */
    public GUI(ArrayList<Demand> _demands){
        super();
        demands=_demands;
        
        demands_card = new Demand_list_card(demands,cards);
        accepted_card = new Accepted_list_card(cards, demands);
        
        main_card = new Main_card(demands, demands_card, accepted_card, cards);
    }
    
    public void init(){
    //Setting the title
    this.setTitle("Click'n Park Administration Software");
    //Setting the size
    this.setSize(1600,900);
    //this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    //Center object
    this.setLocationRelativeTo(null);
    //Exit behaviour
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Main card
    main_card.init();
    main_card.setName("main_card");
    this.cards.add(main_card,"Main");

    //Card displaying the demands from boats
    demands_card.init();
    demands_card.setName("demands_card");
    this.cards.add(demands_card,"Demands");
    
    //Card displaying the accepted demands
    accepted_card.init();
    accepted_card.setName("accepted_card");
    this.cards.add(accepted_card,"Accepted");
    
    /*
    //Card displaying the stores
    store_card.init();
    store_card.setName("store_card");
    this.cards.add(store_card,"Stores");
    */
    
    this.add(cards);
    this.setVisible(true);
    }
}
