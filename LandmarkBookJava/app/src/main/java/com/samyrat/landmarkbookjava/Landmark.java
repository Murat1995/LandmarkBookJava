package com.samyrat.landmarkbookjava;

import java.io.Serializable;

public class Landmark implements Serializable{

    //Serializable
    String city;
    String countryCity;
    int image;

    public Landmark(String city, String countryCity, int image){
        this.city = city;
        this.countryCity = countryCity;
        this.image = image;
    }
}
