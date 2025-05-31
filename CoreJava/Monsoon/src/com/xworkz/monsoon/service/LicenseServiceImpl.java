package com.xworkz.monsoon.service;

import com.xworkz.monsoon.dto.LicenseDto;

public class LicenseServiceImpl implements LicenseService{
    public LicenseServiceImpl(){
        System.out.println("LicenseServiceImpl created...");
    }

    @Override
    public boolean save(LicenseDto licenseDto) {
        return false;
    }
}
