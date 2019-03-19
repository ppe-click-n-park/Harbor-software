/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
 */
public class Main_card extends JPanel /*implements ItemListener, ActionListener, FocusListener*/{
    
    private final JButton demands = new JButton("Demandes en attente");
    private final JButton stores = new JButton("Commerces locaux");
    private final JButton parameters = new JButton("Paramètres");
    
    public Main_card(){
        super();
    }
    
    public void init(){
        this.add(demands);
        this.add(stores);
        this.add(parameters);
    }
}

