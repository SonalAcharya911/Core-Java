package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.LaboratoryDto;

public class LaboratoryRepoImpl implements LaboratoryRepo{
    @Override
    public boolean persist(LaboratoryDto laboratoryDto) {
        System.out.println("running persist in LaboratoryRepoImpl");
        if(laboratoryDto!=null){
            System.out.println("laboratoryDto is not null");
        }
        else{
            System.out.println("laboratoryDto is cannot be null");
            return false;
        }
        return true;
    }
}
