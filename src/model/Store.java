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
public class Store {
    
    private String Name;
    private String Address;
    private float Latitude;
    private float Longitude;
    private String Description;
    
    //Adresses vers des documents contenus dans la base de donnée
    private String Main_photo_address;
    private String Price_card_address;
    private String More_info_address;

    public Store() {
        
    }

    ///
    //Getters
    ///
    
    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public float getLatitude() {
        return Latitude;
    }

    public float getLongitude() {
        return Longitude;
    }

    public String getDescription() {
        return Description;
    }

    public String getMain_photo_address() {
        return Main_photo_address;
    }

    public String getPrice_card_address() {
        return Price_card_address;
    }

    public String getMore_info_address() {
        return More_info_address;
    }
    
    ///
    //Setters
    ///
    
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setLatitude(float Latitude) {
        this.Latitude = Latitude;
    }

    public void setLongitude(float Longitude) {
        this.Longitude = Longitude;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setMain_photo_address(String Main_photo_address) {
        this.Main_photo_address = Main_photo_address;
    }

    public void setPrice_card_address(String Price_card_address) {
        this.Price_card_address = Price_card_address;
    }

    public void setMore_info_address(String More_info_address) {
        this.More_info_address = More_info_address;
    }
     
    
}
