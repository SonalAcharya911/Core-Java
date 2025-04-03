package com.xworkz.earth;

public class SolarSystem {
    public void planet(Earth earth){
        System.out.println("running planet in SolarSystem");
        if(earth!=null){
            earth.rotates();
        }
        else{
            System.err.println("earth is null");
        }
    }
}
