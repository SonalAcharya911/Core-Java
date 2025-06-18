package com.xworkz.ring.dto;

import com.xworkz.ring.constant.RingConstant;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RingDto {
    private String material;
    private double weight;
    private int size;
    private double price;
    private LocalDate purchaseDate;
    private boolean haveStones;
    private boolean customMade;
    private String createdBy= RingConstant.SYSTEM.toString();
    private Timestamp createdTime;
}
