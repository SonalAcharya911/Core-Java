package com.xworkz.appnest.runner;

import com.xworkz.appnest.constant.Type;
import com.xworkz.appnest.constant.Version;
import com.xworkz.appnest.dto.ApplicationDto;
import com.xworkz.appnest.dto.OwnerDto;
import com.xworkz.appnest.repository.ApplicationRepository;
import com.xworkz.appnest.repository.ApplicationRepositoryImpl;
import com.xworkz.appnest.repository.OwnerRepositoryImpl;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


import static com.xworkz.appnest.constant.Type.COMMUNICATION;

public class ApplicationRunner {
    public static void main(String[] args) {

        ApplicationRepository applicationRepository=new ApplicationRepositoryImpl();

        List<ApplicationDto> applicationDTOs=applicationRepository.findAll();

        applicationDTOs.stream().forEach(System.out::println);

        System.out.println("===========Finding applications by type================");
        Type type=COMMUNICATION;
        applicationDTOs.stream().filter(applicationDTO->applicationDTO.getType().equals(type)).forEach(System.out::println);

        System.out.println("============Finding chargePerUser by Application Name=================");
        String appName="telegram";
        applicationDTOs.stream().filter(applicationDto -> applicationDto.getAppName().equals(appName)).map(ApplicationDto::getChargePerUser).forEach(System.out::println);

        System.out.println("============Find all by created date and order in desc order==========");
        LocalDate date=LocalDate.of(2023,05,06);
        applicationDTOs.stream().filter(applicationDto -> applicationDto.getManufactureDate().equals(date)).sorted((d1,d2)-> d2.getManufactureDate().compareTo(d1.getManufactureDate())).forEach(System.out::println);

        System.out.println("=================Sort all applications by Size in Desc order====================");
        applicationDTOs.stream().sorted((dto1,dto2)->Double.compare(dto2.getSize(),dto1.getSize())).forEach(System.out::println);

        System.out.println("==================Find the version by name,type=====================");
        applicationDTOs.stream().filter(applicationDto -> applicationDto.getAppName().equals(appName) && applicationDto.getType().equals(type)).forEach(System.out::println);

        System.out.println("================= Find all applications by ownerName================");
        String ownerName="Ajio";
        applicationDTOs.stream().filter(applicationDto -> applicationDto.getOwner().stream().iterator().next().getName().equalsIgnoreCase(ownerName)).forEach(System.out::println);

        System.out.println("================Find Owner's by application name=================");
        applicationDTOs.stream().filter(applicationDto -> applicationDto.getAppName().equalsIgnoreCase(appName)).map(applicationDto -> applicationDto.getOwner()).forEach(System.out::println);

        System.out.println("================Find all owner email's=================");
        applicationDTOs.stream().map(applicationDto -> applicationDto.getOwner().stream().map(ownerDto -> ownerDto.getEmail())).forEach(System.out::println);

        System.out.println("=================Find all owner name and email by type and version===================");
        List<List<OwnerDto>> someOwners=applicationDTOs.stream().filter(applicationDto -> applicationDto.getType().equals(type) && applicationDto.getVersion().equals(Version.V_2)).map(applicationDto -> applicationDto.getOwner()).collect(Collectors.toList());
        someOwners.stream().forEach(ownerDtos -> ownerDtos.stream().forEach(ownerDto -> System.out.println("owner name: "+ownerDto.getName()+"owner email: "+ownerDto.getEmail())));

        System.out.println("=================Find all application by Created Date================");
        applicationDTOs.stream().filter(applicationDto -> applicationDto.getManufactureDate().equals(date)).forEach(System.out::println);

        System.out.println("=================11. Add a application by index===============");
        ApplicationDto applicationDto51=new ApplicationDto("Nlearn",Type.EDUCATION,54,LocalDate.of(2016,05,10),applicationRepository.findAll().get(49).getOwner(),Version.V_3,true,0);
        applicationDTOs.add(50,applicationDto51);

        System.out.println("=================Remove an application by index==================");
        applicationDTOs.remove(50);

        System.out.println("=================13. Get owner by Index=================");
        applicationDTOs.get(49).getOwner();

        System.out.println("===========14. set application by index=============");
        applicationDTOs.set(50,applicationDto51);

        System.out.println("==============15 Replace owner by application name================");
        applicationDTOs.stream().filter(applicationDto -> applicationDto.getAppName().equalsIgnoreCase(appName));

    }

}
