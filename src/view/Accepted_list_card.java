/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
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
import javax.swing.border.MatteBorder;
import model.Demand;

/**
 *
 * @author Administrator
 */

public class Accepted_list_card extends JPanel implements ActionListener{
    
    private JPanel cards;
    private CardLayout c;
    
     ArrayList<Demand> accepted_demands;
     
    //Panels
    private JPanel main_panel = new JPanel();
    private BorderLayout main_layout = new BorderLayout();
    private JPanel grid_panel = new JPanel();
    private GridLayout main_grid = new GridLayout(0,3,15,15);
    
    private JButton return_b = new JButton("Retour au menu");
    
    public Accepted_list_card(JPanel cards, ArrayList<Demand> demands){
        super();

        this.cards = cards;
        this.accepted_demands = demands;
        c=(CardLayout)this.cards.getLayout();
        
        main_panel.setLayout(main_layout);
        grid_panel.setLayout(main_grid);
    }
    
    public void init(){
        
        for(int i=0; i<accepted_demands.size(); i++){
            if(accepted_demands.get(i).getState() == "Accepted")
            {
                JPanel demand_panel = new JPanel();
                demand_panel.setBackground(Color.orange);
                demand_panel.setBorder( new MatteBorder(2, 2, 2, 2, Color.BLACK) );
                GridLayout grid = new GridLayout(0,2,4,20);
                demand_panel.setLayout(grid);
                
                demand_panel.add(new JLabel("Nom: " + accepted_demands.get(i).getName(),JLabel.CENTER));
                demand_panel.add(new JLabel("Prenom: " + accepted_demands.get(i).getFirst_name(),JLabel.CENTER));
                demand_panel.add(new JLabel("Modèle: " + accepted_demands.get(i).getBoat_model(),JLabel.CENTER));
                demand_panel.add(new JLabel("Nom du bateau : " + accepted_demands.get(i).getBoat_name(),JLabel.CENTER));
                demand_panel.add(new JLabel("Longeur: " + String.valueOf(accepted_demands.get(i).getBoat_length()) + " mètres",JLabel.CENTER));
                demand_panel.add(new JLabel("Largeur: " + String.valueOf(accepted_demands.get(i).getBoat_width()) + " mètres",JLabel.CENTER));
                demand_panel.add(new JLabel("Durée du séjour: " + String.valueOf(accepted_demands.get(i).getNumber_of_days()) + " jours",JLabel.CENTER));
                
                grid_panel.add(demand_panel);
            }
        }
        
        return_b.addActionListener((ActionListener) this);
        main_panel.add(grid_panel, BorderLayout.CENTER);
        main_panel.add(return_b, BorderLayout.SOUTH);

        this.add(main_panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==return_b){
            c.show(this.cards, "Main");
        }
    }
}
