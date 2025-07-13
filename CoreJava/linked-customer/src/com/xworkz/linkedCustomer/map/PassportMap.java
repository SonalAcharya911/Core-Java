package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.CountryDTO;
import com.xworkz.linkedCustomer.dto.PassportDTO;

import java.util.HashMap;
import java.util.Map;

public class PassportMap {

    public static Map<Integer, PassportDTO> getPassportMap() {
        Map<Integer, CountryDTO> countryDTOMap = CountryMap.getCountryMap();
        Map<Integer, PassportDTO> passportDTOMap = new HashMap<>();

        passportDTOMap.put(1, new PassportDTO("P0012345", "2015-06-12", "2025-06-12", countryDTOMap.get(1)));
        passportDTOMap.put(2, new PassportDTO("P0012346", "2016-07-01", "2026-07-01", countryDTOMap.get(2)));
        passportDTOMap.put(3, new PassportDTO("P0012347", "2017-08-21", "2027-08-21", countryDTOMap.get(3)));
        passportDTOMap.put(4, new PassportDTO("P0012348", "2014-05-10", "2024-05-10", countryDTOMap.get(4)));
        passportDTOMap.put(5, new PassportDTO("P0012349", "2018-09-15", "2028-09-15", countryDTOMap.get(5)));
        passportDTOMap.put(6, new PassportDTO("P0012350", "2019-01-03", "2029-01-03", countryDTOMap.get(6)));
        passportDTOMap.put(7, new PassportDTO("P0012351", "2013-11-22", "2023-11-22", countryDTOMap.get(7)));
        passportDTOMap.put(8, new PassportDTO("P0012352", "2020-04-17", "2030-04-17", countryDTOMap.get(8)));
        passportDTOMap.put(9, new PassportDTO("P0012353", "2016-02-28", "2026-02-28", countryDTOMap.get(9)));
        passportDTOMap.put(10, new PassportDTO("P0012354", "2015-12-30", "2025-12-30", countryDTOMap.get(10)));
        passportDTOMap.put(11, new PassportDTO("P0012355", "2017-06-18", "2027-06-18", countryDTOMap.get(11)));
        passportDTOMap.put(12, new PassportDTO("P0012356", "2018-10-05", "2028-10-05", countryDTOMap.get(12)));
        passportDTOMap.put(13, new PassportDTO("P0012357", "2014-01-19", "2024-01-19", countryDTOMap.get(13)));
        passportDTOMap.put(14, new PassportDTO("P0012358", "2019-07-26", "2029-07-26", countryDTOMap.get(14)));
        passportDTOMap.put(15, new PassportDTO("P0012359", "2013-09-09", "2023-09-09", countryDTOMap.get(15)));
        passportDTOMap.put(16, new PassportDTO("P0012360", "2015-03-14", "2025-03-14", countryDTOMap.get(16)));
        passportDTOMap.put(17, new PassportDTO("P0012361", "2016-12-01", "2026-12-01", countryDTOMap.get(17)));
        passportDTOMap.put(18, new PassportDTO("P0012362", "2017-08-08", "2027-08-08", countryDTOMap.get(18)));
        passportDTOMap.put(19, new PassportDTO("P0012363", "2020-01-23", "2030-01-23", countryDTOMap.get(19)));
        passportDTOMap.put(20, new PassportDTO("P0012364", "2019-05-06", "2029-05-06", countryDTOMap.get(20)));
        passportDTOMap.put(21, new PassportDTO("P0012365", "2015-06-30", "2025-06-30", countryDTOMap.get(21)));
        passportDTOMap.put(22, new PassportDTO("P0012366", "2016-11-11", "2026-11-11", countryDTOMap.get(22)));
        passportDTOMap.put(23, new PassportDTO("P0012367", "2017-07-07", "2027-07-07", countryDTOMap.get(23)));
        passportDTOMap.put(24, new PassportDTO("P0012368", "2014-03-27", "2024-03-27", countryDTOMap.get(24)));
        passportDTOMap.put(25, new PassportDTO("P0012369", "2018-10-19", "2028-10-19", countryDTOMap.get(25)));
        passportDTOMap.put(26, new PassportDTO("P0012370", "2020-02-15", "2030-02-15", countryDTOMap.get(26)));
        passportDTOMap.put(27, new PassportDTO("P0012371", "2015-01-01", "2025-01-01", countryDTOMap.get(27)));
        passportDTOMap.put(28, new PassportDTO("P0012372", "2016-04-04", "2026-04-04", countryDTOMap.get(28)));
        passportDTOMap.put(29, new PassportDTO("P0012373", "2019-09-09", "2029-09-09", countryDTOMap.get(29)));
        passportDTOMap.put(30, new PassportDTO("P0012374", "2021-01-01", "2031-01-01", countryDTOMap.get(30)));

        return passportDTOMap;
    }
}
