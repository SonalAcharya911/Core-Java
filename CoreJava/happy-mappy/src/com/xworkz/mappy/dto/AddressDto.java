package com.xworkz.mappy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class AddressDto {
    private int houseNumber;
    private String locality;
    private String city;
    private int pinCode;
}
