package com.xworkz.appnest.dto;

import com.xworkz.appnest.constant.Type;

import java.time.LocalDate;

public class ApplicationDto {
    private String appName;
    private Type type;
    private LocalDate manufactureDate;
    private OwnerDto owner;

}
