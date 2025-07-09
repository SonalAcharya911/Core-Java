package com.xworkz.mappy.runner;

import com.xworkz.mappy.dto.SareeDto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SareeRunner {
    public static void main(String[] args) {
        SareeDto sareeDto1 = new SareeDto("Silk", "Wedding", 3499.00, 6);
        SareeDto sareeDto2 = new SareeDto("Cotton", "Casual", 1199.00, 6);
        SareeDto sareeDto3 = new SareeDto("Chiffon", "Party", 1799.00, 5);
        SareeDto sareeDto4 = new SareeDto("Georgette", "Office", 1499.00, 6);
        SareeDto sareeDto5 = new SareeDto("Linen", "Festive", 1999.00, 6);
        SareeDto sareeDto6 = new SareeDto("Crepe", "Formal", 1899.00, 5);
        SareeDto sareeDto7 = new SareeDto("Organza", "Engagement", 2599.00, 6);
        SareeDto sareeDto8 = new SareeDto("Banarasi", "Wedding", 4999.00, 6);
        SareeDto sareeDto9 = new SareeDto("Tussar", "Reception", 3899.00, 6);
        SareeDto sareeDto10 = new SareeDto("Net", "Cocktail", 2999.00, 5);
        SareeDto sareeDto11 = new SareeDto("Kanjeevaram", "Traditional", 5999.00, 6);
        SareeDto sareeDto12 = new SareeDto("Khadi", "Cultural", 1499.00, 6);
        SareeDto sareeDto13 = new SareeDto("Satin", "Evening", 2199.00, 5);
        SareeDto sareeDto14 = new SareeDto("Silk Blend", "Family Function", 2399.00, 6);
        SareeDto sareeDto15 = new SareeDto("Polyester", "Daily Wear", 899.00, 6);
        SareeDto sareeDto16 = new SareeDto("Cotton Silk", "Festive", 1599.00, 6);
        SareeDto sareeDto17 = new SareeDto("Jute", "Temple Visit", 1299.00, 5);
        SareeDto sareeDto18 = new SareeDto("Velvet", "Winter Occasion", 3299.00, 6);
        SareeDto sareeDto19 = new SareeDto("Mul Cotton", "Casual", 1099.00, 6);
        SareeDto sareeDto20 = new SareeDto("Chanderi", "Celebration", 2699.00, 6);
        SareeDto sareeDto21 = new SareeDto("Raw Silk", "Bridal", 5499.00, 6);
        SareeDto sareeDto22 = new SareeDto("Art Silk", "Gifting", 999.00, 6);
        SareeDto sareeDto23 = new SareeDto("Paithani", "Maharashtrian Wedding", 6499.00, 6);
        SareeDto sareeDto24 = new SareeDto("Sambalpuri", "Traditional Event", 4199.00, 6);
        SareeDto sareeDto25 = new SareeDto("Printed Cotton", "Office", 1399.00, 6);

        List<String> colors1= Arrays.asList("Maroon", "Gold");
        List<String> colors2=Arrays.asList("Sky Blue", "White", "Navy Blue");
        List<String> colors3=Arrays.asList("Peach", "Pink");
        List<String> colors4=Arrays.asList("Navy Blue", "Silver", "Black");                
        List<String> colors5=Arrays.asList("Olive Green", "Gold", "Beige");
        List<String> colors6=Arrays.asList("Crimson Red", "Black");             
        List<String> colors7=Arrays.asList("Lavender", "Lilac", "White");
        List<String> colors8=Arrays.asList("Royal Blue", "Zari Gold", "Cream");
        List<String> colors9=Arrays.asList("Beige", "Golden Yellow", "Maroon");
        List<String> colors10=Arrays.asList("Black", "Silver", "Grey");
        List<String> colors11=Arrays.asList("Grey", "Black", "White", "Silver");
        List<String> colors12=Arrays.asList("Emerald Green", "Copper", "Gold");
        List<String> colors13=Arrays.asList("Off White", "Light Brown");
        List<String> colors14=Arrays.asList("Champagne", "Pale Gold", "Ivory");
        List<String> colors15=Arrays.asList("Teal", "Forest Green");
        List<String> colors16=Arrays.asList("Bright Yellow", "Orange", "Red");
        List<String> colors17=Arrays.asList("Pink", "Orange", "Golden Border");
        List<String> colors18=Arrays.asList("Rust Orange", "Brown", "Khaki");
        List<String> colors19= Arrays.asList("Wine", "Plum", "Black", "Rose Gold");
        List<String> colors20=Arrays.asList("Mint Green", "Sea Green", "White");
        List<String> colors21=Arrays.asList("Coral", "Peach", "Cream");
        List<String> colors22=Arrays.asList("Burgundy", "Rose Gold");                
        List<String> colors23=Arrays.asList("Turquoise Blue", "Sky Blue", "White");
        List<String> colors24=Arrays.asList("Magenta", "Gold", "Green");
        List<String> colors25=Arrays.asList("Mustard", "Maroon", "Brown");


        Map<SareeDto,List<String>> sareeColormap=new HashMap<>();
        
        sareeColormap.put(sareeDto1,colors1);
        sareeColormap.put(sareeDto2,colors2);
        sareeColormap.put(sareeDto3,colors3);
        sareeColormap.put(sareeDto4,colors4);
        sareeColormap.put(sareeDto5,colors5);
        sareeColormap.put(sareeDto6,colors6);
        sareeColormap.put(sareeDto7,colors7);
        sareeColormap.put(sareeDto8,colors8);
        sareeColormap.put(sareeDto9,colors9);
        sareeColormap.put(sareeDto10,colors10);
        sareeColormap.put(sareeDto11,colors11);
        sareeColormap.put(sareeDto12,colors12);
        sareeColormap.put(sareeDto13,colors13);
        sareeColormap.put(sareeDto14,colors14);
        sareeColormap.put(sareeDto15,colors15);
        sareeColormap.put(sareeDto16,colors16);
        sareeColormap.put(sareeDto17,colors17);
        sareeColormap.put(sareeDto18,colors18);
        sareeColormap.put(sareeDto19,colors19);
        sareeColormap.put(sareeDto20,colors20);
        sareeColormap.put(sareeDto21,colors21);
        sareeColormap.put(sareeDto22,colors22);
        sareeColormap.put(sareeDto23,colors23);
        sareeColormap.put(sareeDto24,colors24);
        sareeColormap.put(sareeDto25,colors25);
        
        
        sareeColormap.keySet().forEach(System.out::println);
        sareeColormap.values().forEach(System.out::println); 
        
                
    }
}
