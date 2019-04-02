/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Demand;



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
    private ArrayList<JButton> accept_b = new ArrayList<>();
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
            
            //On ajoute le bouton à un array pour que chaque bouton soit reconnaissable par son index
            //Cela va nous permettre d'associer chaque demande à son bouton... Théoriqement
            accept_b.add(new JButton("Accepter la demande"));
            demand_cards.get(i).add(accept_b.get(i));
            
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
        else{
            //On vérifie quel bouton a été appuyé pour déterminer quel 
            for(int i=0; i<accept_b.size(); i++){
                if(e.getSource()==accept_b.get(i)){
                    //Insérer le put qui va changer le JSON pour mettre l'état "accepté"
                    
                }
            }
        }
        
    }
    
}
