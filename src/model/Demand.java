/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class Demand {
    
    private final String Name;
    private final String First_name;
    private final String Boat_name;
    private final int Boat_length;
    private final int Boat_width;
    private final String Boat_model;
    private final int Number_of_days;
    
    public Demand(String _name, String _first_name, String _boat_name, int _boat_length, int _boat_width, String _boat_model, int _number_of_days){
        
        Name=_name;
        First_name=_first_name;
        Boat_name=_boat_name;
        Boat_length=_boat_length;
        Boat_width=_boat_width;
        Boat_model=_boat_model;
        Number_of_days=_number_of_days;
        
    }

    public String getName() {
        return Name;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getBoat_name() {
        return Boat_name;
    }

    public int getBoat_length() {
        return Boat_length;
    }

    public int getBoat_width() {
        return Boat_width;
    }

    public String getBoat_model() {
        return Boat_model;
    }

    public int getNumber_of_days() {
        return Number_of_days;
    }
    
    
}
