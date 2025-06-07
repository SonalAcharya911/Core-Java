package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.RatingDto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RatingRunner {
    public static void main(String[] args) {
        RatingDto ratingDto=new RatingDto();
        int rating=0;
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Enter the rating on a scale of 1-5");
            rating=scanner.nextInt();
            throw new InputMismatchException("input must be a number");
        }
        catch(InputMismatchException i){
            System.out.println(i.getMessage());
        }
    }
}
