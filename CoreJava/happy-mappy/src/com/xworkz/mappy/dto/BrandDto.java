package com.xworkz.mappy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString


public class BrandDto {
    private String brandName;
    private int establishedYear;
    private String founder;
    private String headquarters;
}
