package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.DetailDTO;
import com.xworkz.linkedCustomer.dto.EducationDTO;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class DetailMap {
    public static Map<Integer, DetailDTO> getDetailMap(){


        Map<Integer,EducationDTO> educationDTOMap=EducationMap.getEducationMap();

        DetailDTO detailDTO1 = new DetailDTO("Software developer", LocalDate.of(2021, 3, 15), "Active", educationDTOMap.get(1));
        DetailDTO detailDTO2 = new DetailDTO("Financial analyst", LocalDate.of(2020, 7, 10), "Resigned", educationDTOMap.get(2));
        DetailDTO detailDTO3 = new DetailDTO("Product manager", LocalDate.of(2022, 1, 5), "Active", educationDTOMap.get(3));
        DetailDTO detailDTO4 = new DetailDTO("Account executive", LocalDate.of(2019, 6, 20), "On Leave", educationDTOMap.get(4));
        DetailDTO detailDTO5 = new DetailDTO("Software tester", LocalDate.of(2021, 11, 11), "Active", educationDTOMap.get(5));
        DetailDTO detailDTO6 = new DetailDTO("UI/UX designer", LocalDate.of(2022, 5, 9), "Active", educationDTOMap.get(6));
        DetailDTO detailDTO7 = new DetailDTO("Customer support", LocalDate.of(2020, 2, 1), "Resigned", educationDTOMap.get(7));
        DetailDTO detailDTO8 = new DetailDTO("Network engineer", LocalDate.of(2021, 9, 13), "Active", educationDTOMap.get(8));
        DetailDTO detailDTO9 = new DetailDTO("Marketing lead", LocalDate.of(2022, 8, 25), "Active", educationDTOMap.get(9));
        DetailDTO detailDTO10 = new DetailDTO("Data analyst", LocalDate.of(2020, 10, 18), "Transferred", educationDTOMap.get(10));
        DetailDTO detailDTO11 = new DetailDTO("QA engineer", LocalDate.of(2021, 4, 8), "Active", educationDTOMap.get(11));
        DetailDTO detailDTO12 = new DetailDTO("DevOps engineer", LocalDate.of(2023, 1, 22), "Active", educationDTOMap.get(12));
        DetailDTO detailDTO13 = new DetailDTO("Sales associate", LocalDate.of(2020, 6, 30), "Resigned", educationDTOMap.get(13));
        DetailDTO detailDTO14 = new DetailDTO("Operations manager", LocalDate.of(2019, 12, 12), "Promoted", educationDTOMap.get(14));
        DetailDTO detailDTO15 = new DetailDTO("Cloud architect", LocalDate.of(2022, 3, 3), "Active", educationDTOMap.get(15));
        DetailDTO detailDTO16 = new DetailDTO("Business analyst", LocalDate.of(2021, 8, 27), "Active", educationDTOMap.get(16));
        DetailDTO detailDTO17 = new DetailDTO("HR executive", LocalDate.of(2020, 5, 16), "Resigned", educationDTOMap.get(17));
        DetailDTO detailDTO18 = new DetailDTO("System admin", LocalDate.of(2022, 7, 1), "Active", educationDTOMap.get(18));
        DetailDTO detailDTO19 = new DetailDTO("Technical writer", LocalDate.of(2020, 9, 5), "Active", educationDTOMap.get(19));
        DetailDTO detailDTO20 = new DetailDTO("Mobile developer", LocalDate.of(2021, 12, 19), "Transferred", educationDTOMap.get(20));
        DetailDTO detailDTO21 = new DetailDTO("Back-end developer", LocalDate.of(2022, 2, 4), "Active", educationDTOMap.get(21));
        DetailDTO detailDTO22 = new DetailDTO("Full stack engineer", LocalDate.of(2020, 11, 28), "Resigned", educationDTOMap.get(22));
        DetailDTO detailDTO23 = new DetailDTO("IT support", LocalDate.of(2021, 6, 6), "On Leave", educationDTOMap.get(23));
        DetailDTO detailDTO24 = new DetailDTO("SEO specialist", LocalDate.of(2019, 10, 9), "Active", educationDTOMap.get(24));
        DetailDTO detailDTO25 = new DetailDTO("Project coordinator", LocalDate.of(2022, 1, 14), "Active", educationDTOMap.get(25));
        DetailDTO detailDTO26 = new DetailDTO("Scrum master", LocalDate.of(2021, 7, 7), "Active", educationDTOMap.get(26));
        DetailDTO detailDTO27 = new DetailDTO("Front-end developer", LocalDate.of(2020, 3, 3), "Transferred", educationDTOMap.get(27));
        DetailDTO detailDTO28 = new DetailDTO("Database admin", LocalDate.of(2021, 5, 12), "Active", educationDTOMap.get(28));
        DetailDTO detailDTO29 = new DetailDTO("Content strategist", LocalDate.of(2019, 9, 17), "Resigned", educationDTOMap.get(29));
        DetailDTO detailDTO30 = new DetailDTO("Research analyst", LocalDate.of(2022, 6, 21), "Active", educationDTOMap.get(30));

        Map<Integer, DetailDTO> detailDTOMap = new HashMap<>();
        detailDTOMap.put(1,detailDTO1);
        detailDTOMap.put(2,detailDTO2);
        detailDTOMap.put(3,detailDTO3);
        detailDTOMap.put(4,detailDTO4);
        detailDTOMap.put(5,detailDTO5);
        detailDTOMap.put(6,detailDTO6);
        detailDTOMap.put(7,detailDTO7);
        detailDTOMap.put(8,detailDTO8);
        detailDTOMap.put(9,detailDTO9);
        detailDTOMap.put(10,detailDTO10);
        detailDTOMap.put(11,detailDTO11);
        detailDTOMap.put(12,detailDTO12);
        detailDTOMap.put(13,detailDTO13);
        detailDTOMap.put(14,detailDTO14);
        detailDTOMap.put(15,detailDTO15);
        detailDTOMap.put(16,detailDTO16);
        detailDTOMap.put(17,detailDTO17);
        detailDTOMap.put(18,detailDTO18);
        detailDTOMap.put(19,detailDTO19);
        detailDTOMap.put(20,detailDTO20);
        detailDTOMap.put(21,detailDTO21);
        detailDTOMap.put(22,detailDTO22);
        detailDTOMap.put(23,detailDTO23);
        detailDTOMap.put(24,detailDTO24);
        detailDTOMap.put(25,detailDTO25);
        detailDTOMap.put(26,detailDTO26);
        detailDTOMap.put(27,detailDTO27);
        detailDTOMap.put(28,detailDTO28);
        detailDTOMap.put(29,detailDTO29);
        detailDTOMap.put(30,detailDTO30);

        return  detailDTOMap;
    }
}
