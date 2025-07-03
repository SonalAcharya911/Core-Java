package com.xworkz.appnest.runner;

import com.xworkz.appnest.constant.Type;
import com.xworkz.appnest.dto.ApplicationDto;
import com.xworkz.appnest.dto.OwnerDto;
import com.xworkz.appnest.repository.ApplicationRepository;
import com.xworkz.appnest.repository.ApplicationRepositoryImpl;
import com.xworkz.appnest.repository.OwnerRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {

        ApplicationRepository applicationRepository=new ApplicationRepositoryImpl();

        Collection<ApplicationDto> applicationDTOs=applicationRepository.findAll();

        applicationDTOs.stream().forEach(System.out::println);

    }
}
