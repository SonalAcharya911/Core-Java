package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.CompanyDTO;
import com.xworkz.linkedCustomer.dto.VehicleDTO;

import java.util.HashMap;
import java.util.Map;

public class VehicleMap {

    public static Map<Integer, VehicleDTO> getVehicleMap() {
        Map<Integer, CompanyDTO> companyDTOMap = CompanyMap.getCompanyMap();
        Map<Integer, VehicleDTO> vehicleDTOMap = new HashMap<>();

        vehicleDTOMap.put(1, new VehicleDTO("Honda City", "White", "KA01AB1234", companyDTOMap.get(1)));
        vehicleDTOMap.put(2, new VehicleDTO("Hyundai Verna", "Black", "MH12CD5678", companyDTOMap.get(2)));
        vehicleDTOMap.put(3, new VehicleDTO("Tata Nexon", "Blue", "TS09EF4321", companyDTOMap.get(3)));
        vehicleDTOMap.put(4, new VehicleDTO("Kia Seltos", "Red", "DL5CAB9876", companyDTOMap.get(4)));
        vehicleDTOMap.put(5, new VehicleDTO("Maruti Brezza", "Silver", "TN10GH3456", companyDTOMap.get(5)));
        vehicleDTOMap.put(6, new VehicleDTO("MG Hector", "Gray", "KA03IJ7890", companyDTOMap.get(6)));
        vehicleDTOMap.put(7, new VehicleDTO("Mahindra Thar", "Green", "MH14KL1234", companyDTOMap.get(7)));
        vehicleDTOMap.put(8, new VehicleDTO("Toyota Fortuner", "Black", "UP16MN4567", companyDTOMap.get(8)));
        vehicleDTOMap.put(9, new VehicleDTO("Skoda Kushaq", "Orange", "WB20OP6789", companyDTOMap.get(9)));
        vehicleDTOMap.put(10, new VehicleDTO("Renault Duster", "Brown", "RJ45QR9876", companyDTOMap.get(10)));

        vehicleDTOMap.put(11, new VehicleDTO("Ford EcoSport", "White", "GJ01ST1234", companyDTOMap.get(11)));
        vehicleDTOMap.put(12, new VehicleDTO("Honda Amaze", "Black", "MP09UV5678", companyDTOMap.get(12)));
        vehicleDTOMap.put(13, new VehicleDTO("Hyundai Creta", "Red", "KA51WX4321", companyDTOMap.get(13)));
        vehicleDTOMap.put(14, new VehicleDTO("Tata Harrier", "Gray", "HR26YZ9876", companyDTOMap.get(14)));
        vehicleDTOMap.put(15, new VehicleDTO("Nissan Magnite", "Silver", "CH01AB3456", companyDTOMap.get(15)));
        vehicleDTOMap.put(16, new VehicleDTO("Volkswagen Taigun", "Blue", "TN11CD7890", companyDTOMap.get(16)));
        vehicleDTOMap.put(17, new VehicleDTO("Jeep Compass", "White", "AP16EF1234", companyDTOMap.get(17)));
        vehicleDTOMap.put(18, new VehicleDTO("Maruti Swift", "Red", "OR02GH5678", companyDTOMap.get(18)));
        vehicleDTOMap.put(19, new VehicleDTO("Kia Carens", "Green", "BR06IJ4321", companyDTOMap.get(19)));
        vehicleDTOMap.put(20, new VehicleDTO("Hyundai i20", "Black", "PB08KL9876", companyDTOMap.get(20)));

        vehicleDTOMap.put(21, new VehicleDTO("Toyota Innova", "White", "KL07MN3456", companyDTOMap.get(21)));
        vehicleDTOMap.put(22, new VehicleDTO("Honda Jazz", "Blue", "DL8COP7890", companyDTOMap.get(22)));
        vehicleDTOMap.put(23, new VehicleDTO("Tata Tiago", "Orange", "CG10QR1234", companyDTOMap.get(23)));
        vehicleDTOMap.put(24, new VehicleDTO("Maruti Alto", "Silver", "GA05ST5678", companyDTOMap.get(24)));
        vehicleDTOMap.put(25, new VehicleDTO("Hyundai Venue", "Gray", "JH13UV4321", companyDTOMap.get(25)));
        vehicleDTOMap.put(26, new VehicleDTO("Mahindra XUV700", "Black", "AS21WX9876", companyDTOMap.get(26)));
        vehicleDTOMap.put(27, new VehicleDTO("Nissan Kicks", "Red", "UK09YZ3456", companyDTOMap.get(27)));
        vehicleDTOMap.put(28, new VehicleDTO("Renault Kwid", "Blue", "HP15AB7890", companyDTOMap.get(28)));
        vehicleDTOMap.put(29, new VehicleDTO("MG ZS EV", "White", "TR04CD1234", companyDTOMap.get(29)));
        vehicleDTOMap.put(30, new VehicleDTO("Ford Aspire", "Brown", "SK02EF5678", companyDTOMap.get(30)));

        return vehicleDTOMap;
    }
}
