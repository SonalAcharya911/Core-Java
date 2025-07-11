package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.EducationDTO;

import java.util.HashMap;
import java.util.Map;

public class EducationMap {
    public static Map<Integer, EducationDTO> getEducationMap(){
        Map<Integer, EducationDTO> educationMap = new HashMap<>();

        educationMap.put(1, new EducationDTO("B.Tech", "IIT Bombay", 2020, 78.5));
        educationMap.put(2, new EducationDTO("B.Sc", "Delhi University", 2019, 72.3));
        educationMap.put(3, new EducationDTO("MBA", "IIM Bangalore", 2023, 84.7));
        educationMap.put(4, new EducationDTO("B.Com", "Mumbai University", 2018, 69.2));
        educationMap.put(5, new EducationDTO("MCA", "NIT Trichy", 2022, 80.1));
        educationMap.put(6, new EducationDTO("B.Tech", "NIT Warangal", 2021, 77.4));
        educationMap.put(7, new EducationDTO("B.Sc", "Loyola College", 2020, 73.9));
        educationMap.put(8, new EducationDTO("MBA", "IIM Ahmedabad", 2022, 85.2));
        educationMap.put(9, new EducationDTO("B.Com", "Christ University", 2019, 70.8));
        educationMap.put(10, new EducationDTO("MCA", "VIT Vellore", 2023, 81.3));
        educationMap.put(11, new EducationDTO("B.Tech", "IIT Delhi", 2021, 79.5));
        educationMap.put(12, new EducationDTO("B.Sc", "Presidency University", 2020, 71.6));
        educationMap.put(13, new EducationDTO("MBA", "XLRI Jamshedpur", 2023, 83.9));
        educationMap.put(14, new EducationDTO("B.Com", "Osmania University", 2018, 68.7));
        educationMap.put(15, new EducationDTO("MCA", "SRM University", 2022, 79.4));
        educationMap.put(16, new EducationDTO("B.Tech", "IIIT Hyderabad", 2020, 76.8));
        educationMap.put(17, new EducationDTO("B.Sc", "St. Xavier's College", 2019, 74.1));
        educationMap.put(18, new EducationDTO("MBA", "SP Jain Institute", 2023, 86.0));
        educationMap.put(19, new EducationDTO("B.Com", "Symbiosis College", 2020, 71.2));
        educationMap.put(20, new EducationDTO("MCA", "Manipal University", 2021, 78.3));
        educationMap.put(21, new EducationDTO("B.Tech", "IIT Kharagpur", 2019, 80.0));
        educationMap.put(22, new EducationDTO("B.Sc", "Fergusson College", 2021, 75.4));
        educationMap.put(23, new EducationDTO("MBA", "NMIMS", 2022, 82.7));
        educationMap.put(24, new EducationDTO("B.Com", "Hindu College", 2018, 69.9));
        educationMap.put(25, new EducationDTO("MCA", "Amity University", 2023, 77.6));
        educationMap.put(26, new EducationDTO("B.Tech", "VJTI", 2020, 78.8));
        educationMap.put(27, new EducationDTO("B.Sc", "Hansraj College", 2022, 72.1));
        educationMap.put(28, new EducationDTO("MBA", "ISB Hyderabad", 2023, 84.4));
        educationMap.put(29, new EducationDTO("B.Com", "R.A. Podar College", 2019, 70.0));
        educationMap.put(30, new EducationDTO("MCA", "Anna University", 2021, 79.9));

        return educationMap;
    }
}
