package com.xworkz.linkedCustomer.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CountryDTO {
    private String name;
    private String currency;
    private long population;
    private PresidentDTO presidentDTO;
}
