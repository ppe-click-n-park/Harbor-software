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
public class Store_info extends JPanel{
    
    private final JPanel cards;
    
    private final JPanel main_panel = new JPanel();
    private final JButton change_info = new JButton("Modifier");
    
    public Store_info(JPanel _cards){
        super();
        cards = _cards;
    }
    
    public void init(){
        this.add(change_info);
    }
}
