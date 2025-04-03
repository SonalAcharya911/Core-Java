package com.xworkz.earth;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth=new Earth();
        SolarSystem solarSystem=new SolarSystem();

        if(solarSystem!=null){
            solarSystem.planet(earth);
        }
        else{
            System.err.println("solarSystem is null");
        }
    }
}
