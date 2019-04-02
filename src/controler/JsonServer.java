/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;

import model.*;

import org.json.JSONArray;
import org.json.JSONObject;
import view.Demand_list_card;


public class JsonServer {
    
    //Put address in http:// form
    private String REQUEST_URL = "http://";
    private JSONObject myresponse;
    private ArrayList<Demand> demands = new ArrayList<>();
    
    public void init(){
        
        try {
            
            URL obj = new URL(REQUEST_URL);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();

            int responseCode = conn.getResponseCode();
            System.out.println("\n Sending 'GET' request to following URL:" + REQUEST_URL);
            System.out.println("Response Code is:" +responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            //Reading the data
            String inputLine;
            StringBuffer response = new StringBuffer();
            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();
            
            //Transforming read data into usable JSON object
            myresponse = new JSONObject(response.toString());
            
            System.out.println(myresponse);

            JSONArray array = new JSONArray(myresponse.toString());
            for (int i = 0; i < array.length(); i++) {
                JSONObject row = array.getJSONObject(i);
                demands.add(new Demand(row.getInt("Id"), row.getString("State"), row.getString("FirstName"), 
                        row.getString("Name"), row.getInt("BoatLength"), row.getInt("BoatWidth"),
                        row.getString("BoatModel"), row.getInt("StayDuration")));
            }

            //Faire une boucle à travers chaque objet "demande" de l'objet JSON
            //Créer un objet demande pour chaque avec les infos de l'objet
            /*
            System.out.println("Id is:" + myresponse.getString("Id"));
            System.out.println("State is:" + myresponse.getString("State"));//On hold, accepted or refused
            System.out.println("FirstName is:" + myresponse.getString("FirstName"));
            System.out.println("Name:" + myresponse.getString("Name"));
            System.out.println("BoatName:" + myresponse.getString("BoatName"));
            System.out.println("BoatLength is:" + myresponse.getString("BoatLength"));
            System.out.println("BoatWidth is:" + myresponse.getString("BoatWidth"));
            System.out.println("BoatModel is:" + myresponse.getString("BoatModel"));
            System.out.println("StayDuration is:" + myresponse.getString("StayDuration"));
            */
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
   
}