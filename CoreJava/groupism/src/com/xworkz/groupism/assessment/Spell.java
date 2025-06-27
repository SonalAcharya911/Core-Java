package com.xworkz.groupism.assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Spell {
    public static void main(String[] args) {
        Collection<String> spells=new ArrayList<>();
        spells.add("Avada Kedavra");
        spells.add("Expecto Patronum");
        spells.add("Wingardium Leviosa");
        spells.add("Lumos");

        Iterator<String> iterator= spells.iterator();
        while(iterator.hasNext()){
            if(iterator.next().isEmpty()){
                System.out.println("collection of spell names is empty");
                iterator.next();
            }
            else{
                System.out.println("collection of spell names is not empty");

            }
        }
    }
}
