package com.xworkz.monsoon.service;

import com.xworkz.monsoon.dto.FirDto;

public class FirServiceImpl implements FirService{
    public FirServiceImpl(){
        System.out.println("FirServiceImpl created...");
    }

    @Override
    public boolean save(FirDto firDto) {
        return false;
    }
}
