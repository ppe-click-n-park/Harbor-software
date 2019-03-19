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
    
    private ArrayList<Demand> demands;
    
    private final CardLayout Main_layout = new CardLayout();
    private final JPanel cards = new JPanel(Main_layout);
    private final Main_card main_card = new Main_card();
    private final Demand_list_card demands_card = new Demand_list_card(demands);
    private final Store_list_card store_card = new Store_list_card(cards);
    
    
    /**
     * Constructor
     * 
     */
    public GUI(){
        super();
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
    /*
    try {
        this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("test.jpg")))));
    } catch (IOException e) {
    }
    
    */
    //Main card
    main_card.init();
    main_card.setName("main_card");
    this.cards.add(main_card);

    //Card displaying the demands from boats
    demands_card.init();
    demands_card.setName("demands_card");
    this.cards.add(demands_card);

    //Card displaying the stores
    store_card.init();
    store_card.setName("store_card");
    this.cards.add(store_card);

    this.add(cards);
    Main_layout.first(cards);
    //Main_layout.next(cards);
    //Main_layout.last(cards);
    this.setVisible(true);
    }
}
