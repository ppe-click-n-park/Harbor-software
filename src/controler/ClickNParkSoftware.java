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

        JsonServer Demand_server = new JsonServer();
        GUI Guy;

        //Initialisation du programme
        Demand_server.init();
        Guy = new GUI((Demand_server.getDemands()));
        Guy.init();
        
    }
}
