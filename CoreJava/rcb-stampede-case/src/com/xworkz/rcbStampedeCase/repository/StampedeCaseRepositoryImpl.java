package com.xworkz.rcbStampedeCase.repository;

import com.xworkz.rcbStampedeCase.dto.StampedeCaseDto;
import com.xworkz.rcbStampedeCase.service.StampedeCaseService;

public class StampedeCaseRepositoryImpl implements StampedeCaseRepository {
    @Override
    public boolean persist(StampedeCaseDto stampedeCaseDto) {
        System.out.println("running persist in StampedeCaseRepositoryImpl");
        if(stampedeCaseDto!=null){
            System.out.println("dto in persist is not null");
            return true;
        }
        return false;
    }
}
