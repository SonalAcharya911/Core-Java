package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.CampingAccessoriesDto;
import com.xworkz.groupism.repository.CampingAccessoryRepository;
import com.xworkz.groupism.repository.CampingAccessoryRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CampingAccessoriesRunner {
    public static void main(String[] args) {

        CampingAccessoryRepository campingAccessoryRepository=new CampingAccessoryRepositoryImpl();

        Collection<CampingAccessoriesDto> collection=campingAccessoryRepository.findAll();

        System.out.println("Camping accessories details");

        for(CampingAccessoriesDto campingAccessoriesDto: collection){
            System.out.println("Name: "+ campingAccessoriesDto.getName());
            System.out.println("Brand: "+ campingAccessoriesDto.getBrand());
            System.out.println("Weight: "+ campingAccessoriesDto.getWeight());
            System.out.println("Price: "+ campingAccessoriesDto.getPrice());
            System.out.println("Suitable Weather: "+ campingAccessoriesDto.getSuitableWeather());
        }

        System.out.println("Accessing using iterator");
        Iterator<CampingAccessoriesDto> iterator= collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

            if(iterator.next().equals("Yellow")){
                iterator.remove();
            }
            if(collection.contains("Rope")){
                System.out.println(iterator+" : contains rope");
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

        System.out.println("camping accessories suitable for all seasons");
        for(CampingAccessoriesDto campingAccessoriesDto: collection){
            if(campingAccessoriesDto.getSuitableWeather().equals("All Seasons")){
                System.out.println(campingAccessoriesDto);
            }
        }


    }
}
