package com.xworkz.groupism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SareeDto implements  Comparable<SareeDto> {
    private String occasion;
    private String material;
    private double cost;
    private String color;
    private boolean withBlousePiece;

    @Override
    public int compareTo(SareeDto o) {
        System.out.println("running compareTo...");
       // Double.compare(this.cost,o.cost);
         return o.material.compareTo(this.material);
    }
}
