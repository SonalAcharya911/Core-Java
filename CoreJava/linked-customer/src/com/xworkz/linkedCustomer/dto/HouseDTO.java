package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HouseDTO {
    private String address;
    private int rooms;
    private boolean hasGarden;
    private SecurityDTO securityDTO;
}
