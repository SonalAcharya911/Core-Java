package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.DriverDTO;
import com.xworkz.linkedCustomer.dto.VehicleDTO;

import java.util.HashMap;
import java.util.Map;

public class DriverMap {

    public static Map<Integer, DriverDTO> getDriverMap() {
        Map<Integer, VehicleDTO> vehicleDTOMap = VehicleMap.getVehicleMap();
        Map<Integer, DriverDTO> driverDTOMap = new HashMap<>();

        driverDTOMap.put(1, new DriverDTO("Arun Yadav", "KA01A12345", 5, vehicleDTOMap.get(1)));
        driverDTOMap.put(2, new DriverDTO("Naveen Reddy", "MH12B23456", 8, vehicleDTOMap.get(2)));
        driverDTOMap.put(3, new DriverDTO("Rakesh Mehta", "TS09C34567", 10, vehicleDTOMap.get(3)));
        driverDTOMap.put(4, new DriverDTO("Suresh Kumar", "DL5CD45678", 6, vehicleDTOMap.get(4)));
        driverDTOMap.put(5, new DriverDTO("Rajesh Singh", "TN10E56789", 7, vehicleDTOMap.get(5)));
        driverDTOMap.put(6, new DriverDTO("Manoj Sharma", "KA03F67890", 9, vehicleDTOMap.get(6)));
        driverDTOMap.put(7, new DriverDTO("Karan Kapoor", "MH14G78901", 4, vehicleDTOMap.get(7)));
        driverDTOMap.put(8, new DriverDTO("Deepak Rao", "UP16H89012", 11, vehicleDTOMap.get(8)));
        driverDTOMap.put(9, new DriverDTO("Vijay Patil", "WB20J90123", 3, vehicleDTOMap.get(9)));
        driverDTOMap.put(10, new DriverDTO("Satish Das", "RJ45K01234", 12, vehicleDTOMap.get(10)));
        driverDTOMap.put(11, new DriverDTO("Amit Joshi", "GJ01L12345", 6, vehicleDTOMap.get(11)));
        driverDTOMap.put(12, new DriverDTO("Harsha Shetty", "MP09M23456", 5, vehicleDTOMap.get(12)));
        driverDTOMap.put(13, new DriverDTO("Nikhil Sinha", "KA51N34567", 9, vehicleDTOMap.get(13)));
        driverDTOMap.put(14, new DriverDTO("Varun Vyas", "HR26O45678", 10, vehicleDTOMap.get(14)));
        driverDTOMap.put(15, new DriverDTO("Ravi Chauhan", "CH01P56789", 7, vehicleDTOMap.get(15)));
        driverDTOMap.put(16, new DriverDTO("Ashok Nair", "TN11Q67890", 8, vehicleDTOMap.get(16)));
        driverDTOMap.put(17, new DriverDTO("Ganesh Iyer", "AP16R78901", 4, vehicleDTOMap.get(17)));
        driverDTOMap.put(18, new DriverDTO("Prakash Rathi", "OR02S89012", 11, vehicleDTOMap.get(18)));
        driverDTOMap.put(19, new DriverDTO("Jatin Malhotra", "BR06T90123", 6, vehicleDTOMap.get(19)));
        driverDTOMap.put(20, new DriverDTO("Surya Teja", "PB08U01234", 5, vehicleDTOMap.get(20)));
        driverDTOMap.put(21, new DriverDTO("Imran Khan", "KL07V12345", 9, vehicleDTOMap.get(21)));
        driverDTOMap.put(22, new DriverDTO("Siddharth Nair", "DL8CW23456", 10, vehicleDTOMap.get(22)));
        driverDTOMap.put(23, new DriverDTO("Tushar Saxena", "CG10X34567", 8, vehicleDTOMap.get(23)));
        driverDTOMap.put(24, new DriverDTO("Mohit Bansal", "GA05Y45678", 3, vehicleDTOMap.get(24)));
        driverDTOMap.put(25, new DriverDTO("Yogesh Singh", "JH13Z56789", 7, vehicleDTOMap.get(25)));
        driverDTOMap.put(26, new DriverDTO("Rohit Pawar", "AS21A67890", 6, vehicleDTOMap.get(26)));
        driverDTOMap.put(27, new DriverDTO("Lakshman Rao", "UK09B78901", 5, vehicleDTOMap.get(27)));
        driverDTOMap.put(28, new DriverDTO("Shahid Ali", "HP15C89012", 10, vehicleDTOMap.get(28)));
        driverDTOMap.put(29, new DriverDTO("Nitin Arora", "TR04D90123", 4, vehicleDTOMap.get(29)));
        driverDTOMap.put(30, new DriverDTO("Abhay Gupta", "SK02E01234", 11, vehicleDTOMap.get(30)));

        return driverDTOMap;
    }
}
