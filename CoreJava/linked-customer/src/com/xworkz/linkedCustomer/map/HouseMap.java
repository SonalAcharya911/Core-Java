package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.HouseDTO;
import com.xworkz.linkedCustomer.dto.SecurityDTO;

import java.util.HashMap;
import java.util.Map;

public class HouseMap {
    public static Map<Integer, HouseDTO> getHouseMap(){
        Map<Integer, SecurityDTO> securityDTOMap=SecurityMap.getSecurityMap();

        Map<Integer, HouseDTO> houseDTOMap = new HashMap<>();

        houseDTOMap.put(1, new HouseDTO("12 Greenway Road", 4, true, securityDTOMap.get(1)));
        houseDTOMap.put(2, new HouseDTO("88 Rose Street", 3, false, securityDTOMap.get(2)));
        houseDTOMap.put(3, new HouseDTO("45 Oak Avenue", 5, true, securityDTOMap.get(3)));
        houseDTOMap.put(4, new HouseDTO("31 Maple Lane", 2, false, securityDTOMap.get(4)));
        houseDTOMap.put(5, new HouseDTO("76 Pine Street", 4, true, securityDTOMap.get(5)));
        houseDTOMap.put(6, new HouseDTO("23 Hilltop View", 3, false, securityDTOMap.get(6)));
        houseDTOMap.put(7, new HouseDTO("90 Silver Crest", 5, true, securityDTOMap.get(7)));
        houseDTOMap.put(8, new HouseDTO("14 Orchid Garden", 2, false, securityDTOMap.get(8)));
        houseDTOMap.put(9, new HouseDTO("61 Riverwalk Drive", 4, true, securityDTOMap.get(9)));
        houseDTOMap.put(10, new HouseDTO("39 Tulip Lane", 3, false, securityDTOMap.get(10)));

        houseDTOMap.put(11, new HouseDTO("7 Jasmine Avenue", 5, true, securityDTOMap.get(11)));
        houseDTOMap.put(12, new HouseDTO("108 Lavender Hill", 3, false, securityDTOMap.get(12)));
        houseDTOMap.put(13, new HouseDTO("67 Sunset Road", 4, true, securityDTOMap.get(13)));
        houseDTOMap.put(14, new HouseDTO("25 Mango Lane", 2, false, securityDTOMap.get(14)));
        houseDTOMap.put(15, new HouseDTO("81 Banyan Tree Blvd", 3, true, securityDTOMap.get(15)));
        houseDTOMap.put(16, new HouseDTO("16 Coconut Grove", 4, false, securityDTOMap.get(16)));
        houseDTOMap.put(17, new HouseDTO("50 Redwood Terrace", 5, true, securityDTOMap.get(17)));
        houseDTOMap.put(18, new HouseDTO("38 Lotus Park", 2, false, securityDTOMap.get(18)));
        houseDTOMap.put(19, new HouseDTO("19 Sunshine Meadows", 3, true, securityDTOMap.get(19)));
        houseDTOMap.put(20, new HouseDTO("95 Bluebell Street", 4, true, securityDTOMap.get(20)));

        houseDTOMap.put(21, new HouseDTO("63 Peacock Circle", 5, true, securityDTOMap.get(21)));
        houseDTOMap.put(22, new HouseDTO("84 Magnolia Close", 3, false, securityDTOMap.get(22)));
        houseDTOMap.put(23, new HouseDTO("27 Willow Bend", 4, true, securityDTOMap.get(23)));
        houseDTOMap.put(24, new HouseDTO("17 Coral Street", 2, false, securityDTOMap.get(24)));
        houseDTOMap.put(25, new HouseDTO("54 Ivy Trail", 3, true, securityDTOMap.get(25)));
        houseDTOMap.put(26, new HouseDTO("73 Cinnamon Hill", 4, true, securityDTOMap.get(26)));
        houseDTOMap.put(27, new HouseDTO("31 Garden View", 5, true, securityDTOMap.get(27)));
        houseDTOMap.put(28, new HouseDTO("11 Springville Road", 3, false, securityDTOMap.get(28)));
        houseDTOMap.put(29, new HouseDTO("66 Morningstar Lane", 4, true, securityDTOMap.get(29)));
        houseDTOMap.put(30, new HouseDTO("40 Paradise Circle", 5, true, securityDTOMap.get(30)));

        return houseDTOMap;
    }
}
