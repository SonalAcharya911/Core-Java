package com.xworkz.monsoon.service;

import com.xworkz.monsoon.dto.LaboratoryDto;

public class LaboratoryServiceImpl implements LaboratoryService
{
    public LaboratoryServiceImpl(){
        System.out.println("LaboratoryServiceImpl created...");
    }

    @Override
    public boolean save(LaboratoryDto laboratoryDto) {
        return false;
    }
}
