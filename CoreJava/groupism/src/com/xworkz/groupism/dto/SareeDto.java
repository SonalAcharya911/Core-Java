package com.xworkz.groupism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SareeDto {
    private String occasion;
    private String material;
    private double cost;
    private String color;
    private boolean withBlousePiece;
}
