package com.xworkz.recipe.repository;

import com.xworkz.recipe.dto.RecipeDto;

public class RecipeRepositoryImpl implements RecipeRepository{
    public RecipeRepositoryImpl(){
        System.out.println("repo is created");
    }

    @Override
    public boolean persist(RecipeDto recipeDto) {
        if(recipeDto!=null){
            System.out.println("recipeDto is not null");
        }else{
            System.out.println("RecipeDto is null");
            return false;

        }
        return true;

    }
}
