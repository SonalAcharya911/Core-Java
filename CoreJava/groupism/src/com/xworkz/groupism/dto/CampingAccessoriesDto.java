package com.xworkz.groupism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class CampingAccessoriesDto {
    private String name;
    private String brand;
    private double weight;
    private double price;
    private String suitableWeather;
}
