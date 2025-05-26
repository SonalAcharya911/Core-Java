package com.xworkz.recipe.service;

import com.xworkz.recipe.dto.RecipeDto;

public class RecipeServiceImpl implements RecipeService{

    public RecipeServiceImpl(){
        System.out.println("no-arg const of RecipeServiceImpl");
    }
    @Override
    public boolean save(RecipeDto recipeDto) {
        if(recipeDto!=null ){
            System.out.println("recipeDto is not null");
            if(recipeDto.getRecipeName()!=null && recipeDto.getRecipeName().length()>=4){
                System.out.println("valid recipe name");
            }else{
                System.out.println("name not valid...should be at least 4 letters");
                return false;
            }
            if(recipeDto.getIng1()!=null){
                System.out.println("valid ingredient");
            } else {
                System.out.println("invalid ingredient");
                return false;
            }
            if(recipeDto.getIng2()!=null){
                System.out.println("valid ingredient");
            } else {
                System.out.println("invalid ingredient");
                return false;
            }
            if(recipeDto.getIng3()!=null){
                System.out.println("valid ingredient");
            } else {
                System.out.println("invalid ingredient");
                return false;
            }
            if(recipeDto.getIng4()!=null){
                System.out.println("valid ingredient");
            } else {
                System.out.println("invalid ingredient");
                return false;
            }
            if(recipeDto.getIng5()!=null){
                System.out.println("valid ingredient");
            } else {
                System.out.println("invalid ingredient");
                return false;
            }
        }

        else{
            System.out.println("RecipeDto is null");
            return false;

        }
        return true;
    }
}
