package com.xworkz.linkedCustomer.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompanyDTO {
    private String name;
    private String industry;
    private String location;
    private CEODTO ceoDto;
}
