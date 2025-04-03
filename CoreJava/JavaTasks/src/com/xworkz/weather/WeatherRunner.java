package com.xworkz.weather;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather=new Weather();
        City city=new City();

        if(city!=null){
            city.forecast(weather);
        }
        else{
            System.err.println("city is null");
        }
    }
}
