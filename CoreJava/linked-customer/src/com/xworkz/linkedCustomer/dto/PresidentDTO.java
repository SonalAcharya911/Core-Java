package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PresidentDTO {
    private String name;
    private int age;
    private int termYears;
    private DriverDTO driverDTO;
}
