package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.DonationDto;
import com.xworkz.monsoon.dto.LaboratoryDto;

public interface LaboratoryRepo {
    boolean persist(LaboratoryDto laboratoryDto);
}
