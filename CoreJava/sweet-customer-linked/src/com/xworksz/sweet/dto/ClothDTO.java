package com.xworksz.sweet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ClothDTO {
    private String material;
    private int length;
    private int price;

    public ClothDTO(String material, int length, int price) {
        this.material = material;
        this.length = length;
        this.price = price;
    }
}
