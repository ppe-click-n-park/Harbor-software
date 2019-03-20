/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Demand;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.MutableComboBoxModel;

/**
 *
 * @author Administrator
 * Ici on affiche les différentes demandes qui ont été receuillies depuis la base de donnée
 */
public class Demand_list_card extends JPanel implements ActionListener{
    
    private ArrayList<Demand> demands = new ArrayList<>();
    private ArrayList<JPanel> demand_cards = new ArrayList<>();
    private JPanel cards;
    private CardLayout c;
    private JButton return_b = new JButton("Retour au menu");
    //Main panel
    private final JPanel main_panel = new JPanel();
    
    
    public Demand_list_card(ArrayList<Demand> _demands, JPanel cards){
        super();
        this.cards=cards;
        demands=_demands;
        c=(CardLayout)this.cards.getLayout();
        }
    
    public void init(){
        for(int i=0; i<demands.size(); i++){
            
            /*Pour trouver un layout moins dégueu https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html#grid*/
            
            demand_cards.add(new JPanel(new GridLayout(5, 1)));
            demand_cards.get(i).add(new JLabel(demands.get(i).getBoat_model()));
            demand_cards.get(i).add(new JLabel(demands.get(i).getName()));
            demand_cards.get(i).add(new JLabel(demands.get(i).getFirst_name()));
            demand_cards.get(i).add(new JLabel(demands.get(i).getBoat_name()));
            //demand_cards.get(i).add(demands.get(i).getNumber_of_days());
            demand_cards.get(i).add(new JButton("Accepter la demande"));
            
            main_panel.add(demand_cards.get(i));
        }
        return_b.addActionListener((ActionListener) this);
        main_panel.add(return_b);
        this.add(main_panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==return_b){
            //euh comment on code le fait que le bouton fasse afficher la bonne card
            c.show(this.cards, "Main");
        }
    }
    
}
