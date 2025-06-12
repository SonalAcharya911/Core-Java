package com.xworkz.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {
    private String placeName;
    private String weather;
    private int minTemp;
    private int maxTemp;
    private String cloudy;
    private String raining;
    private int rainAmount;
    private int humidity;
    private int windSpeed;
    private LocalTime sunriseTime;
    private LocalTime sunsetTime;
    private LocalTime moonriseTime;
    private LocalTime moonsetTime;
    private LocalTime rainStartTime;
    private LocalTime rainEndTime;
    private String precipitation;
    private LocalDateTime createdDate;


}
