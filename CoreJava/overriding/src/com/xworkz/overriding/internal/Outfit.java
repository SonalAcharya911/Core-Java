package com.xworkz.overriding.internal;

public class Outfit {
    private String fabric;
    private String occasion;

    public void setFabric(String fabric){
        this.fabric = fabric;
    }

    public void setOccasion(String occasion){
        this.occasion = occasion;
    }

    @Override
    public String toString() {
        System.out.println("fabric: " + fabric);
        System.out.println("occasion: " + occasion);
        return "";
    }

    public Outfit(){
        System.out.println("no-arg constructor for Outfit");
    }
    public void tryOutfit() {
        System.out.println("running tryOutfit in Outfit");
    }
}
