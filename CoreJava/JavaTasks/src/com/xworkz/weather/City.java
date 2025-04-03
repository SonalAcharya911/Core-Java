package com.xworkz.weather;

import java.util.Objects;

public class City {
    public void forecast(Weather weather){
        System.out.println("running forecast in City");
        if(Objects.nonNull(weather)){
            weather.rainy();
        }
        else{
            System.err.println("weather is null");
        }
    }

}
