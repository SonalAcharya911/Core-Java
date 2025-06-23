package com.xworkz.groupism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class AppliancesDto {
    private String name;
    private String brand;
    private int powerConsumption;
    private double price;
    private int warrantyPeriod;
}
