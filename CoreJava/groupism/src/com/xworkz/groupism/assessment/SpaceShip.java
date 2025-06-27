package com.xworkz.groupism.assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SpaceShip {
    public static void main(String[] args) {
        Collection<String> spaceships=new ArrayList<>();
        spaceships.add("ashaks");
        spaceships.add("pintofun");
        spaceships.add("A9F!");
        spaceships.add("AI171");

        Iterator<String> iterator=spaceships.iterator();
        while(iterator.hasNext()){
            if(iterator.next().length()>7){
                iterator.remove();
            }
        }
    }
}
