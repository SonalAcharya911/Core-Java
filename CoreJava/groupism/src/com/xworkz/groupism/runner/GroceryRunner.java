package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.GroceryDto;
import com.xworkz.groupism.repository.GroceryRepository;
import com.xworkz.groupism.repository.GroceryRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GroceryRunner {
    public static void main(String[] args) {

        GroceryRepository groceryRepository=new GroceryRepositoryImpl();

        Collection<GroceryDto> collection=groceryRepository.findAll();

        System.out.println("Grocery details");
        for(GroceryDto groceryDto: collection){
            System.out.println("Name: "+ groceryDto.getName());
            System.out.println("Category: "+ groceryDto.getCategory());
            System.out.println("Quantity: "+ groceryDto.getQuantity());
            System.out.println("Price: "+ groceryDto.getPrice());
            System.out.println("Brand: "+ groceryDto.getBrand());

        }

        System.out.println("accessing using iterator");

        Iterator<GroceryDto> iterator=collection.iterator();

        while(iterator.hasNext()){
            if(iterator.next().getQuantity().equals("1 kg")){
                System.out.println(iterator);
            }

            if(collection.contains("Chiffon")){
                System.out.println(iterator+" : contains red");
            }

            if(collection.isEmpty()){
                System.out.println("collection is empty");
            }

            if(collection.addAll(collection)){

                System.out.println("addAll method");
            }

            if(collection.containsAll(collection)){
                System.out.println("containsAll success");

            }
            if(collection.removeAll(collection)){
                System.out.println("remove all success");
            }

        }

    }
}
