package com.xworkz.earth;

public class SolarSystem {
    Earth earth;
    public SolarSystem(Earth earth){
        this.earth=earth;
        System.out.println("parameterized constructor for SolarSystem");
    }
    public void planet(){
        System.out.println("running planet in SolarSystem");
        if(earth!=null){
            earth.rotates();
        }
        else{
            System.err.println("earth is null");
        }
    }
}
