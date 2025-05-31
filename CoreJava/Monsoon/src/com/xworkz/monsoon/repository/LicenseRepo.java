package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.DonationDto;
import com.xworkz.monsoon.dto.LicenseDto;

public interface LicenseRepo {
    boolean persist(LicenseDto licenseDto);
}
