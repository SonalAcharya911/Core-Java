package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.TemperatureDto;

public class TemperatureServiceImpl implements TemperatureService{
    @Override
    public boolean validate(TemperatureDto temperatureDto) {
        try{
            if(temperatureDto!=null){
                double temp=Double.parseDouble(temperatureDto.)

            }
            else{
                throw new NullPointerException("dto is null")
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }
}
