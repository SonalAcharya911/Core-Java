package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VehicleDTO {
    private String model;
    private String color;
    private String registrationNumber;
    private CompanyDTO companyDTO;

}
