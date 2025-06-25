package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.GroceryDto;

import java.util.ArrayList;
import java.util.Collection;

public class GroceryRepositoryImpl implements GroceryRepository{
    @Override
    public Collection<GroceryDto> findAll() {
        GroceryDto groceryDto1 = new GroceryDto("Basmati Rice", "Grains", "1 kg", 89, "India Gate");
        GroceryDto groceryDto2 = new GroceryDto("Toor Dal", "Pulses", "1 kg", 112, "Tata Sampann");
        GroceryDto groceryDto3 = new GroceryDto("Wheat Flour", "Grains", "5 kg", 215, "Aashirvaad");
        GroceryDto groceryDto4 = new GroceryDto("Sugar", "Essentials", "1 kg", 45, "Madhur");
        GroceryDto groceryDto5 = new GroceryDto("Milk", "Dairy", "500 ml", 27, "Amul");
        GroceryDto groceryDto6 = new GroceryDto("Coconut Oil", "Oils", "1 L", 145, "Parachute");
        GroceryDto groceryDto7 = new GroceryDto("Salt", "Essentials", "1 kg", 20, "Tata Salt");
        GroceryDto groceryDto8 = new GroceryDto("Chilli Powder", "Spices", "100 g", 38, "Everest");
        GroceryDto groceryDto9 = new GroceryDto("Curd", "Dairy", "200 g", 22, "Nandini");
        GroceryDto groceryDto10 = new GroceryDto("Tea Powder", "Beverages", "250 g", 78, "Red Label");

        Collection<GroceryDto> collection=new ArrayList<>();

        collection.add(groceryDto1);
        collection.add(groceryDto2);
        collection.add(groceryDto3);
        collection.add(groceryDto4);
        collection.add(groceryDto5);
        collection.add(groceryDto6);
        collection.add(groceryDto7);
        collection.add(groceryDto8);
        collection.add(groceryDto9);
        collection.add(groceryDto10);

        return collection;
    }
}
