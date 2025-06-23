package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.SareeDto;

import java.util.ArrayList;
import java.util.Collection;

public class SareeRunner {
    public static void main(String[] args) {
        SareeDto sareeDto1 = new SareeDto("Marriage", "Kanjeevaram Silk", 45000, "Maroon-Gold", true);
        SareeDto sareeDto2 = new SareeDto("Engagement", "Banarasi Silk", 30000, "Royal Blue", true);
        SareeDto sareeDto3 = new SareeDto("Mehendi", "Chiffon", 7000, "Green", false);
        SareeDto sareeDto4 = new SareeDto("Cocktail", "Georgette", 8500, "Black", false);
        SareeDto sareeDto5 = new SareeDto("Pooja", "Cotton Silk", 12000, "Yellow", true);
        SareeDto sareeDto6 = new SareeDto("Funeral", "Plain Cotton", 2000, "White", false);
        SareeDto sareeDto7 = new SareeDto("Office", "Linen", 4500, "Beige", false);
        SareeDto sareeDto8 = new SareeDto("Graduation", "Crepe Silk", 9500, "Bottle Green", true);
        SareeDto sareeDto9 = new SareeDto("Birthday", "Organza", 11000, "Pink", true);
        SareeDto sareeDto10 = new SareeDto("Trip", "Synthetic", 2500, "Navy Blue", false);


        Collection<SareeDto> collection=new ArrayList<>();

        collection.add(sareeDto1);
        collection.add(sareeDto2);
        collection.add(sareeDto3);
        collection.add(sareeDto4);
        collection.add(sareeDto5);
        collection.add(sareeDto6);
        collection.add(sareeDto7);
        collection.add(sareeDto8);
        collection.add(sareeDto9);
        collection.add(sareeDto10);

        System.out.println("Saree info");
        for(SareeDto sareeDto:collection){
            System.out.println("occasion: "+sareeDto.getOccasion());
            System.out.println("material: "+sareeDto.getMaterial());
            System.out.println("cost: "+sareeDto.getCost());
            System.out.println("color: "+sareeDto.getColor());
        }
    }

}
