package com.xworkz.monsoon.service;

import com.xworkz.monsoon.dto.DonationDto;
import com.xworkz.monsoon.servlet.DonationServlet;

public class DonationServiceImpl implements DonationService{

    public DonationServiceImpl(){
        System.out.println("DonationServiceImpl created...");
    }
    @Override
    public boolean save(DonationDto donationDto) {
        System.out.println("running save in DonationServiceImpl...");
        if(donationDto!=null){
            System.out.println("donationDto is not null");
            if(donationDto.getName()!=null && donationDto.getName().length()>=3){
                System.out.println("name is valid");
            }
            else{
                System.out.println("name is not valid");
                return false;
            }
            if (donationDto.getContact()!=0){
                System.out.println("valid contact");
            }
            else{
                System.out.println("contact is not valid");
                return false;
            }

        }
        else{
            System.out.println("donationDto is cannot be null");
            return false;
        }
        return true;
    }
}
