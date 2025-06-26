package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.SareeDto;
import com.xworkz.groupism.repository.SareeRepository;
import com.xworkz.groupism.repository.SareeRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SareeRunner {
    public static void main(String[] args) {
        SareeRepository sareeRepository=new SareeRepositoryImpl();

        Collection<SareeDto> collection=sareeRepository.findAll();
        System.out.println("Saree info");
        for(SareeDto sareeDto:collection){
            System.out.println("occasion: "+sareeDto.getOccasion());
            System.out.println("material: "+sareeDto.getMaterial());
            System.out.println("cost: "+sareeDto.getCost());
            System.out.println("color: "+sareeDto.getColor());
        }

        Iterator<SareeDto> iterator= collection.iterator();

        while(iterator.hasNext()){
            if(iterator.next().isWithBlousePiece()){
                System.out.println(iterator);
            }
        }

        System.out.println("using remove method");
        while(iterator.hasNext()){
            if(iterator.next().getColor().equals("Red")){
                iterator.remove();
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
