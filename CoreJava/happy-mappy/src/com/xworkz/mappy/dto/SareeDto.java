package com.xworkz.mappy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class SareeDto {
    private String material;
    private String occasion;
    private double price;
    private int length;

    @Override
    public int hashCode() {
        return Objects.hashCode(occasion);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running equals in saree");
        if(obj!=null){
            if(obj instanceof SareeDto){
                SareeDto saree=(SareeDto) obj;
                return this.material.equals(saree.material);
            }
        }
        return false;
    }
}
