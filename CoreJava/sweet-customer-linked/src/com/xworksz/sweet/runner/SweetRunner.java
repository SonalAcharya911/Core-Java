package com.xworksz.sweet.runner;

import com.xworksz.sweet.dto.SweetDto;
import com.xworksz.sweet.repo.SweetRepo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class SweetRunner {
    public static void main(String[] args) {
        SweetRepo sweetRepo=new SweetRepo();
        Set<SweetDto> sweetDtoSet=sweetRepo.getSweets();
        System.out.println(sweetDtoSet.size());

        System.out.println("=========Sort all elements by price in desc using TreeSet=======");
        sweetDtoSet.stream().sorted((dto1,dto2)->Double.compare(dto2.getPrice(), dto1.getPrice())).forEach(System.out::println);

        System.out.println("==========Sort all elements by name and price in desc=========");
        sweetDtoSet.stream().sorted((dto1,dto2)->Double.compare(dto2.getPrice(), dto1.getPrice())).sorted((dto1,dto2)->dto2.getName().compareTo(dto1.getName())).forEach(System.out::println);

        System.out.println("==========================");
        Collection<SweetDto> collection=new LinkedList<>();

        collection.addAll(sweetDtoSet);
        collection.forEach(System.out::println);


    }
}
