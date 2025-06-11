package com.xworkz.weather.repository;

import com.xworkz.weather.dto.WeatherDto;

public class WeatherRepositoryImpl implements WeatherRepository{
    @Override
    public boolean persist(WeatherDto weatherDto) {
        return false;
    }
}
