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
public class Demand_list_card extends JPanel{
    
    private ArrayList<Demand> demands = new ArrayList<>();
    private ArrayList<JPanel> demand_cards = new ArrayList<>();
    //Main panel
    private final JPanel main_panel = new JPanel();
    
    public Demand_list_card(ArrayList<Demand> _demands){
        super();
        demands=_demands;
        }
    
    public void init(){
        for(int i=0; i<demands.size(); i++){
            demand_cards.add(new JPanel());
            demand_cards.get(i).add(new JLabel(demands.get(i).getName()));
            demand_cards.get(i).add(new JLabel(demands.get(i).getFirst_name()));
            demand_cards.get(i).add(new JLabel(demands.get(i).getBoat_name()));
            
            main_panel.add(demand_cards.get(i));
        }
    }
    
}
