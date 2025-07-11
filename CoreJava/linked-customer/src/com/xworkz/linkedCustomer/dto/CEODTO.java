package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CEODTO {
    private String name;
    private int experience;
    private double salary;
    private HouseDTO houseDTO;
}
