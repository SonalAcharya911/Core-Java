package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.DonationDto;
import com.xworkz.monsoon.dto.FirDto;

public interface FirRepo {
    boolean persist(FirDto firDto);
}
