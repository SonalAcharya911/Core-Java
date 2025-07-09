package com.xworkz.mappy.dto;

import com.xworkz.mappy.runner.ProductRunner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class ProductDto {
    private String productName;
    private String productType;
    private double price;
    private int modelNo;

    @Override
    public int hashCode() {
        System.out.println("running hashCode of product");
        return Objects.hashCode(modelNo);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running equals in product");
        if(obj!=null){
            if(obj instanceof ProductDto){
                ProductDto product=(ProductDto) obj;
                return this.productName.equals(product.productName);
            }
        }
        return false;
    }
}
