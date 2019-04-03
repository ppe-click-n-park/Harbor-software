/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import model.Demand;



/**
 *
 * @author Administrator
 * Ici on affiche les différentes demandes qui ont été receuillies depuis la base de donnée
 */
public class Demand_list_card extends JPanel implements ActionListener{
    
    private JPanel cards;
    private CardLayout c;
    
    private ArrayList<Demand> demands = new ArrayList<>();
    private ArrayList<JPanel> demand_cards = new ArrayList<>();

    //Panels
    private JPanel main_panel = new JPanel();
    private BorderLayout main_layout = new BorderLayout();
    private JPanel grid_panel = new JPanel();
    private GridLayout main_grid = new GridLayout(0,3,15,15);
    
    private ArrayList<JButton> accept_b = new ArrayList<>();
    private ArrayList<JButton> refuse_b = new ArrayList<>();
    
    private JButton return_b = new JButton("Retour au menu");
    
    public Demand_list_card(ArrayList<Demand> _demands, JPanel cards){
        super();
        
        this.cards=cards;
        demands=_demands;
        c=(CardLayout)this.cards.getLayout();
        
        main_panel.setLayout(main_layout);
        grid_panel.setLayout(main_grid);
    }
    
    public void init(){
        for(int i=0; i<demands.size(); i++){
            
            JPanel demand_panel = new JPanel();
            demand_panel.setBackground(Color.orange);
            demand_panel.setBorder( new MatteBorder(2, 2, 2, 2, Color.BLACK) );
            GridLayout grid = new GridLayout(0,2,4,1);
            demand_panel.setLayout(grid);

            demand_panel.add(new JLabel("Nom: " + demands.get(i).getName(),JLabel.CENTER));
            demand_panel.add(new JLabel("Prenom: " + demands.get(i).getFirst_name(),JLabel.CENTER));
            demand_panel.add(new JLabel("Modèle: " + demands.get(i).getBoat_model(),JLabel.CENTER));
            demand_panel.add(new JLabel("Nom du bateau : " + demands.get(i).getBoat_name(),JLabel.CENTER));
            demand_panel.add(new JLabel("Longeur: " + String.valueOf(demands.get(i).getBoat_length()) + " mètres",JLabel.CENTER));
            demand_panel.add(new JLabel("Largeur: " + String.valueOf(demands.get(i).getBoat_width()) + " mètres",JLabel.CENTER));
            demand_panel.add(new JLabel("Durée du séjour: " + String.valueOf(demands.get(i).getNumber_of_days()) + " jours",JLabel.CENTER));
            demand_panel.add(new JLabel("   "));
            
            //On ajoute le bouton à un array pour que chaque bouton soit reconnaissable par son index
            //Cela va nous permettre d'associer chaque demande à son bouton... Théoriqement
            accept_b.add(new JButton("Accepter la demande"));
            refuse_b.add(new JButton("Refuser la demande"));
            demand_panel.add(accept_b.get(i));
            demand_panel.add(refuse_b.get(i));

                
            if(demands.get(i).getState() == "On Hold"){
                grid_panel.add(demand_panel);
            }
        }
        
        return_b.addActionListener((ActionListener) this);
        
        main_panel.add(grid_panel,BorderLayout.CENTER);
        main_panel.add(return_b,BorderLayout.SOUTH);
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
                    demands.get(i).setState("Accepted");
                }
                if(e.getSource()==refuse_b.get(i)){
                    //Insérer le put qui va changer le JSON pour mettre l'état "refusé"
                    demands.get(i).setState("Refused");
                    
                }
            }
        }
        
    }

    public void setDemands(ArrayList<Demand> demands) {
        this.demands = demands;
    }
    
}
