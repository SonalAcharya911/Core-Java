package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.FurnitureDto;
import com.xworkz.groupism.repository.FurnitureRepository;
import com.xworkz.groupism.repository.FurnitureRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FurnitureRunner {
    public static void main(String[] args) {
        FurnitureRepository furnitureRepository=new FurnitureRepositoryImpl();

        Collection<FurnitureDto> furnitureDtos=furnitureRepository.findaAll();

        System.out.println("Furniture info");
        for (FurnitureDto furnitureDto:furnitureDtos){
            System.out.println("type: "+furnitureDto.getType());
            System.out.println("material: "+furnitureDto.getMaterial());
            System.out.println("price: "+furnitureDto.getPrice());
            System.out.println("color: "+ furnitureDto.getColor());
            System.out.println("brand: "+ furnitureDto.getBrand());
        }

        System.out.println("using iterator");

        Iterator<FurnitureDto> iterator=furnitureDtos.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Furnitures above Rs.10,000");
        for(FurnitureDto furnitureDto:furnitureDtos){
            if(furnitureDto.getPrice()>10000){
                System.out.println(furnitureDto);
            }
            if(furnitureDtos.contains("Chiffon")){
                System.out.println(iterator+" : contains red");
            }

            if(furnitureDtos.isEmpty()){
                System.out.println("furnitureDtos is empty");
            }

            if(furnitureDtos.addAll(furnitureDtos)){

                System.out.println("addAll method");
            }

            if(furnitureDtos.containsAll(furnitureDtos)){
                System.out.println("containsAll success");

            }
            if(furnitureDtos.removeAll(furnitureDtos)){
                System.out.println("remove all success");
            }
        }

    }
}
