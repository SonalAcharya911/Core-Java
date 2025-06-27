package com.xworkz.groupism.assessment;

import java.util.ArrayList;
import java.util.Collection;

public class EnchantedRelics {
    public static void main(String[] args) {
        Collection<String> enchantedRelic1=new ArrayList<>();
        enchantedRelic1.add("Avada Kedavra");
        enchantedRelic1.add("Expecto Patronum");
        enchantedRelic1.add("Wingardium Leviosa");
        enchantedRelic1.add("Lumos");

        Collection<String> enchantedRelic2=new ArrayList<>();
        enchantedRelic2.add("sublime");
        enchantedRelic2.add("beast");

        enchantedRelic2.addAll(enchantedRelic1);
    }
}
