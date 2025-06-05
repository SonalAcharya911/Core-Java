package com.xworkz.restaurant.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class RestaurantDto {
    private String restaurantName;
    private String location;
    private long contact;
    private String email;
    private int rating;
    private String[] foodMenu;
    private String type;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bookedDate;
    private LocalTime bookedTime;

}
