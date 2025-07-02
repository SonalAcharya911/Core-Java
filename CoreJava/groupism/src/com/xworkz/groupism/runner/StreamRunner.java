package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.SareeDto;
import com.xworkz.groupism.repository.SareeRepository;
import com.xworkz.groupism.repository.SareeRepositoryImpl;

import java.util.Collection;
import java.util.Comparator;

public class StreamRunner {


    public static void main(String[] args) {


        SareeRepository sareeRepository=new SareeRepositoryImpl();

        Collection<SareeDto> collection=sareeRepository.findAll();

        collection.stream().forEach(e-> System.out.println(e));
        System.out.println("====================");
        collection
                .stream()
                .filter(sareeDto->sareeDto.getCost()<5000
                && sareeDto.getColor().equalsIgnoreCase("white"))
                .forEach(System.out::println);

        System.out.println("================");

        collection
                .stream()
                .sorted()//CCE
                .forEach(System.out::println);


    }
}
