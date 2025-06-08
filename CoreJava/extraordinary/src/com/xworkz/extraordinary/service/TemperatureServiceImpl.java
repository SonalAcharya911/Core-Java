package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.TemperatureDto;

public class TemperatureServiceImpl implements TemperatureService{
    @Override
    public boolean validate(TemperatureDto temperatureDto) {
        try{

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }
}
