package com.xworkz.linkedCustomer.runner;

import com.xworkz.linkedCustomer.dto.CustomerDTO;
import com.xworkz.linkedCustomer.dto.PassportDTO;
import com.xworkz.linkedCustomer.map.PassportMap;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerRunner {
    public static void main(String[] args) {

        Map<Integer, PassportDTO> passportDTOMap = PassportMap.getPassportMap();
        Map<Integer, CustomerDTO> customerDTOMap = new HashMap<>();


        CustomerDTO customerDTO1=new CustomerDTO("Aarav Mehta", 28, "aarav218@gmail.com", passportDTOMap.get(1));
        CustomerDTO customerDTO2=new CustomerDTO("Sneha Rao", 25, "sneha@gmail.com", passportDTOMap.get(2));
        CustomerDTO customerDTO3=new CustomerDTO("Raj Verma",32, "rajv@gmail.com", passportDTOMap.get(3));
        CustomerDTO customerDTO4=new CustomerDTO("Divya Iyer", 27, "divya@gmail.com",passportDTOMap.get(4));
        CustomerDTO customerDTO5=new CustomerDTO("Kunal Shah", 35, "kunal@gmail.com",passportDTOMap.get(5));
        CustomerDTO customerDTO6=new CustomerDTO("Pooja Nair", 30, "pooja@gmail.com", passportDTOMap.get(6));
        CustomerDTO customerDTO7=new CustomerDTO("Rishi Kapoor", 29, "rishi@gmail.com", passportDTOMap.get(7));
        CustomerDTO customerDTO8= new  CustomerDTO("Neha Sinha", 26, "neha@gmail.com", passportDTOMap.get(8));
        CustomerDTO customerDTO9= new CustomerDTO("Aman Joshi", 33, "aman@gmail.com", passportDTOMap.get(9));
        CustomerDTO customerDTO10= new CustomerDTO("Meera Pillai", 31, "meera@gmail.com", passportDTOMap.get(10));
        CustomerDTO customerDTO11= new CustomerDTO("Yash Patel", 28, "yash@gmail.com", passportDTOMap.get(11));
        CustomerDTO customerDTO12= new CustomerDTO("Ishita Menon", 24, "ishita@gmail.com", passportDTOMap.get(12));
        CustomerDTO customerDTO13= new CustomerDTO("Tarun Das", 36, "tarun@gmail.com", passportDTOMap.get(13));
        CustomerDTO customerDTO14= new CustomerDTO("Lakshmi Reddy", 27, "lakshmi@gmail.com", passportDTOMap.get(14));
        CustomerDTO customerDTO15= new CustomerDTO("Varun Bhatt", 29, "varun@gmail.com", passportDTOMap.get(15));
        CustomerDTO customerDTO16= new CustomerDTO("Sanya Gupta", 26, "sanya@gmail.com", passportDTOMap.get(16));
        CustomerDTO customerDTO17= new CustomerDTO("Manish Chawla", 34, "manish@gmail.com", passportDTOMap.get(17));
        CustomerDTO customerDTO18= new CustomerDTO("Priya Desai", 25, "priya@gmail.com", passportDTOMap.get(18));
        CustomerDTO customerDTO19= new CustomerDTO("Rohit Malhotra", 31, "rohit@gmail.com", passportDTOMap.get(19));
        CustomerDTO customerDTO20= new CustomerDTO("Kavya Sharma", 30, "kavya@gmail.com", passportDTOMap.get(20));
        CustomerDTO customerDTO21= new CustomerDTO("Aditya Jain", 28, "aditya@gmail.com", passportDTOMap.get(21));
        CustomerDTO customerDTO22= new CustomerDTO("Ananya Roy", 24, "ananya@gmail.com", passportDTOMap.get(22));
        CustomerDTO customerDTO23= new CustomerDTO("Vivek Raina", 35, "vivek@gmail.com", passportDTOMap.get(23));
        CustomerDTO customerDTO24= new CustomerDTO("Ritika Sen", 27, "ritika@gmail.com", passportDTOMap.get(24));
        CustomerDTO customerDTO25= new CustomerDTO("Siddharth Ghosh", 32, "siddharth@gmail.com", passportDTOMap.get(25));
        CustomerDTO customerDTO26= new CustomerDTO("Aisha Khan", 29, "aisha@gmail.com", passportDTOMap.get(26));
        CustomerDTO customerDTO27= new CustomerDTO("Devendra Kumar", 33, "devendra@gmail.com", passportDTOMap.get(27));
        CustomerDTO customerDTO28= new CustomerDTO("Mira Kulkarni", 26, "mira@gmail.com", passportDTOMap.get(28));
        CustomerDTO customerDTO29= new CustomerDTO("Nikhil Shetty", 30, "nikhil@gmail.com", passportDTOMap.get(29));
        CustomerDTO customerDTO30= new CustomerDTO("Tanya Bansal", 25, "tanya@gmail.com", passportDTOMap.get(30));

        Collection<CustomerDTO> customerDTOS=new LinkedList<>();
        customerDTOS.add(customerDTO1);
        customerDTOS.add(customerDTO2);
        customerDTOS.add(customerDTO3);
        customerDTOS.add(customerDTO4);
        customerDTOS.add(customerDTO5);
        customerDTOS.add(customerDTO6);
        customerDTOS.add(customerDTO7);
        customerDTOS.add(customerDTO8);
        customerDTOS.add(customerDTO9);
        customerDTOS.add(customerDTO10);
        customerDTOS.add(customerDTO11);
        customerDTOS.add(customerDTO12);
        customerDTOS.add(customerDTO13);
        customerDTOS.add(customerDTO14);
        customerDTOS.add(customerDTO15);
        customerDTOS.add(customerDTO16);
        customerDTOS.add(customerDTO17);
        customerDTOS.add(customerDTO18);
        customerDTOS.add(customerDTO19);
        customerDTOS.add(customerDTO20);
        customerDTOS.add(customerDTO21);
        customerDTOS.add(customerDTO22);
        customerDTOS.add(customerDTO23);
        customerDTOS.add(customerDTO24);
        customerDTOS.add(customerDTO25);
        customerDTOS.add(customerDTO26);
        customerDTOS.add(customerDTO27);
        customerDTOS.add(customerDTO28);
        customerDTOS.add(customerDTO29);
        customerDTOS.add(customerDTO30);

        System.out.println("===============Sort the collection by company:name in desc================");
        customerDTOS.stream()
                .sorted((dto1,dto2)->dto2.getPassportDTO().getCountryDTO().getPresidentDTO().getDriverDTO().getVehicleDTO().getCompanyDTO().getName()
                        .compareTo(dto1.getPassportDTO().getCountryDTO().getPresidentDTO().getDriverDTO().getVehicleDTO().getCompanyDTO().getName()))
                .forEach(System.out::println);

        System.out.println("=================Find a customer by job role=================");

        String jobRole="Accountant";
        customerDTOS.stream().filter(customerDTO -> customerDTO.getPassportDTO().getCountryDTO().getPresidentDTO().getDriverDTO().getVehicleDTO().getCompanyDTO().getCeoDto().getHouseDTO().getSecurityDTO().getJobDTO().getRole().equals(jobRole)).forEach(System.out::println);

        System.out.println("================Sort by Country:name in desc==============");
        customerDTOS.stream().sorted((dto1,dto2)->dto2.getPassportDTO().getCountryDTO().getName().compareTo(dto1.getPassportDTO().getCountryDTO().getName()))
                .forEach(System.out::println);

        System.out.println("=============Sort by education:qualification in asc================");
        customerDTOS.stream().sorted((dto1,dto2)->dto2.getPassportDTO().getCountryDTO().getPresidentDTO().getDriverDTO().getVehicleDTO().getCompanyDTO().getCeoDto().getHouseDTO().getSecurityDTO().getJobDTO().getDetailDTO().getEducationDTO().getDegree()
                        .compareTo(dto1.getPassportDTO().getCountryDTO().getPresidentDTO().getDriverDTO().getVehicleDTO().getCompanyDTO().getCeoDto().getHouseDTO().getSecurityDTO().getJobDTO().getDetailDTO().getEducationDTO().getDegree()))
                .forEach(System.out::println);

        System.out.println("===============Collect all unique Country=================");
        customerDTOS.stream().map((customerDTO -> customerDTO.getPassportDTO().getCountryDTO())).collect(Collectors.toSet()).forEach(System.out::println);

    }
}
