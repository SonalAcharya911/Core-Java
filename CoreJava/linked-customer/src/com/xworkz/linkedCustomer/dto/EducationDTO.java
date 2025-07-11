package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EducationDTO {
    private String degree;
    private String university;
    private int graduationYear;
    private double percentage;
}
