package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.DevisionCalculatorDto;

public class DevisionCalculatorServiceImpl implements DevisionCalculatorService{
    @Override
    public boolean validate(DevisionCalculatorDto devisionCalculatorDto) {
        try{
            if(devisionCalculatorDto!=null){
                if(devisionCalculatorDto.getDivisor()!=0){
                    System.out.println("valid divisor");
                }else{
                    throw new ArithmeticException("divide by zero not possible");
                }
            }
            else{
                throw new NullPointerException("dto is null");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return true;
    }
}
