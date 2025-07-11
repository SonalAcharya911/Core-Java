package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.CountryDTO;
import com.xworkz.linkedCustomer.dto.PresidentDTO;

import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    public static Map<Integer, CountryDTO> getCountryMap() {
        Map<Integer, PresidentDTO> presidentDTOMap = PresidentMap.getPresidentMap();
        Map<Integer, CountryDTO> countryDTOMap = new HashMap<>();

        countryDTOMap.put(1, new CountryDTO("India", "INR", 1400000000L, presidentDTOMap.get(1)));
        countryDTOMap.put(2, new CountryDTO("USA", "USD", 331000000L, presidentDTOMap.get(2)));
        countryDTOMap.put(3, new CountryDTO("China", "CNY", 1440000000L, presidentDTOMap.get(3)));
        countryDTOMap.put(4, new CountryDTO("Brazil", "BRL", 213000000L, presidentDTOMap.get(4)));
        countryDTOMap.put(5, new CountryDTO("Russia", "RUB", 146000000L, presidentDTOMap.get(5)));
        countryDTOMap.put(6, new CountryDTO("Japan", "JPY", 126000000L, presidentDTOMap.get(6)));
        countryDTOMap.put(7, new CountryDTO("Germany", "EUR", 83000000L, presidentDTOMap.get(7)));
        countryDTOMap.put(8, new CountryDTO("France", "EUR", 67000000L, presidentDTOMap.get(8)));
        countryDTOMap.put(9, new CountryDTO("UK", "GBP", 68000000L, presidentDTOMap.get(9)));
        countryDTOMap.put(10, new CountryDTO("Canada", "CAD", 38000000L, presidentDTOMap.get(10)));

        countryDTOMap.put(11, new CountryDTO("Australia", "AUD", 26000000L, presidentDTOMap.get(11)));
        countryDTOMap.put(12, new CountryDTO("Italy", "EUR", 60000000L, presidentDTOMap.get(12)));
        countryDTOMap.put(13, new CountryDTO("South Korea", "KRW", 52000000L, presidentDTOMap.get(13)));
        countryDTOMap.put(14, new CountryDTO("Mexico", "MXN", 126000000L, presidentDTOMap.get(14)));
        countryDTOMap.put(15, new CountryDTO("Spain", "EUR", 47000000L, presidentDTOMap.get(15)));
        countryDTOMap.put(16, new CountryDTO("Indonesia", "IDR", 273000000L, presidentDTOMap.get(16)));
        countryDTOMap.put(17, new CountryDTO("Turkey", "TRY", 85000000L, presidentDTOMap.get(17)));
        countryDTOMap.put(18, new CountryDTO("South Africa", "ZAR", 60000000L, presidentDTOMap.get(18)));
        countryDTOMap.put(19, new CountryDTO("Saudi Arabia", "SAR", 35000000L, presidentDTOMap.get(19)));
        countryDTOMap.put(20, new CountryDTO("Argentina", "ARS", 45000000L, presidentDTOMap.get(20)));

        countryDTOMap.put(21, new CountryDTO("Egypt", "EGP", 104000000L, presidentDTOMap.get(21)));
        countryDTOMap.put(22, new CountryDTO("Netherlands", "EUR", 17000000L, presidentDTOMap.get(22)));
        countryDTOMap.put(23, new CountryDTO("Pakistan", "PKR", 240000000L, presidentDTOMap.get(23)));
        countryDTOMap.put(24, new CountryDTO("Bangladesh", "BDT", 170000000L, presidentDTOMap.get(24)));
        countryDTOMap.put(25, new CountryDTO("Iran", "IRR", 86000000L, presidentDTOMap.get(25)));
        countryDTOMap.put(26, new CountryDTO("Nigeria", "NGN", 213000000L, presidentDTOMap.get(26)));
        countryDTOMap.put(27, new CountryDTO("Thailand", "THB", 70000000L, presidentDTOMap.get(27)));
        countryDTOMap.put(28, new CountryDTO("Vietnam", "VND", 97000000L, presidentDTOMap.get(28)));
        countryDTOMap.put(29, new CountryDTO("Malaysia", "MYR", 33000000L, presidentDTOMap.get(29)));
        countryDTOMap.put(30, new CountryDTO("Philippines", "PHP", 113000000L, presidentDTOMap.get(30)));

        return countryDTOMap;
    }
}
