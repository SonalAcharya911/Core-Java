package com.xworkz.numberGame.runner;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberRunner {
    public static void main(String[] args) {

        System.out.println("Guess the right number");
        Random random = new Random();
        int generatedNum = random.nextInt(10);
        int guessedNum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Guess a number between 1 to 10");
                guessedNum = scanner.nextInt();

                if (generatedNum == guessedNum) {
                    System.out.println("matched");
                }
                else{
                    System.out.println("enter a new number");
                }
            }catch (InputMismatchException i) {
                System.out.println("wrong input....enter a number");
                System.out.println(i.getMessage());
                break;
            }
        } while (generatedNum != guessedNum);



    }
}
