package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class DetailDTO {
    private String description;
    private LocalDate joinedDate;
    private String status;
    private EducationDTO educationDTO;
}
