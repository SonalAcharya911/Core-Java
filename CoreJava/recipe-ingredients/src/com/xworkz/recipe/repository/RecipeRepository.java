package com.xworkz.recipe.repository;

import com.xworkz.recipe.dto.RecipeDto;

public interface RecipeRepository {
    boolean persist(RecipeDto recipeDto);

}
