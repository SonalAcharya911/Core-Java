package com.xworkz.groupism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class FurnitureDto {
    private String type;
    private String material;
    private double price;
    private String color;
    private String brand;
}
