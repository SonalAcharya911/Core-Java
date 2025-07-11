package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobDTO {
    private String role;
    private double salary;
    private String department;
    private DetailDTO detailDTO;
}
