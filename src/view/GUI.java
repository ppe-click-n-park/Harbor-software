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
    private  Demand_list_card demands_card;
    private  Main_card main_card = new Main_card(demands_card, cards);
    private  Store_list_card store_card = new Store_list_card();
    
    
    /**
     * Constructor
     * 
     */
    public GUI(){
        super();
        //Des valeurs un peu random sont données pour simuler la présence de 3 demandes dans la base de donnée
        demands.add(new Demand(1,"Cullen", "Marc", "Joa", 15, 4, "AE86", 8));
        demands.add(new Demand(2,"tchullian", "Marcus", "Joa", 10, 3, "AE85", 8));
        demands.add(new Demand(3,"verclytte", "Marc", "Joe", 17, 3, "AE85", 7));
        
        demands_card=new Demand_list_card(demands,cards);
    }
    
    public void init(){
    //Setting the title
    this.setTitle("Click'n Park Administration Software");
    //Setting the size
    this.setSize(1080,720);
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

    //Card displaying the stores
    store_card.init();
    store_card.setName("store_card");
    this.cards.add(store_card,"Stores");

    this.add(cards);
    this.setVisible(true);
    }
}
