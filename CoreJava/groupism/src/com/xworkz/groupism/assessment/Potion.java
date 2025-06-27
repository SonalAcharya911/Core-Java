package com.xworkz.groupism.assessment;

import java.util.ArrayList;
import java.util.Collection;

public class Potion {
    public static void main(String[] args) {
        Collection<String> potions=new ArrayList<>();
        potions.add("Avada Kedavra");
        potions.add("Expecto Patronum");
        potions.add("Wingardium Leviosa");
        potions.add("Lumos");

        Collection<String>potions2=new ArrayList<>();
        potions2.add("sublime");
        potions2.add("beast");
        potions2.add("Wingardium Leviosa");
        potions2.add("Lumos");

        potions2.removeAll(potions);
    }
}
