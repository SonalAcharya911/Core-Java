package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.IngredientsDto;

import java.util.InputMismatchException;

public class IngredientsServiceImpl implements IngredientsService{
    @Override
    public boolean validate(IngredientsDto ingredientsDto) {

        try{
            if(ingredientsDto!=null){
                if(ingredientsDto.getIgredients()!=null){
                    System.out.println("list is not empty");
                }
                else{
                    throw new NullPointerException("array is null");
                }


                if(ingredientsDto.getSize()!=0){
                    System.out.println("valid size");
                }
                else{
                    throw new InputMismatchException("size cannot be zero");
                }
            }
            else{
                throw new NullPointerException("dto is null");

            }
        }
        catch(NullPointerException n){
            System.out.println(n.getMessage());
        }

        return true;
    }
}
