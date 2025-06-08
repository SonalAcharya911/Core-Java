package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.SlopeDto;
import com.xworkz.extraordinary.service.SlopeService;
import com.xworkz.extraordinary.service.SlopeServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SlopeRunner {
    public static void main(String[] args) {
        SlopeDto slopeDto = new SlopeDto();
        double x1, y1, x2, y2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter x1 value:");
            x1 = scanner.nextDouble();
            System.out.println("Enter y1 value:");
            y1 = scanner.nextDouble();
            System.out.println("Enter x2 value:");
            x2 = scanner.nextDouble();
            System.out.println("Enter y2 value:");
            y2 = scanner.nextDouble();

            slopeDto.setX1(x1);
            slopeDto.setY1(y1);
            slopeDto.setX2(x2);
            slopeDto.setY2(y2);

            SlopeService service = new SlopeServiceImpl();
            boolean valid = service.validate(slopeDto);

            if (valid) {
                System.out.println("Slope between the two points: " + slopeDto.getSlope());
            } else {
                System.out.println("Data not valid");
            }

        } catch (InputMismatchException | NullPointerException | ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
