package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.DriverDTO;
import com.xworkz.linkedCustomer.dto.PresidentDTO;

import java.util.HashMap;
import java.util.Map;

public class PresidentMap {

    public static Map<Integer, PresidentDTO> getPresidentMap() {
        Map<Integer, DriverDTO> driverDTOMap = DriverMap.getDriverMap();
        Map<Integer, PresidentDTO> presidentDTOMap = new HashMap<>();

        presidentDTOMap.put(1, new PresidentDTO("Arvind Patil", 62, 5, driverDTOMap.get(1)));
        presidentDTOMap.put(2, new PresidentDTO("Sunita Reddy", 58, 4, driverDTOMap.get(2)));
        presidentDTOMap.put(3, new PresidentDTO("Vikram Das", 67, 6, driverDTOMap.get(3)));
        presidentDTOMap.put(4, new PresidentDTO("Neeraj Bhatia", 60, 5, driverDTOMap.get(4)));
        presidentDTOMap.put(5, new PresidentDTO("Lalitha Nair", 55, 4, driverDTOMap.get(5)));
        presidentDTOMap.put(6, new PresidentDTO("Mukesh Rao", 64, 5, driverDTOMap.get(6)));
        presidentDTOMap.put(7, new PresidentDTO("Kavita Shastri", 59, 4, driverDTOMap.get(7)));
        presidentDTOMap.put(8, new PresidentDTO("Raghav Tiwari", 61, 6, driverDTOMap.get(8)));
        presidentDTOMap.put(9, new PresidentDTO("Anjali Mehta", 57, 5, driverDTOMap.get(9)));
        presidentDTOMap.put(10, new PresidentDTO("Dinesh Kamat", 63, 4, driverDTOMap.get(10)));

        presidentDTOMap.put(11, new PresidentDTO("Poonam Iyer", 60, 5, driverDTOMap.get(11)));
        presidentDTOMap.put(12, new PresidentDTO("Shankar Verma", 62, 6, driverDTOMap.get(12)));
        presidentDTOMap.put(13, new PresidentDTO("Meenakshi Rathi", 56, 4, driverDTOMap.get(13)));
        presidentDTOMap.put(14, new PresidentDTO("Ganesh Naik", 65, 5, driverDTOMap.get(14)));
        presidentDTOMap.put(15, new PresidentDTO("Sushma Pillai", 58, 4, driverDTOMap.get(15)));
        presidentDTOMap.put(16, new PresidentDTO("Harish Rawat", 61, 6, driverDTOMap.get(16)));
        presidentDTOMap.put(17, new PresidentDTO("Shweta Saxena", 59, 5, driverDTOMap.get(17)));
        presidentDTOMap.put(18, new PresidentDTO("Kiran Sahu", 60, 4, driverDTOMap.get(18)));
        presidentDTOMap.put(19, new PresidentDTO("Prakash Deshmukh", 64, 6, driverDTOMap.get(19)));
        presidentDTOMap.put(20, new PresidentDTO("Ritika Kohli", 57, 5, driverDTOMap.get(20)));

        presidentDTOMap.put(21, new PresidentDTO("Vikas Malhotra", 62, 6, driverDTOMap.get(21)));
        presidentDTOMap.put(22, new PresidentDTO("Neha Bhargava", 55, 4, driverDTOMap.get(22)));
        presidentDTOMap.put(23, new PresidentDTO("Rajiv Rangan", 63, 5, driverDTOMap.get(23)));
        presidentDTOMap.put(24, new PresidentDTO("Geeta Sharma", 59, 4, driverDTOMap.get(24)));
        presidentDTOMap.put(25, new PresidentDTO("Abhinav Tyagi", 60, 6, driverDTOMap.get(25)));
        presidentDTOMap.put(26, new PresidentDTO("Savita Rao", 58, 5, driverDTOMap.get(26)));
        presidentDTOMap.put(27, new PresidentDTO("Bhaskar Rao", 61, 4, driverDTOMap.get(27)));
        presidentDTOMap.put(28, new PresidentDTO("Divya Khanna", 56, 5, driverDTOMap.get(28)));
        presidentDTOMap.put(29, new PresidentDTO("Uday Mahajan", 62, 6, driverDTOMap.get(29)));
        presidentDTOMap.put(30, new PresidentDTO("Aarti Mishra", 57, 4, driverDTOMap.get(30)));

        return presidentDTOMap;
    }
}
