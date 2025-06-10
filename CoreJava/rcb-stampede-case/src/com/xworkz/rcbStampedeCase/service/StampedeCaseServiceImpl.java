package com.xworkz.rcbStampedeCase.service;

import com.xworkz.rcbStampedeCase.dto.StampedeCaseDto;
import com.xworkz.rcbStampedeCase.repository.StampedeCaseRepository;
import com.xworkz.rcbStampedeCase.repository.StampedeCaseRepositoryImpl;

public class StampedeCaseServiceImpl implements StampedeCaseService{
    @Override
    public String save(StampedeCaseDto stampedeCaseDto) {
        System.out.println("running save in StampedeCaseServiceImpl");
        if(stampedeCaseDto!=null){
            System.out.println("dto is not null");
            if(stampedeCaseDto.getEvent()!=null){
                System.out.println("valid event");
            }
            else{
                return "event is null";
            }
            if(stampedeCaseDto.getLocation()!=null){
                System.out.println("valid location");
            }
            else{
                return "loaction is null";
            }

            if(stampedeCaseDto.getDeaths()<0){
                System.out.println("valid number");
            }
            else{
                return "number of deaths cannot be less than zero";
            }
            if(stampedeCaseDto.getInjuries()<0){
                System.out.println("valid number");
            }
            else{
                return "number of injuries cannot be less than zero";
            }
            StampedeCaseRepository stampedeCaseRepository=new StampedeCaseRepositoryImpl();

            boolean persist=stampedeCaseRepository.persist(stampedeCaseDto);
            if(persist){
                System.out.println("data saved ");
            }
            else{
                System.out.println("data not saved");
            }
            return "Success";
        }
        return "Failed";
    }
}
