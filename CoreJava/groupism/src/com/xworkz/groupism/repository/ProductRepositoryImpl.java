package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.ProductDto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public Collection<ProductDto> fetch() {
        ProductDto productDto1=new ProductDto(1,"Kurti","Clothing", Date.valueOf("2020-09-11"),"Zara",1400,20,1,0);
        ProductDto productDto2=new ProductDto(2,"Jeans","Clothing",Date.valueOf("2024-04-17"),"Levi",1200,30,1,6);
        ProductDto productDto3=new ProductDto(3,"Galaxy S3 Ultra","phone",Date.valueOf("2023-06-15"),"Samsung",124999,40,1,24);
        ProductDto productDto4=new ProductDto(4,"Washing Machine","Electronics",Date.valueOf("2020-07-14"),"Godrej",10590,34,1,12);
        ProductDto productDto5=new ProductDto(5,"Refrigerator","Electronics",Date.valueOf("2024-09-14"),"LG",25999,30,1,12);
        ProductDto productDto6=new ProductDto(6,"Microwave Oven","Electronics",Date.valueOf("2024-05-17"),"Panasonic",7490,14,2,12);
        ProductDto productDto7=new ProductDto(7,"Dressing Table","Furniture",Date.valueOf("2021-03-24"),"COTTONCUBE",5999,63,3,6);
        ProductDto productDto8=new ProductDto(8,"Dressing Table Stool","Furniture",Date.valueOf("2021-03-24"),"COTTONCUBE",2399,52,3,6);
        ProductDto productDto9=new ProductDto(9,"Charminar Basmati Rice","Grocery",Date.valueOf("2023-11-01"),"Charminar",395,10,5,0);
        ProductDto productDto10=new ProductDto(10,"Colgate MaxFresh Toothpaste 150g","Toiletries",Date.valueOf("2024-03-12"),"Colgate",99,15,15,0);
        ProductDto productDto11=new ProductDto(11,"Dettol Liquid Handwash ","Toiletries",Date.valueOf("2024-05-20"),"Dettol",149,10,12,0);
        ProductDto productDto12=new ProductDto(12,"Lakme Perfecting Liquid Foundation","Beauty",Date.valueOf("2023-12-14"),"Lakme",150,5,10,0);
        ProductDto productDto13=new ProductDto(13,"Maybelline Fit Me Compact","Beauty",Date.valueOf("2023-10-05"),"Maybelline",215,8,10,0);
        ProductDto productDto14=new ProductDto(14,"Mamaearth Ubtan Face Wash","Skincare",Date.valueOf("2024-02-07"),"Mamaearth",249,10,7,0);
        ProductDto productDto15=new ProductDto(15,"Simple Moisturizer","Skincare",Date.valueOf("2024-04-19"),"Simple",450,12,5,0);
        ProductDto productDto16=new ProductDto(16,"Men's Denim Jacket","Clothing",Date.valueOf("2023-08-16"),"HIGHLANDER",1499,20,8,3);
        ProductDto productDto17=new ProductDto(17,"Women's Floral Top","Clothing",Date.valueOf("2024-01-25"),"Tokyo Talkies",699,18,9,2);
        ProductDto productDto18=new ProductDto(18,"Printed Bedsheet with Pillow Covers","House Decor",Date.valueOf("2023-12-03"),"Cloth Fusion",899,10,6,6);
        ProductDto productDto19=new ProductDto(19,"Window Curtains","House Decor",Date.valueOf("2024-02-20"),"Home Sizzler",649,15,8,6);
        ProductDto productDto20=new ProductDto(20,"Anti-Skid Doormat","House Decor",Date.valueOf("2023-11-11"),"Saral Home",299,10,12,6);
        ProductDto productDto21=new ProductDto(21,"Corner Plant Stand Iron","Furniture",Date.valueOf("2023-09-01"),"IKEA",1299,15,3,12);
        ProductDto productDto22=new ProductDto(22,"Wall-Mounted Bookshelf","Furniture",Date.valueOf("2024-01-02"),"WOODLAB",1899,10,2,12);
        ProductDto productDto23=new ProductDto(23,"Artificial Snake Plant","Plants",Date.valueOf("2023-10-18"),"Leafy Tales",799,10,6,0);
        ProductDto productDto24=new ProductDto(24,"Potted Money Plant Live","Plants",Date.valueOf("2024-03-01"),"Ugaoo",499,5,4,0);
        ProductDto productDto25=new ProductDto(25,"Dog Food Adult","Pet Supplies",Date.valueOf("2024-05-10"),"Pedigree",675,10,4,0);
        ProductDto productDto26=new ProductDto(26,"Cat Litter ","Pet Supplies",Date.valueOf("2023-12-19"),"Drools",329,12,3,0);
        ProductDto productDto27=new ProductDto(27,"Women’s Sling Bag","Accessories",Date.valueOf("2024-01-08"),"Lino Perros",1199,20,5,6);
        ProductDto productDto28=new ProductDto(28,"Stylish Backpack for Men","Accessories",Date.valueOf("2024-04-02"),"Wildcraft",1490,15,4,12);
        ProductDto productDto29=new ProductDto(29,"Silver Plated Anklets Set","Accessories",Date.valueOf("2023-08-28"),"Zaveri Pearls",449,10,7,0);
        ProductDto productDto30=new ProductDto(30,"Hair Straightener","Electronics",Date.valueOf("2023-11-30"),"Philips",2199,25,6,24);
        ProductDto productDto31=new ProductDto(31,"Electric Kettle 1.5L","Electronics",Date.valueOf("2024-03-17"),"Pigeon",749,20,8,12);
        ProductDto productDto32=new ProductDto(32,"Bluetooth Speaker","Electronics",Date.valueOf("2023-09-05"),"boAt",1299,30,10,12);
        ProductDto productDto33=new ProductDto(33,"Wireless Earbuds","Electronics",Date.valueOf("2024-02-15"),"Noise",1699,25,12,12);
        ProductDto productDto34=new ProductDto(34,"Photo Clip Fairy Lights","House Decor",Date.valueOf("2023-12-09"),"Quace",399,15,10,6);
        ProductDto productDto35=new ProductDto(35,"Table Lamp with USB","House Decor",Date.valueOf("2024-01-18"),"Wipro",1199,10,4,12);
        ProductDto productDto36=new ProductDto(36,"Cushion Covers","House Decor",Date.valueOf("2024-03-26"),"Bella Casa",499,20,6,6);
        ProductDto productDto37=new ProductDto(37,"Bathroom Mirror with LED","House Decor",Date.valueOf("2024-04-10"),"ArtStreet",2499,12,3,12);
        ProductDto productDto38=new ProductDto(38,"Pet Water Fountain","Pet Supplies",Date.valueOf("2023-11-03"),"Wahl",1290,15,2,6);
        ProductDto productDto39=new ProductDto(39,"Pet Grooming Kit","Pet Supplies",Date.valueOf("2024-01-21"),"Wahl",1799,18,4,12);
        ProductDto productDto40=new ProductDto(40,"Indoor Bonsai Tree","Plants",Date.valueOf("2023-10-20"),"Trust Basket",699,8,5,0);
        ProductDto productDto41=new ProductDto(41,"Neem Wood Comb","Beauty",Date.valueOf("2023-09-12"),"The Ayurveda Co",199,5,10,0);
        ProductDto productDto42=new ProductDto(42,"Charcoal Face Mask","Skincare",Date.valueOf("2024-02-22"),"WOW Skin Science",349,15,7,0);
        ProductDto productDto43=new ProductDto(43,"Face Towels Pack of 6","Toiletries",Date.valueOf("2024-03-13"),"AmazonBasics",599,20,6,0);
        ProductDto productDto44=new ProductDto(44,"Hair Oil – Onion","Skincare",Date.valueOf("2024-05-04"),"WOW",299,10,6,0);
        ProductDto productDto45=new ProductDto(45,"Multi-layer Jewelry Box","Accessories",Date.valueOf("2023-12-01"),"Home Centre",899,18,4,12);
        ProductDto productDto46=new ProductDto(46,"Floral Printed Saree","Clothing",Date.valueOf("2024-04-11"),"Meesho Sarees",1099,25,6,0);
        ProductDto productDto47=new ProductDto(47,"King Size Bedsheet Set","House Decor",Date.valueOf("2023-08-13"),"Bombay Dyeing",1190,10,5,6);
        ProductDto productDto48=new ProductDto(48,"Ceramic Planter Pot","Plants",Date.valueOf("2024-02-28"),"Trust Basket",499,12,6,0);
        ProductDto productDto49=new ProductDto(49,"Men’s Casual Shirt","Clothing",Date.valueOf("2023-10-30"),"Dennis Lingo",899,15,6,2);
        ProductDto productDto50=new ProductDto(50,"Almonds","Grocery",Date.valueOf("2024-01-10"),"Vedaka",289,5,10,0);



        Collection<ProductDto> products=new ArrayList<>();
        products.add(productDto1);
        products.add(productDto2);
        products.add(productDto3);
        products.add(productDto4);
        products.add(productDto5);
        products.add(productDto6);
        products.add(productDto7);
        products.add(productDto8);
        products.add(productDto9);
        products.add(productDto10);
        products.add(productDto11);
        products.add(productDto12);
        products.add(productDto13);
        products.add(productDto14);
        products.add(productDto15);
        products.add(productDto16);
        products.add(productDto17);
        products.add(productDto18);
        products.add(productDto19);
        products.add(productDto20);
        products.add(productDto21);
        products.add(productDto22);
        products.add(productDto23);
        products.add(productDto24);
        products.add(productDto25);
        products.add(productDto26);
        products.add(productDto27);
        products.add(productDto28);
        products.add(productDto29);
        products.add(productDto30);
        products.add(productDto31);
        products.add(productDto32);
        products.add(productDto33);
        products.add(productDto34);
        products.add(productDto35);
        products.add(productDto36);
        products.add(productDto37);
        products.add(productDto38);
        products.add(productDto39);
        products.add(productDto30);
        products.add(productDto41);
        products.add(productDto42);
        products.add(productDto43);
        products.add(productDto44);
        products.add(productDto45);
        products.add(productDto46);
        products.add(productDto47);
        products.add(productDto48);
        products.add(productDto49);
        products.add(productDto50);
        return products;
    }
}
