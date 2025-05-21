package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.DonationDto;

public interface DonationRepository {
    boolean persist(DonationDto donationDto);
}
