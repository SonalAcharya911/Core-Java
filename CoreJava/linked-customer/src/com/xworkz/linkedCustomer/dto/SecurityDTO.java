package com.xworkz.linkedCustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SecurityDTO {
    private String agency;
    private int guards;
    private boolean hasCCTV;
    private JobDTO jobDTO;
}
