package com.xworkz.ring.service;

import com.xworkz.ring.dto.RingDto;
import com.xworkz.ring.repository.RingRepository;
import com.xworkz.ring.repository.RingRepositoryImpl;

public class RingServiceImpl implements RingService{
    @Override
    public boolean save(RingDto ringDto) {
        if(ringDto!=null){
            System.out.println("dto is not null");
            if(ringDto.getMaterial()!=null){
                System.out.println("valid material");
            }
            else{
                System.out.println("invalid material");
                return false;
            }

            if(!(ringDto.getSize()<2)){
                System.out.println("valid size");
            }
            else{
                System.out.println("invalid size...size should be >2");
                return false;
            }

            if(ringDto.getWeight()!=0){
                System.out.println("valid weight");
            }
            else{
                System.out.println("invalid weight");
                return false;
            }

            if(ringDto.getPrice()!=0 && ringDto.getPrice()>1000){
                System.out.println("valid price");
            }
            else{
                System.out.println("invalid price");
                return false;
            }

            RingRepository repository=new RingRepositoryImpl();
            boolean persist=repository.persist(ringDto);
            if(persist){
                System.out.println("values saved");
            }
            else{
                System.out.println("not saved in repo...");
                return false;
            }
            System.out.println("service finished...");
            return true;
        }
        return false;
    }
}
