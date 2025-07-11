package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.CEODTO;
import com.xworkz.linkedCustomer.dto.CompanyDTO;

import java.util.HashMap;
import java.util.Map;

public class CompanyMap {
    public static Map<Integer, CompanyDTO> getCompanyMap(){
        Map<Integer,CEODTO> ceoDTOMap=CEOMap.getCeoMap();

        Map<Integer, CompanyDTO> companyDTOMap = new HashMap<>();

        companyDTOMap.put(1, new CompanyDTO("TechNova", "Technology", "Bangalore", ceoDTOMap.get(1)));
        companyDTOMap.put(2, new CompanyDTO("FinEdge", "Finance", "Mumbai", ceoDTOMap.get(2)));
        companyDTOMap.put(3, new CompanyDTO("HealthSync", "Healthcare", "Hyderabad", ceoDTOMap.get(3)));
        companyDTOMap.put(4, new CompanyDTO("EcoLife", "Environment", "Delhi", ceoDTOMap.get(4)));
        companyDTOMap.put(5, new CompanyDTO("RetailSphere", "Retail", "Chennai", ceoDTOMap.get(5)));
        companyDTOMap.put(6, new CompanyDTO("EduCore", "Education", "Pune", ceoDTOMap.get(6)));
        companyDTOMap.put(7, new CompanyDTO("AgriGrow", "Agriculture", "Nagpur", ceoDTOMap.get(7)));
        companyDTOMap.put(8, new CompanyDTO("CyberWall", "Cybersecurity", "Noida", ceoDTOMap.get(8)));
        companyDTOMap.put(9, new CompanyDTO("TransWorld", "Logistics", "Kolkata", ceoDTOMap.get(9)));
        companyDTOMap.put(10, new CompanyDTO("DesignNest", "Interior Design", "Jaipur", ceoDTOMap.get(10)));

        companyDTOMap.put(11, new CompanyDTO("MedSure", "Pharmaceuticals", "Ahmedabad", ceoDTOMap.get(11)));
        companyDTOMap.put(12, new CompanyDTO("GreenTech", "Renewable Energy", "Bhopal", ceoDTOMap.get(12)));
        companyDTOMap.put(13, new CompanyDTO("QuantumSoft", "Software", "Bangalore", ceoDTOMap.get(13)));
        companyDTOMap.put(14, new CompanyDTO("FinMate", "Fintech", "Gurgaon", ceoDTOMap.get(14)));
        companyDTOMap.put(15, new CompanyDTO("AutoPrime", "Automobile", "Chandigarh", ceoDTOMap.get(15)));
        companyDTOMap.put(16, new CompanyDTO("InnoStruct", "Construction", "Coimbatore", ceoDTOMap.get(16)));
        companyDTOMap.put(17, new CompanyDTO("MarketLoop", "E-commerce", "Lucknow", ceoDTOMap.get(17)));
        companyDTOMap.put(18, new CompanyDTO("AdPlus", "Advertising", "Indore", ceoDTOMap.get(18)));
        companyDTOMap.put(19, new CompanyDTO("GameOn", "Gaming", "Mangalore", ceoDTOMap.get(19)));
        companyDTOMap.put(20, new CompanyDTO("BioZen", "Biotech", "Surat", ceoDTOMap.get(20)));

        companyDTOMap.put(21, new CompanyDTO("CleanServe", "Sanitation", "Vishakhapatnam", ceoDTOMap.get(21)));
        companyDTOMap.put(22, new CompanyDTO("SkyPort", "Aviation", "Delhi", ceoDTOMap.get(22)));
        companyDTOMap.put(23, new CompanyDTO("DataSecure", "Data Services", "Bangalore", ceoDTOMap.get(23)));
        companyDTOMap.put(24, new CompanyDTO("DecorEdge", "Home Decor", "Mysore", ceoDTOMap.get(24)));
        companyDTOMap.put(25, new CompanyDTO("FitLife", "Fitness", "Thane", ceoDTOMap.get(25)));
        companyDTOMap.put(26, new CompanyDTO("VoiceNext", "Telecom", "Patna", ceoDTOMap.get(26)));
        companyDTOMap.put(27, new CompanyDTO("BuildMate", "Real Estate", "Raipur", ceoDTOMap.get(27)));
        companyDTOMap.put(28, new CompanyDTO("FreshBite", "Food Delivery", "Nashik", ceoDTOMap.get(28)));
        companyDTOMap.put(29, new CompanyDTO("DreamCanvas", "Media", "Amritsar", ceoDTOMap.get(29)));
        companyDTOMap.put(30, new CompanyDTO("SmartRent", "Property Tech", "Udaipur", ceoDTOMap.get(30)));

        return companyDTOMap;
    }
}
