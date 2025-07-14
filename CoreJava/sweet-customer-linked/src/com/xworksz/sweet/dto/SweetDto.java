package com.xworksz.sweet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Objects;


@Data
@AllArgsConstructor

public class SweetDto {
    private String name;
    private double price;
    private String[] ingredients;
    private int quantity;
    private int pack;

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof SweetDto){
                SweetDto sweet=(SweetDto) obj;
//                Set<String> thisSet = new TreeSet<>(Arrays.asList(this.ingredients));
//                Set<String> sweetSet = new TreeSet<>(Arrays.asList(sweet.ingredients));
//
//                return thisSet.equals(sweetSet);

                return Arrays.equals(this.ingredients,sweet.ingredients);
            }
        }
        return false;
    }


}
