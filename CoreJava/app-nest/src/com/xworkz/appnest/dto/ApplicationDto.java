package com.xworkz.appnest.dto;

import com.xworkz.appnest.constant.Type;
import com.xworkz.appnest.constant.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ApplicationDto {
    private String appName;
    private Type type;
    private double size;
    private LocalDate manufactureDate;
    private List<OwnerDto> owner;
    private Version version;
    private boolean free;
    private double chargePerUser;
}
