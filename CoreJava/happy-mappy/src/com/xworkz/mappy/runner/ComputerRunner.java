package com.xworkz.mappy.runner;

import com.xworkz.mappy.dto.BrandDto;
import com.xworkz.mappy.dto.ComputerDto;

import java.util.HashMap;
import java.util.Map;

public class ComputerRunner {
    public static void main(String[] args) {
        Map<ComputerDto, BrandDto> computerBrandMap = new HashMap<>();

        computerBrandMap.put(new ComputerDto("MacBook Air M2", "Ultrabook", 1199.99, 512),
                new BrandDto("Apple", 1976, "Steve Jobs", "Cupertino, California"));

        computerBrandMap.put(new ComputerDto("XPS 15", "Laptop", 1499.99, 1024),
                new BrandDto("Dell", 1984, "Michael Dell", "Round Rock, Texas"));

        computerBrandMap.put(new ComputerDto("ROG Strix G16", "Gaming", 1799, 1024),
                new BrandDto("Asus", 1989, "T.H. Tung", "Taipei, Taiwan"));

        computerBrandMap.put(new ComputerDto("ThinkPad X1 Carbon", "Business", 1420.50, 512),
                new BrandDto("Lenovo", 1984, "Liu Chuanzhi", "Beijing, China"));

        computerBrandMap.put(new ComputerDto("Spectre x360", "Convertible", 1299, 512),
                new BrandDto("HP", 1939, "Bill Hewlett", "Palo Alto, California"));

        computerBrandMap.put(new ComputerDto("Predator Helios 300", "Gaming", 1349, 1024),
                new BrandDto("Acer", 1976, "Stan Shih", "New Taipei, Taiwan"));

        computerBrandMap.put(new ComputerDto("MSI Stealth 15M", "Gaming", 1249, 1024),
                new BrandDto("MSI", 1986, "Joseph Hsu", "New Taipei, Taiwan"));

        computerBrandMap.put(new ComputerDto("Latitude 7430", "Business", 1120, 512),
                new BrandDto("Dell", 1984, "Michael Dell", "Round Rock, Texas"));

        computerBrandMap.put(new ComputerDto("Surface Laptop 5", "Ultrabook", 999.99, 512),
                new BrandDto("Microsoft", 1975, "Bill Gates", "Redmond, Washington"));

        computerBrandMap.put(new ComputerDto("IdeaPad Slim 5", "Student", 650, 512),
                new BrandDto("Lenovo", 1984, "Liu Chuanzhi", "Beijing, China"));

        computerBrandMap.put(new ComputerDto("Alienware m15 R7", "Gaming", 1999, 2048),
                new BrandDto("Alienware", 1996, "Nelson Gonzalez", "Miami, Florida"));

        computerBrandMap.put(new ComputerDto("Gram 17", "Ultrabook", 1399.99, 1024),
                new BrandDto("LG", 1958, "Koo In-hwoi", "Seoul, South Korea"));

        computerBrandMap.put(new ComputerDto("Pavilion 15", "Student", 720, 512),
                new BrandDto("HP", 1939, "Bill Hewlett", "Palo Alto, California"));

        computerBrandMap.put(new ComputerDto("Razer Blade 16", "Gaming", 2599, 1024),
                new BrandDto("Razer", 2005, "Min-Liang Tan", "San Diego, California"));

        computerBrandMap.put(new ComputerDto("Aspire 5", "Budget", 599, 256),
                new BrandDto("Acer", 1976, "Stan Shih", "New Taipei, Taiwan"));

        computerBrandMap.put(new ComputerDto("Zenbook 14", "Ultrabook", 949, 512),
                new BrandDto("Asus", 1989, "T.H. Tung", "Taipei, Taiwan"));

        computerBrandMap.put(new ComputerDto("MateBook X Pro", "Ultrabook", 1399, 1024),
                new BrandDto("Huawei", 1987, "Ren Zhengfei", "Shenzhen, China"));

        computerBrandMap.put(new ComputerDto("Swift 3", "Student", 699, 512),
                new BrandDto("Acer", 1976, "Stan Shih", "New Taipei, Taiwan"));

        computerBrandMap.put(new ComputerDto("Elite Dragonfly", "Business", 1899, 1024),
                new BrandDto("HP", 1939, "Bill Hewlett", "Palo Alto, California"));

        computerBrandMap.put(new ComputerDto("Latitude 5420", "Business", 1250, 512),
                new BrandDto("Dell", 1984, "Michael Dell", "Round Rock, Texas"));

        computerBrandMap.put(new ComputerDto("ThinkBook 14s Yoga", "Convertible", 1100, 512),
                new BrandDto("Lenovo", 1984, "Liu Chuanzhi", "Beijing, China"));

        computerBrandMap.put(new ComputerDto("Envy x360", "Convertible", 1150, 512),
                new BrandDto("HP", 1939, "Bill Hewlett", "Palo Alto, California"));

        computerBrandMap.put(new ComputerDto("Omen 16", "Gaming", 1599, 1024),
                new BrandDto("HP", 1939, "Bill Hewlett", "Palo Alto, California"));

        computerBrandMap.put(new ComputerDto("Yoga Slim 7", "Ultrabook", 950, 512),
                new BrandDto("Lenovo", 1984, "Liu Chuanzhi", "Beijing, China"));

        computerBrandMap.put(new ComputerDto("ROG Zephyrus G14", "Gaming", 1699, 1024),
                new BrandDto("Asus", 1989, "T.H. Tung", "Taipei, Taiwan"));

        System.out.println("=========keyset=========");
        computerBrandMap.keySet().forEach(System.out::println);
        System.out.println("==============values=================");
        computerBrandMap.values().forEach(System.out::println);

        computerBrandMap.entrySet().stream().forEach(computerDtoBrandDtoEntry -> System.out.println(computerDtoBrandDtoEntry.getKey().getModel()+" = "+computerDtoBrandDtoEntry.getValue()));


    }
}

