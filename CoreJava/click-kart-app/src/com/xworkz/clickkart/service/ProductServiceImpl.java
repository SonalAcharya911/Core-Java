package com.xworkz.clickkart.service;

import com.xworkz.clickkart.dto.ProductDto;

public class ProductServiceImpl implements ProductService{
    @Override
    public boolean save(ProductDto productDto) {
        if(productDto!=null){
            System.out.println("productDto is not null");
        }
        else{
            System.out.println("productDto can not be null");
        }
        return true;
    }
}
