/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import com.google.gson.JsonObject;
import java.math.BigDecimal;
import java.util.ArrayList;
import model.Demand;
import view.*;

/**
 * @author Administrator
 */

public class ClickNParkSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      //Déclaration des variables
      GUI Guy = new GUI();
      JsonServer Demand_server = new JsonServer();

        //Initialisation du programme
        Guy.init();
        Demand_server.init();
    }
}
