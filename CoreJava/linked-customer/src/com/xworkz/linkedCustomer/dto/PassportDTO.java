package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassportDTO {
    private String number;
    private String issueDate;
    private String expiryDate;
    private CountryDTO countryDTO;
}
