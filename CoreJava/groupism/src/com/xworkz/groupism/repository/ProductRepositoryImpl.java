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
        ProductDto productDto2=new ProductDto();
        ProductDto productDto3=new ProductDto();
        ProductDto productDto4=new ProductDto();
        ProductDto productDto5=new ProductDto();
        ProductDto productDto6=new ProductDto();
        ProductDto productDto7=new ProductDto();
        ProductDto productDto8=new ProductDto();
        ProductDto productDto9=new ProductDto();
        ProductDto productDto10=new ProductDto();
        ProductDto productDto11=new ProductDto();
        ProductDto productDto12=new ProductDto();
        ProductDto productDto13=new ProductDto();
        ProductDto productDto14=new ProductDto();
        ProductDto productDto15=new ProductDto();
        ProductDto productDto16=new ProductDto();
        ProductDto productDto17=new ProductDto();
        ProductDto productDto18=new ProductDto();
        ProductDto productDto19=new ProductDto();
        ProductDto productDto20=new ProductDto();
        ProductDto productDto21=new ProductDto();
        ProductDto productDto22=new ProductDto();
        ProductDto productDto23=new ProductDto();
        ProductDto productDto24=new ProductDto();
        ProductDto productDto25=new ProductDto();
        ProductDto productDto26=new ProductDto();
        ProductDto productDto27=new ProductDto();
        ProductDto productDto28=new ProductDto();
        ProductDto productDto29=new ProductDto();

        Collection<ProductDto> products=new ArrayList<>();
        products.add(productDto1);

        return products;
    }
}
