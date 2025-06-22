package com.xworkz.birthday.service;

import com.xworkz.birthday.dto.BirthdayPartyDto;
import com.xworkz.birthday.repository.BirthdayPartyRepository;
import com.xworkz.birthday.repository.BirthdayPartyRepositoryImpl;
import jdk.nashorn.internal.runtime.options.Option;

import java.util.Optional;

public class BirthdayPartyServiceImpl implements BirthdayPartyService{
    @Override
    public boolean validate(BirthdayPartyDto birthdayPartyDto) {
        System.out.println("running validate in BirthdayPartyServiceImpl");
        if(birthdayPartyDto!=null){
            System.out.println("dto in validate is not null");
            if(birthdayPartyDto.getGuestName()!=null && birthdayPartyDto.getGuestName().length()>=3){
                System.out.println("valid guest name");
            }
            else{
                System.out.println("invalid guest name");
                return false;
            }

            if(String.valueOf(birthdayPartyDto.getContactNumber()).length()==10){
                System.out.println("valid contact number");
            }
            else{
                System.out.println("invalid contact number");
                return false;
            }

            if(birthdayPartyDto.getEmail().endsWith(".com")){
                System.out.println("valid email");
            }
            else{
                System.out.println("invalid email");
                return false;
            }

            if(birthdayPartyDto.getRsvpStatus()!=null){
                System.out.println("rsvp valid");
            }
            else{
                System.out.println("invalid rsvp");
                return false;
            }

            if(birthdayPartyDto.getNumberOfAttendees()!=0){
                System.out.println("valid number of Attendees");
            }
            else{
                System.out.println("invalid numberOfAttendees");
                return false;
            }

            if(birthdayPartyDto.getFoodPreference()!=null){
                System.out.println("valid preference");
            }
            else{
                System.out.println("invalid preference");
                return false;
            }

            if(birthdayPartyDto.getSpecialRequests()!=null){
                System.out.println("valid request");
            }
            else{
                System.out.println("invalid request");
                return false;
            }

            BirthdayPartyRepository birthdayPartyRepository=new BirthdayPartyRepositoryImpl();
            if(birthdayPartyRepository.persist(birthdayPartyDto)==true){
                System.out.println("repo run success");
            }
            else{
                return false;
            }
            return true;
        }
        else{
            System.out.println("dto in validate is null");
        }
        return false;
    }

    @Override
    public Optional<BirthdayPartyDto[]> findAll() {
        System.out.println("running findAll in Birthday Service Impl");
        BirthdayPartyRepository birthdayPartyRepository=new BirthdayPartyRepositoryImpl();
        Optional<BirthdayPartyDto[]> birthdayPartyDtos=birthdayPartyRepository.findAll();
        if(birthdayPartyDtos.isPresent()){
            return birthdayPartyDtos;
        }
        else{
            System.out.println("null recieved by findAll in service");
        }
        return Optional.empty();
    }

    @Override
    public Optional<BirthdayPartyDto> findById(int id) {
        BirthdayPartyRepository birthdayPartyRepository=new BirthdayPartyRepositoryImpl();
        Optional<BirthdayPartyDto> optionalBirthdayPartyDto=birthdayPartyRepository.findByID(id);
        if(optionalBirthdayPartyDto.isPresent()){
            return optionalBirthdayPartyDto;
        }
        return Optional.empty();
    }
}
