package com.xworkz.weather;

import java.util.Objects;

public class City {
    Weather weather;
    public City(Weather weather){
        this.weather=weather;
        System.out.println("parameterized constructor for City");
    }
    public void forecast(){
        System.out.println("running forecast in City");
        if(Objects.nonNull(weather)){
            weather.rainy();
        }
        else{
            System.err.println("weather is null");
        }
    }

}
