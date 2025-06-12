package com.xworkz.weather.service;

import com.xworkz.weather.dto.WeatherDto;
import com.xworkz.weather.repository.WeatherRepository;
import com.xworkz.weather.repository.WeatherRepositoryImpl;

public class WeatherServiceImpl implements WeatherService{
    @Override
    public boolean validate(WeatherDto weatherDto) {
        if(weatherDto!=null){
            //place
            if(weatherDto.getPlaceName()!=null){
                System.out.println("valid place");
            }
            else{
                System.out.println("place in null");
                return false;
            }
            //weather
            if(weatherDto.getWeather()!=null){
                System.out.println("valid weather");
            }
            else{
                System.out.println("invalid weather");
                return false;
            }
            if(weatherDto.getSunriseTime()!=null&&weatherDto.getSunsetTime()!=null && weatherDto.getMoonriseTime()!=null && weatherDto.getMoonsetTime()!=null && weatherDto.getRainStartTime()!=null && weatherDto.getRainEndTime()!=null){
                System.out.println("valid times");
            }
            else{
                System.out.println("invalid times");
                return false;
            }

            ////////////////////////////////////////////////////////////////
            WeatherRepository weatherRepository=new WeatherRepositoryImpl();
            boolean persistant=weatherRepository.persist(weatherDto);
            if(persistant){
                System.out.println("repo is peristant");
                System.out.println("data is saved in the database");
            }
            else{
                System.out.println("problem in repo");
                return false;
            }
            return true;
        }
        return false;
    }
}
