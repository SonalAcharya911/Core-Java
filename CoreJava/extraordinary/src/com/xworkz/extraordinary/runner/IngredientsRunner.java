package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.IngredientsDto;
import com.xworkz.extraordinary.service.IngredientsService;
import com.xworkz.extraordinary.service.IngredientsServiceImpl;

import java.util.Scanner;

public class IngredientsRunner {
    public static void main(String[] args) {

        IngredientsDto ingredientsDto=new IngredientsDto();

        IngredientsService ingredientsService=new IngredientsServiceImpl();

        try(Scanner scanner=new Scanner(System.in)){

            System.out.println("enter array size");
            int size=scanner.nextInt();
            ingredientsDto.setSize(size);
            System.out.println("enter ingredients list");
            String[] ing= new String[size];
            for(int i=0;i<size;i++){
                ing[i]= scanner.next();
            }

            System.out.println("enter the index at which you need to fetch the element");
            int index=scanner.nextInt();
            ingredientsDto.setIgredients(ing);
            ingredientsDto.setIndex(index);
            ingredientsService.validate(ingredientsDto);
            System.out.println("the ingredient at index "+index+"is "+ingredientsDto.getIgredients()[index]);


        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }

    }
}
