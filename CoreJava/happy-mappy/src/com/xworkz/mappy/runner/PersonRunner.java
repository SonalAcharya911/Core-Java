package com.xworkz.mappy.runner;

import com.xworkz.mappy.dto.PersonDto;

import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {

        PersonRunner personRunner=new PersonRunner();
        List<PersonDto> list=personRunner.getPersonDetails();
        System.out.println(list);
    }

    public static List<PersonDto> getPersonDetails(){
        PersonDto personDto1=new PersonDto("Sonal","sonalvinodkarma@gmail.com","679789129910");
        PersonDto personDto2=new PersonDto("Saahil","sonalvinodkarma@gmail.com","679789129910");

        List<PersonDto> list=new ArrayList<>();
        list.add(personDto1);
        list.add(personDto2);

        return list;
    }
}
