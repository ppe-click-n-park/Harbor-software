/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Administrator
 */
public class JDBC {
    
    Connection c = null;
    Statement state;
    ResultSet result;
    
    public void init(){
        
      try{
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      
    }
    
    public ResultSet send(String query) throws SQLException{
        state = c.createStatement();
        result = state.executeQuery(query);
        
        return result;
    }
    
    public void determine_demands() throws SQLException{
        
        send("SELECT * FROM Demand"/*+ WHERE new=TRUE*/);//Voir comment on garde les anciennes demandes dans la BDD en affichant que les nouvelles demandes
    }
    
    public void accept_demand(){
        
    }
    
    
}
