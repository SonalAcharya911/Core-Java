package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.FirDto;

public class FirRepoImpl implements FirRepo{
    @Override
    public boolean persist(FirDto firDto) {
        System.out.println("running persist in FirRepoImpl");
        if(firDto!=null){
            System.out.println("firDto is not null");
        }
        else{
            System.out.println("firDto is cannot be null");
            return false;
        }
        return true;
    }
}
