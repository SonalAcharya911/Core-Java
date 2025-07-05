package com.xworkz.appnest.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class OwnerDto {
    private String name;
    private String email;
    private long phone;
}
