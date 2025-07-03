package com.xworkz.appnest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class OwnerDto {
    private String name;
    private String email;
    private long phone;
}
