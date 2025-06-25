package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.AppliancesDto;
import com.xworkz.groupism.repository.ApplianceRepository;
import com.xworkz.groupism.repository.ApplianceRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


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

        System.out.println("using Iterator");
        Iterator<AppliancesDto> iterator=appliancesDtos.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
            if(iterator.next().getName().equals("Geyser")){
                iterator.remove();
            }
            if(appliancesDtos.contains("Chiffon")){
                System.out.println(iterator+" : contains red");
            }

            if(appliancesDtos.isEmpty()){
                System.out.println("appliancesDtos is empty");
            }

            if(appliancesDtos.addAll(appliancesDtos)){

                System.out.println("addAll method");
            }

            if(appliancesDtos.containsAll(appliancesDtos)){
                System.out.println("containsAll success");

            }
            if(appliancesDtos.removeAll(appliancesDtos)){
                System.out.println("remove all success");
            }

        }

        System.out.println("Appliances above 10,000 Rs.");
        for(AppliancesDto appliancesDto:appliancesDtos){
            if(appliancesDto.getPrice()>10000){
                System.out.println("Appliance: "+ appliancesDto.getName()+" costs Rs."+ appliancesDto.getPrice());
            }
        }
    }
}
