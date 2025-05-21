package com.xworkz.clickkart.service;

import com.xworkz.clickkart.dto.ProductDto;

public class ProductServiceImpl implements ProductService{
    @Override
    public boolean save(ProductDto productDto) {
        String name=productDto.getName();
        String type= productDto.getType();
        double costPrice=productDto.getCostPrice();
        double sellingPrice=productDto.getSellingPrice();
        double mrp= productDto.getMrp();
        String description=productDto.getDescription();
        String brand=productDto.getBrand();
        int quantity=productDto.getQuantity();
        String color= productDto.getColor();
        int weight=productDto.getWeight();
        String manfDate=productDto.getManfDate();
        String warranty=productDto.getWarranty();
        boolean returnPolicy=productDto.getReturnPolicy();

        if(productDto!=null){
            System.out.println("productDto is not null");
            if(name!=null && name.length()>=3 && name.length()<=20){
                System.out.println("name is valid");
            }
            else{
                return false;
            }
            if(type!=null || type!=""){
                System.out.println("type available");
            }
            else{
                System.out.println("type is necessary");
                return false;
            }
            if(costPrice!=0 && costPrice>=50){
                System.out.println("valid cost price");
            }
            else{
                System.out.println("cost price should be greater than 50 Rs");
                return false;
            }
            if(sellingPrice!=0 && sellingPrice>=50 && sellingPrice<=mrp){
                System.out.println("valid selling price");
            }
            else{
                System.out.println("selling price should be greater than 70 Rs and less than mrp");
                return false;
            }
            if(mrp!=0 && mrp>=70){
                System.out.println("valid mrp");
            }
            else{
                System.out.println("mrp should be more than 70Rs ");
                return false;
            }
            if(description!=null && description!="" && description.length()>=5){
                System.out.println("valid description");
            }else{
                System.out.println("invalid description.....enter at least 5 characters");
                return false;
            }


        }
        else{
            System.out.println("productDto can not be null");
            return false;
        }
        return true;
    }
}
