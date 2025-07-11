package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DriverDTO {
    private String name;
    private String licenseNumber;
    private int experience;
    private VehicleDTO vehicleDTO;
}
