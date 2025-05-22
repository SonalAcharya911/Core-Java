package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.DonationDto;

public class DonationRepositoryImpl implements DonationRepository{
    @Override
    public boolean persist(DonationDto donationDto) {
        System.out.println("running persist in DonationRepositoryImpl");

        return false;
    }
}
