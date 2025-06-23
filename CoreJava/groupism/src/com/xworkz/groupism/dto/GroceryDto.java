package com.xworkz.groupism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class GroceryDto {
    private String name;
    private String category;
    private String quantity;
    private double price;
    private String brand;
}
