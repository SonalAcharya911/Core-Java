package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.CampingAccessoriesDto;

import java.util.ArrayList;
import java.util.Collection;

public class CampingAccessoriesRunner {
    public static void main(String[] args) {
        CampingAccessoriesDto campingDto1 = new CampingAccessoriesDto("Sleeping Bag", "Quechua", 1.5, 2499, "Winter");
        CampingAccessoriesDto campingDto2 = new CampingAccessoriesDto("Camping Tent", "Wildcraft", 3.8, 5499, "All Seasons");
        CampingAccessoriesDto campingDto3 = new CampingAccessoriesDto("Portable Stove", "Coleman", 2.2, 3199, "All Seasons");
        CampingAccessoriesDto campingDto4 = new CampingAccessoriesDto("Camping Chair", "Decathlon", 2.0, 1799, "Summer");
        CampingAccessoriesDto campingDto5 = new CampingAccessoriesDto("Headlamp", "Philips", 0.2, 1299, "Night Use");
        CampingAccessoriesDto campingDto6 = new CampingAccessoriesDto("Water Bottle", "Hydro Flask", 0.5, 999, "All Seasons");
        CampingAccessoriesDto campingDto7 = new CampingAccessoriesDto("Backpack", "Trawoc", 1.8, 2199, "All Seasons");
        CampingAccessoriesDto campingDto8 = new CampingAccessoriesDto("Camping Mat", "Naturehike", 0.9, 1399, "Summer");
        CampingAccessoriesDto campingDto9 = new CampingAccessoriesDto("First Aid Kit", "Surviveware", 0.6, 899, "All Seasons");
        CampingAccessoriesDto campingDto10 = new CampingAccessoriesDto("Mosquito Net", "SafariPro", 1.2, 1199, "Monsoon");

        Collection<CampingAccessoriesDto> collection=new ArrayList<>();

        collection.add(campingDto1);
        collection.add(campingDto2);
        collection.add(campingDto3);
        collection.add(campingDto4);
        collection.add(campingDto5);
        collection.add(campingDto6);
        collection.add(campingDto7);
        collection.add(campingDto8);
        collection.add(campingDto9);
        collection.add(campingDto10);


        System.out.println("Camping accessories details");
        for(CampingAccessoriesDto campingAccessoriesDto: collection){
            System.out.println("Name: "+ campingAccessoriesDto.getName());
            System.out.println("Brand: "+ campingAccessoriesDto.getBrand());
            System.out.println("Weight: "+ campingAccessoriesDto.getWeight());
            System.out.println("Price: "+ campingAccessoriesDto.getPrice());
            System.out.println("Suitable Weather: "+ campingAccessoriesDto.getSuitableWeather());
        }


    }
}
