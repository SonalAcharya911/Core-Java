package com.xworkz.groupism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ProductDto implements Comparable<ProductDto>{
    private int id;
    private String name;
    private String type;
    private Date manufacturedDate;
    private String manufacturer;
    private double costPerItem;
    private int discount;
    private int quantity;
    private int warranty;

    @Override
    public int compareTo(ProductDto o) {
        System.out.println("running compareTo");
        return Double.compare(this.id,o.id);
    }
}
