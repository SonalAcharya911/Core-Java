package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.ProductDto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public Collection<ProductDto> fetch() {
        ProductDto productDto1=new ProductDto(1,"Kurti","Clothing", Date.valueOf("11-09-2020"),"Zara",1400,20,1,0);

        Collection<ProductDto> products=new ArrayList<>();
        products.add(productDto1);

        return products;
    }
}
