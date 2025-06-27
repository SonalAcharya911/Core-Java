package com.xworkz.groupism.assessment;

import java.util.ArrayList;
import java.util.Collection;

public class ArtifactCollection {
    public static void main(String[] args) {
        Collection<String> artifacts=new ArrayList<>();
        artifacts.add("FlowerVase from Thanjavur");
        artifacts.add("MudPot from Travancore");
        artifacts.add("Mughali Sword");
        artifacts.add("ancient clock");
        artifacts.add("Wooden Chairs");


        for(String artifact: artifacts){
            System.out.println(artifact);
        }



    }
}
