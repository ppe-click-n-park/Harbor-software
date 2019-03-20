/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import model.Demand;
import view.*;
/**
 *Chercher axios (axio ou whatever), lien entre JAVA et bdd SQLight / Django
 * Voir comment faire un chat en Java via la base de donnée (table conversation avec message + timestamp?)
 * @author Administrator
 */
public class ClickNParkSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //Déclaration des variables
      GUI Guy = new GUI();
      ArrayList<Demand> Demands;
      /*
      Connection c = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      */
        //Initialisation du programme
        Guy.init();
    }
}
