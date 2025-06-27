package com.xworkz.groupism.assessment;

import java.util.ArrayList;
import java.util.Collection;

public class AlienLanguages {
    public static void main(String[] args) {
        Collection<String> alienLanguages=new ArrayList<>();
        alienLanguages.add("abracadabra");
        alienLanguages.add("frenchtiad");
        alienLanguages.add("Xenovox");

        if(alienLanguages.contains("Xenovox")){
            System.out.println("aliemn language collection contains Xenovox");
        }
        else{
            System.out.println("aliemn language collection does not contain Xenovox");
        }

    }


}
