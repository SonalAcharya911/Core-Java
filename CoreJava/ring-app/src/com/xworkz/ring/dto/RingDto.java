package com.xworkz.ring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor

public class RingDto {
    private String material;
    private long weight;
    private int size;
    private long price;
    private LocalDate purchaseDate;
    private boolean haveStones;
    private boolean customMade;
}
