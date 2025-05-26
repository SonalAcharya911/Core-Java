package com.xworkz.recipe.dto;

public class RecipeDto {
    private String recipeName;
    private String ing1;
    private String ing2;
    private String ing3;
    private String ing4;
    private String ing5;

    public RecipeDto(){
        System.out.println("no-arg const of RecipeDto");
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getIng1() {
        return ing1;
    }

    public String getIng2() {
        return ing2;
    }

    public String getIng3() {
        return ing3;
    }

    public String getIng4() {
        return ing4;
    }

    public String getIng5() {
        return ing5;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setIng1(String ing1) {
        this.ing1 = ing1;
    }

    public void setIng2(String ing2) {
        this.ing2 = ing2;
    }

    public void setIng3(String ing3) {
        this.ing3 = ing3;
    }

    public void setIng4(String ing4) {
        this.ing4 = ing4;
    }

    public void setIng5(String ing5) {
        this.ing5 = ing5;
    }
}
