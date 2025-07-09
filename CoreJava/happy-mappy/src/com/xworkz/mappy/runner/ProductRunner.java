package com.xworkz.mappy.runner;

import com.xworkz.mappy.dto.ProductDto;
import com.xworkz.mappy.dto.VendorDto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProductRunner {
    public static void main(String[] args) {
        ProductDto productDto1 = new ProductDto("Toothpaste", "Toiletries", 89, 101);
        ProductDto productDto2 = new ProductDto("Washing Machine", "Appliances", 18999, 102);
        ProductDto productDto3 = new ProductDto("Basmati Rice 5kg", "Groceries", 549, 103);
        ProductDto productDto4 = new ProductDto("Bluetooth Earbuds", "Electronics", 2299, 104);
        ProductDto productDto5 = new ProductDto("Men's Formal Shirt", "Clothing", 1399, 105);
        ProductDto productDto6 = new ProductDto("Coffee Maker", "Appliances", 2999, 106);
        ProductDto productDto7 = new ProductDto("LED Tube Light", "Electrical", 699, 107);
        ProductDto productDto8 = new ProductDto("Smartphone Case", "Accessories", 399, 108);
        ProductDto productDto9 = new ProductDto("Olive Oil 1L", "Groceries", 699, 109);
        ProductDto productDto10 = new ProductDto("Air Conditioner", "Electronics", 32999, 110);
        ProductDto productDto11 = new ProductDto("Shampoo 650ml", "Toiletries", 349, 111);
        ProductDto productDto12 = new ProductDto("Non-stick Frying Pan", "Kitchenware", 799, 112);
        ProductDto productDto13 = new ProductDto("Curtains Set", "Home Decor", 1299, 113);
        ProductDto productDto14 = new ProductDto("Study Table", "Furniture", 5499, 114);
        ProductDto productDto15 = new ProductDto("Whey Protein 1kg", "Fitness", 2299, 115);
        ProductDto productDto16 = new ProductDto("Dishwasher Tablets", "Household", 449, 116);
        ProductDto productDto17 = new ProductDto("Sofa Set 3+1", "Furniture", 25499, 117);
        ProductDto productDto18 = new ProductDto("Kids Story Book", "Books", 299, 118);
        ProductDto productDto19 = new ProductDto("Trekking Shoes", "Footwear", 3199, 119);
        ProductDto productDto20 = new ProductDto("Hair Dryer", "Beauty", 1599, 120);
        ProductDto productDto21 = new ProductDto("Refrigerator", "Appliances", 28499, 121);
        ProductDto productDto22 = new ProductDto("Cashew Nuts 500g", "Groceries", 469, 122);
        ProductDto productDto23 = new ProductDto("Pet Shampoo", "Pet Care", 549, 123);
        ProductDto productDto24 = new ProductDto("Yoga Mat", "Fitness", 899, 124);
        ProductDto productDto25 = new ProductDto("Wall Clock", "Home Decor", 999, 125);

        VendorDto vendorDto1 = new VendorDto("FreshSmile Ltd.", 12345678, LocalDate.of(2011, 3, 12));
        VendorDto vendorDto2 = new VendorDto("AppliTech Corp.", 22345678, LocalDate.of(2009, 6, 23));
        VendorDto vendorDto3 = new VendorDto("GrainHouse Foods", 32345678, LocalDate.of(2016, 1, 15));
        VendorDto vendorDto4 = new VendorDto("SoundPro Inc.", 42345678, LocalDate.of(2014, 11, 8));
        VendorDto vendorDto5 = new VendorDto("StyleWear Pvt Ltd.", 52345678, LocalDate.of(2010, 8, 4));
        VendorDto vendorDto6 = new VendorDto("BrewMagic Appliances", 62345678, LocalDate.of(2013, 2, 27));
        VendorDto vendorDto7 = new VendorDto("BrightLite Electric", 72345678, LocalDate.of(2018, 5, 19));
        VendorDto vendorDto8 = new VendorDto("GadgetWraps", 82345678, LocalDate.of(2020, 10, 1));
        VendorDto vendorDto9 = new VendorDto("NatureGold Oils", 92345678, LocalDate.of(2015, 7, 9));
        VendorDto vendorDto10 = new VendorDto("CoolAir Systems", 10345678, LocalDate.of(2008, 9, 30));
        VendorDto vendorDto11 = new VendorDto("HerbalEssence Ltd.", 11345678, LocalDate.of(2017, 12, 25));
        VendorDto vendorDto12 = new VendorDto("CookMaster", 12345679, LocalDate.of(2012, 6, 16));
        VendorDto vendorDto13 = new VendorDto("HomeLooks", 13345678, LocalDate.of(2019, 4, 10));
        VendorDto vendorDto14 = new VendorDto("FurniSmart", 14345678, LocalDate.of(2011, 11, 5));
        VendorDto vendorDto15 = new VendorDto("FitFuel", 15345678, LocalDate.of(2016, 8, 22));
        VendorDto vendorDto16 = new VendorDto("CleanEase", 16345678, LocalDate.of(2020, 1, 14));
        VendorDto vendorDto17 = new VendorDto("SofaStudio", 17345678, LocalDate.of(2007, 5, 18));
        VendorDto vendorDto18 = new VendorDto("WonderBooks", 18345678, LocalDate.of(2021, 3, 3));
        VendorDto vendorDto19 = new VendorDto("StepStrong", 19345678, LocalDate.of(2014, 9, 27));
        VendorDto vendorDto20 = new VendorDto("GlamTech", 20345678, LocalDate.of(2010, 12, 1));
        VendorDto vendorDto21 = new VendorDto("AppliTech Corp.", 21345678, LocalDate.of(2009, 6, 23));
        VendorDto vendorDto22 = new VendorDto("NutriHarvest", 22345678, LocalDate.of(2013, 10, 7));
        VendorDto vendorDto23 = new VendorDto("PetJoy Essentials", 23345678, LocalDate.of(2018, 2, 18));
        VendorDto vendorDto24 = new VendorDto("ZenFit Gear", 24345678, LocalDate.of(2015, 7, 20));
        VendorDto vendorDto25 = new VendorDto("TimeDecor", 25345678, LocalDate.of(2016, 11, 29));

        Map<ProductDto,VendorDto> productVendorMap=new HashMap<>();
        productVendorMap.put(productDto1,vendorDto1);
        productVendorMap.put(productDto2,vendorDto2);
        productVendorMap.put(productDto3,vendorDto3);
        productVendorMap.put(productDto4,vendorDto4);
        productVendorMap.put(productDto5,vendorDto5);
        productVendorMap.put(productDto6,vendorDto6);
        productVendorMap.put(productDto7,vendorDto7);
        productVendorMap.put(productDto8,vendorDto8);
        productVendorMap.put(productDto9,vendorDto9);
        productVendorMap.put(productDto10,vendorDto10);
        productVendorMap.put(productDto11,vendorDto11);
        productVendorMap.put(productDto12,vendorDto12);
        productVendorMap.put(productDto13,vendorDto13);
        productVendorMap.put(productDto14,vendorDto14);
        productVendorMap.put(productDto15,vendorDto15);
        productVendorMap.put(productDto16,vendorDto16);
        productVendorMap.put(productDto17,vendorDto17);
        productVendorMap.put(productDto18,vendorDto18);
        productVendorMap.put(productDto19,vendorDto19);
        productVendorMap.put(productDto20,vendorDto20);
        productVendorMap.put(productDto21,vendorDto21);
        productVendorMap.put(productDto22,vendorDto22);
        productVendorMap.put(productDto23,vendorDto23);
        productVendorMap.put(productDto24,vendorDto24);
        productVendorMap.put(productDto25,vendorDto25);

        System.out.println("==========key set===========");
        productVendorMap.keySet().forEach(System.out::println);

        System.out.println("=========values===========");
        productVendorMap.values().forEach(System.out::println);

        productVendorMap.entrySet().stream().forEach(productDtoVendorDtoEntry -> System.out.println(productDtoVendorDtoEntry.getKey().getProductName()+" = "+productDtoVendorDtoEntry.getValue()));


    }
}
