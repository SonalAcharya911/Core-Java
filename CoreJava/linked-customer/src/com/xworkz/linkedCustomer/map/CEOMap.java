package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.CEODTO;
import com.xworkz.linkedCustomer.dto.HouseDTO;

import java.util.HashMap;
import java.util.Map;

public class CEOMap {
    public static Map<Integer, CEODTO> getCeoMap(){
        Map<Integer, HouseDTO> houseDTOMap=HouseMap.getHouseMap();

        Map<Integer, CEODTO> ceoDTOMap = new HashMap<>();

        ceoDTOMap.put(1, new CEODTO("Raj Malhotra", 18, 2500000.0, houseDTOMap.get(1)));
        ceoDTOMap.put(2, new CEODTO("Anjali Kapoor", 15, 2200000.0, houseDTOMap.get(2)));
        ceoDTOMap.put(3, new CEODTO("Vikram Shah", 20, 2700000.0, houseDTOMap.get(3)));
        ceoDTOMap.put(4, new CEODTO("Neha Mehta", 12, 1800000.0, houseDTOMap.get(4)));
        ceoDTOMap.put(5, new CEODTO("Rohan Sen", 17, 2400000.0, houseDTOMap.get(5)));
        ceoDTOMap.put(6, new CEODTO("Divya Iyer", 14, 2100000.0, houseDTOMap.get(6)));
        ceoDTOMap.put(7, new CEODTO("Amit Kumar", 22, 2800000.0, houseDTOMap.get(7)));
        ceoDTOMap.put(8, new CEODTO("Kavita Rao", 10, 1600000.0, houseDTOMap.get(8)));
        ceoDTOMap.put(9, new CEODTO("Sameer Joshi", 19, 2550000.0, houseDTOMap.get(9)));
        ceoDTOMap.put(10, new CEODTO("Sneha Jain", 11, 1750000.0, houseDTOMap.get(10)));
        ceoDTOMap.put(11, new CEODTO("Arjun Nair", 21, 2650000.0, houseDTOMap.get(11)));
        ceoDTOMap.put(12, new CEODTO("Meera Patil", 13, 1950000.0, houseDTOMap.get(12)));
        ceoDTOMap.put(13, new CEODTO("Aditya Verma", 18, 2500000.0, houseDTOMap.get(13)));
        ceoDTOMap.put(14, new CEODTO("Ritika Das", 16, 2300000.0, houseDTOMap.get(14)));
        ceoDTOMap.put(15, new CEODTO("Siddharth Reddy", 20, 2750000.0, houseDTOMap.get(15)));
        ceoDTOMap.put(16, new CEODTO("Priya Sinha", 14, 2050000.0, houseDTOMap.get(16)));
        ceoDTOMap.put(17, new CEODTO("Nikhil Batra", 19, 2600000.0, houseDTOMap.get(17)));
        ceoDTOMap.put(18, new CEODTO("Shreya Kulkarni", 12, 1850000.0, houseDTOMap.get(18)));
        ceoDTOMap.put(19, new CEODTO("Dev Mishra", 17, 2350000.0, houseDTOMap.get(19)));
        ceoDTOMap.put(20, new CEODTO("Isha Chawla", 10, 1700000.0, houseDTOMap.get(20)));
        ceoDTOMap.put(21, new CEODTO("Ravi Bhatt", 23, 2900000.0, houseDTOMap.get(21)));
        ceoDTOMap.put(22, new CEODTO("Pooja Agarwal", 13, 2000000.0, houseDTOMap.get(22)));
        ceoDTOMap.put(23, new CEODTO("Manish Rawat", 18, 2450000.0, houseDTOMap.get(23)));
        ceoDTOMap.put(24, new CEODTO("Tanvi Singh", 15, 2250000.0, houseDTOMap.get(24)));
        ceoDTOMap.put(25, new CEODTO("Deepak Shukla", 20, 2650000.0, houseDTOMap.get(25)));
        ceoDTOMap.put(26, new CEODTO("Nisha Bhandari", 11, 1800000.0, houseDTOMap.get(26)));
        ceoDTOMap.put(27, new CEODTO("Karan Kapoor", 19, 2580000.0, houseDTOMap.get(27)));
        ceoDTOMap.put(28, new CEODTO("Tanya Rao", 12, 1900000.0, houseDTOMap.get(28)));
        ceoDTOMap.put(29, new CEODTO("Yash Thakur", 17, 2380000.0, houseDTOMap.get(29)));
        ceoDTOMap.put(30, new CEODTO("Rhea Menon", 14, 2150000.0, houseDTOMap.get(30)));

        return ceoDTOMap;
    }
}
