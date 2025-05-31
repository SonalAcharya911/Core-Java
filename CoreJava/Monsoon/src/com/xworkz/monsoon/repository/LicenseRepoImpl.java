package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.LicenseDto;

public class LicenseRepoImpl implements LicenseRepo{
    @Override
    public boolean persist(LicenseDto licenseDto) {
        System.out.println("running persist in LicenseRepoImpl");
        if(licenseDto!=null){
            System.out.println("licenseDto is not null");
        }
        else{
            System.out.println("licenseDto is cannot be null");
            return false;
        }
        return true;
    }

}
