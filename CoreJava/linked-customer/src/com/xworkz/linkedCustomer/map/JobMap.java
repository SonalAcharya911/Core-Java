package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.DetailDTO;
import com.xworkz.linkedCustomer.dto.JobDTO;

import java.util.HashMap;
import java.util.Map;

public class JobMap {
    public static Map<Integer, JobDTO> getJobMap(){

        Map<Integer,DetailDTO> detailDTOMap= DetailMap.getDetailMap();

        Map<Integer, JobDTO> jobDTOMap=new HashMap<>();

        jobDTOMap.put(1, new JobDTO("Software Engineer", 65000.0, "Engineering", detailDTOMap.get(1)));
        jobDTOMap.put(2, new JobDTO("Business Analyst", 55000.0, "Business", detailDTOMap.get(2)));
        jobDTOMap.put(3, new JobDTO("Product Manager", 90000.0, "Product", detailDTOMap.get(3)));
        jobDTOMap.put(4, new JobDTO("Accountant", 48000.0, "Finance", detailDTOMap.get(4)));
        jobDTOMap.put(5, new JobDTO("QA Tester", 52000.0, "Quality Assurance", detailDTOMap.get(5)));
        jobDTOMap.put(6, new JobDTO("UX Designer", 67000.0, "Design", detailDTOMap.get(6)));
        jobDTOMap.put(7, new JobDTO("Customer Support Rep", 40000.0, "Support", detailDTOMap.get(7)));
        jobDTOMap.put(8, new JobDTO("Network Engineer", 62000.0, "Infrastructure", detailDTOMap.get(8)));
        jobDTOMap.put(9, new JobDTO("Marketing Lead", 70000.0, "Marketing", detailDTOMap.get(9)));
        jobDTOMap.put(10, new JobDTO("Data Analyst", 68000.0, "Data Science", detailDTOMap.get(10)));
        jobDTOMap.put(11, new JobDTO("QA Engineer", 60000.0, "Quality Assurance", detailDTOMap.get(11)));
        jobDTOMap.put(12, new JobDTO("DevOps Engineer", 75000.0, "DevOps", detailDTOMap.get(12)));
        jobDTOMap.put(13, new JobDTO("Sales Executive", 50000.0, "Sales", detailDTOMap.get(13)));
        jobDTOMap.put(14, new JobDTO("Operations Manager", 82000.0, "Operations", detailDTOMap.get(14)));
        jobDTOMap.put(15, new JobDTO("Cloud Architect", 95000.0, "Cloud", detailDTOMap.get(15)));
        jobDTOMap.put(16, new JobDTO("Business Consultant", 72000.0, "Consulting", detailDTOMap.get(16)));
        jobDTOMap.put(17, new JobDTO("HR Executive", 53000.0, "Human Resources", detailDTOMap.get(17)));
        jobDTOMap.put(18, new JobDTO("System Administrator", 61000.0, "IT", detailDTOMap.get(18)));
        jobDTOMap.put(19, new JobDTO("Technical Writer", 48000.0, "Documentation", detailDTOMap.get(19)));
        jobDTOMap.put(20, new JobDTO("Mobile Developer", 69000.0, "Engineering", detailDTOMap.get(20)));
        jobDTOMap.put(21, new JobDTO("Back-End Developer", 71000.0, "Engineering", detailDTOMap.get(21)));
        jobDTOMap.put(22, new JobDTO("Full Stack Developer", 75000.0, "Engineering", detailDTOMap.get(22)));
        jobDTOMap.put(23, new JobDTO("IT Support Specialist", 45000.0, "Support", detailDTOMap.get(23)));
        jobDTOMap.put(24, new JobDTO("SEO Specialist", 52000.0, "Marketing", detailDTOMap.get(24)));
        jobDTOMap.put(25, new JobDTO("Project Coordinator", 58000.0, "Project Management", detailDTOMap.get(25)));
        jobDTOMap.put(26, new JobDTO("Scrum Master", 83000.0, "Agile Team", detailDTOMap.get(26)));
        jobDTOMap.put(27, new JobDTO("Front-End Developer", 70000.0, "Engineering", detailDTOMap.get(27)));
        jobDTOMap.put(28, new JobDTO("Database Administrator", 74000.0, "Database", detailDTOMap.get(28)));
        jobDTOMap.put(29, new JobDTO("Content Strategist", 56000.0, "Content", detailDTOMap.get(29)));
        jobDTOMap.put(30, new JobDTO("Research Analyst", 60000.0, "Research", detailDTOMap.get(30)));


        return  jobDTOMap;

    }
}
