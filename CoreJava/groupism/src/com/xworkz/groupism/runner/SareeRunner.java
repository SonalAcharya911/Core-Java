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
    }

}
