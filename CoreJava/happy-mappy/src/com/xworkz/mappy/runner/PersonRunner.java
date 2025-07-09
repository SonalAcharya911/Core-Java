package com.xworkz.mappy.runner;

import com.xworkz.mappy.dto.AddressDto;
import com.xworkz.mappy.dto.PersonDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {
        PersonDto personDto1 = new PersonDto("Sonal", "sonalvinodkarma@gmail.com", "6797 8912 9910");
        PersonDto personDto2 = new PersonDto("Saahil", "saahilvinodkarma@gmail.com", "8527 8912 8746");
        PersonDto personDto3 = new PersonDto("Vidya", "vidyakarma@gmail.com", "7896 5846 8746");
        PersonDto personDto4 = new PersonDto("Vinod", "pvinodkumar@gmail.com", "8527 7412 8596");
        PersonDto personDto5 = new PersonDto("Anil", "anil@gmail.com", "7894 8912 8746");
        PersonDto personDto6 = new PersonDto("Chandrababu", "chandrababu@gmail.com", "5612 8912 8746");
        PersonDto personDto7 = new PersonDto("Akhil", "akhil@gmail.com", "2378 8912 8746");
        PersonDto personDto8 = new PersonDto("Amala", "amala@gmail.com", "9456 8912 8746");
        PersonDto personDto9 = new PersonDto("Natasha", "natashaarya@gmail.com", "1237 8912 8746");
        PersonDto personDto10 = new PersonDto("Mithun", "mithun@gmail.com", "8945 8912 8746");
        PersonDto personDto11 = new PersonDto("Jithin", "jithin@gmail.com", "6123 8912 8746");
        PersonDto personDto12 = new PersonDto("Rahul", "rahul@gmail.com", "7418 8912 8746");
        PersonDto personDto13 = new PersonDto("Kavya", "kavya@gmail.com", "5296 8912 8746");
        PersonDto personDto14 = new PersonDto("Varsha", "varsha@gmail.com", "3741 8912 8746");
        PersonDto personDto15 = new PersonDto("Ashwathi", "ashwathi@gmail.com", "8529 8912 8746");
        PersonDto personDto16 = new PersonDto("Vishnu", "vishnu@gmail.com", "6374 8912 8746");
        PersonDto personDto17 = new PersonDto("Reshma", "reshma@gmail.com", "1852 8912 8746");
        PersonDto personDto18 = new PersonDto("Rahana", "rahana@gmail.com", "9637 8912 8746");
        PersonDto personDto19 = new PersonDto("Rohit", "rohit@gmail.com", "4185 8912 8746");
        PersonDto personDto20 = new PersonDto("Navneet", "navnett@gmail.com", "2963 8912 8746");
        PersonDto personDto21 = new PersonDto("Angelina", "angelina@gmail.com", "1234 8912 8746");
        PersonDto personDto22 = new PersonDto("Aldrina", "aldrina@gmail.com", "5678 8912 8746");
        PersonDto personDto23 = new PersonDto("Roshna", "roshna@gmail.com", "9123 8912 8746");
        PersonDto personDto24 = new PersonDto("Sharon", "sharon@gmail.com", "4567 8912 8746");
        PersonDto personDto25 = new PersonDto("Anuprabha", "anuprabha@gmail.com", "8912 8912 8746");


        AddressDto addressDto1 = new AddressDto(205, "AECS Layout", "Bangalore", 560037);
        AddressDto addressDto2 = new AddressDto(205, "AECS Layout", "Bangalore", 560037);
        AddressDto addressDto3 = new AddressDto(205, "AECS Layout", "Bangalore", 560037);
        AddressDto addressDto4 = new AddressDto(205, "AECS Layout", "Bangalore", 560037);
        AddressDto addressDto5 = new AddressDto(456, "Velloor", "Kottayam", 658749);
        AddressDto addressDto6 = new AddressDto(456, "Velloor", "Kottayam", 658749);
        AddressDto addressDto7 = new AddressDto(333, "Pampady", "Kottayam", 658752);
        AddressDto addressDto8 = new AddressDto(333, "Pampady", "Kottayam", 658752);
        AddressDto addressDto9 = new AddressDto(120, "HSR Layout", "Bangalore", 560073);
        AddressDto addressDto10 = new AddressDto(246, "Konni", "PathanamThitta", 874563);
        AddressDto addressDto11 = new AddressDto(246, "Konni", "PathanamThitta", 874563);
        AddressDto addressDto12 = new AddressDto(198, "Ayroor", "PathanamThitta", 874521);
        AddressDto addressDto13 = new AddressDto(198, "Ayroor", "PathanamThitta", 874521);
        AddressDto addressDto14 = new AddressDto(002, "Aluva", "Kochi", 123456);
        AddressDto addressDto15 = new AddressDto(001, "Pulimkunnu", "Alapuzha", 654456);
        AddressDto addressDto16 = new AddressDto(001, "Pulimkunnu", "Alapuzha", 654456);
        AddressDto addressDto17 = new AddressDto(222, "Kallissery", "Chenganoor", 741288);
        AddressDto addressDto18 = new AddressDto(222, "Kallissery", "Chenganoor", 741288);
        AddressDto addressDto19 = new AddressDto(222, "Kallissery", "Chenganoor", 741288);
        AddressDto addressDto20 = new AddressDto(006, "Athirapally", "Kochi", 874521);
        AddressDto addressDto21 = new AddressDto(405, "Kaggadaspura", "Bangalore", 560093);
        AddressDto addressDto22 = new AddressDto(405, "Kaggadaspura", "Bangalore", 560093);
        AddressDto addressDto23 = new AddressDto(206, "Kaggadaspura", "Bangalore", 560093);
        AddressDto addressDto24 = new AddressDto(206, "Kaggadaspura", "Bangalore", 560093);
        AddressDto addressDto25 = new AddressDto(14, "Guruvayur", "Thrissur", 874521);

        Map<PersonDto, AddressDto> personAddressMap = new HashMap<>();
        personAddressMap.put(personDto1, addressDto1);
        personAddressMap.put(personDto2, addressDto1);
        personAddressMap.put(personDto3, addressDto3);
        personAddressMap.put(personDto4, addressDto4);
        personAddressMap.put(personDto5, addressDto5);
        personAddressMap.put(personDto6, addressDto6);
        personAddressMap.put(personDto7, addressDto7);
        personAddressMap.put(personDto8, addressDto8);
        personAddressMap.put(personDto9, addressDto9);
        personAddressMap.put(personDto10, addressDto10);
        personAddressMap.put(personDto11, addressDto11);
        personAddressMap.put(personDto12, addressDto12);
        personAddressMap.put(personDto13, addressDto13);
        personAddressMap.put(personDto14, addressDto14);
        personAddressMap.put(personDto15, addressDto15);
        personAddressMap.put(personDto16, addressDto16);
        personAddressMap.put(personDto17, addressDto17);
        personAddressMap.put(personDto18, addressDto18);
        personAddressMap.put(personDto19, addressDto19);
        personAddressMap.put(personDto20, addressDto20);
        personAddressMap.put(personDto21, addressDto21);
        personAddressMap.put(personDto22, addressDto22);
        personAddressMap.put(personDto23, addressDto23);
        personAddressMap.put(personDto24, addressDto24);
        personAddressMap.put(personDto25, addressDto25);

        System.out.println("==========key set===========");
        personAddressMap.keySet().forEach(System.out::println);

        System.out.println("=========values===========");
        personAddressMap.values().forEach(System.out::println);

        personAddressMap.entrySet().stream().forEach(personDtoAddressDtoEntry -> System.out.println(personDtoAddressDtoEntry.getKey().getName()+" = "+personDtoAddressDtoEntry.getValue()));


    }

}
