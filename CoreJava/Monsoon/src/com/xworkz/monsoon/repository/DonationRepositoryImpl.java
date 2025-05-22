package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.DonationDto;

public class DonationRepositoryImpl implements DonationRepository{
    @Override
    public boolean persist(DonationDto donationDto) {
        System.out.println("running persist in DonationRepositoryImpl");
        if(donationDto!=null){
            System.out.println("donationDto is not null");
        }
        else{
            System.out.println("donationDto is cannot be null");
            return false;
        }
        return true;
    }
}
