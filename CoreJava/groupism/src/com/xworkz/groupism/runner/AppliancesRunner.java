package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.AppliancesDto;
import com.xworkz.groupism.repository.ApplianceRepository;
import com.xworkz.groupism.repository.ApplianceRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;


public class AppliancesRunner {
    public static void main(String[] args) {
        ApplianceRepository applianceRepository=new ApplianceRepositoryImpl();
        Collection<AppliancesDto> appliancesDtos=applianceRepository.findAll();
        System.out.println("appliance info");
        for(AppliancesDto appliancesDto: appliancesDtos){
            System.out.println("Name: "+ appliancesDto.getName());
            System.out.println("Brand: "+ appliancesDto.getBrand());
            System.out.println("PowerConsumption: "+ appliancesDto.getPowerConsumption());
            System.out.println("Price: "+ appliancesDto.getPrice());
            System.out.println("Warranty Period: "+ appliancesDto.getWarrantyPeriod());

        }
    }
}
