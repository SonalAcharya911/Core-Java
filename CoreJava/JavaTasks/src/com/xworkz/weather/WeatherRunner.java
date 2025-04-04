package com.xworkz.weather;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather=new Weather();
        City city=new City(weather);
        city.forecast();
    }
}
