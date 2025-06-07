package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.DevisionCalculatorDto;
import com.xworkz.extraordinary.service.DevisionCalculatorService;
import com.xworkz.extraordinary.service.DevisionCalculatorServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevisionCalculatorRunner {
    public static void main(String[] args) {
        DevisionCalculatorDto devisionCalculatorDto=new DevisionCalculatorDto();
        double dividend=0;
        double divisor=0;
        double quotient=0;

        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Enter the dividend value");
            dividend=scanner.nextDouble();
            System.out.println("Enter the divisor value");
            divisor=scanner.nextDouble();
            devisionCalculatorDto.setDividend(dividend);
            devisionCalculatorDto.setDivisor(divisor);

            DevisionCalculatorService devisionCalculatorService=new DevisionCalculatorServiceImpl();
            boolean valid=devisionCalculatorService.validate(devisionCalculatorDto);

            if(valid){
                quotient=dividend/divisor;
                System.out.println("the quotient: "+quotient);
            }
            else{
                System.out.println("data not valid");
            }


        }
        catch(InputMismatchException | NullPointerException | ArithmeticException e ){
            System.out.println("Exception ocuured: "+e.getMessage());
        }
    }
}
