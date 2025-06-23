package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.AppliancesDto;

import java.util.ArrayList;
import java.util.Collection;

public class AppliancesRunner {
    public static void main(String[] args) {
        AppliancesDto appliancesDto1= new AppliancesDto("Refrigerator", "LG", 180, 24999, 24);
        AppliancesDto appliancesDto2 = new AppliancesDto("Washing Machine", "Samsung", 500, 32999, 36);
        AppliancesDto appliancesDto3 = new AppliancesDto("Microwave Oven", "IFB", 1200, 10499, 24);
        AppliancesDto appliancesDto4 = new AppliancesDto("Air Conditioner", "Daikin", 1450, 41999, 60);
        AppliancesDto appliancesDto5 = new AppliancesDto("Water Purifier", "Kent", 60, 8999, 12);
        AppliancesDto appliancesDto6 = new AppliancesDto("Ceiling Fan", "Havells", 75, 2999, 24);
        AppliancesDto appliancesDto7 = new AppliancesDto("Induction Cooktop", "Prestige", 2000, 3499, 12);
        AppliancesDto appliancesDto8 = new AppliancesDto("Vacuum Cleaner", "Eureka Forbes", 1400, 7999, 18);
        AppliancesDto appliancesDto9 = new AppliancesDto("Geyser", "AO Smith", 2000, 11499, 36);
        AppliancesDto appliancesDto10 = new AppliancesDto("Mixer Grinder", "Bajaj", 750, 2999, 24);

        Collection<AppliancesDto> appliancesDtos=new ArrayList<>();

        appliancesDtos.add(appliancesDto1);
        appliancesDtos.add(appliancesDto2);
        appliancesDtos.add(appliancesDto3);
        appliancesDtos.add(appliancesDto4);
        appliancesDtos.add(appliancesDto5);
        appliancesDtos.add(appliancesDto6);
        appliancesDtos.add(appliancesDto7);
        appliancesDtos.add(appliancesDto8);
        appliancesDtos.add(appliancesDto9);
        appliancesDtos.add(appliancesDto10);

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
