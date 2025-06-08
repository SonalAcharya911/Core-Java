package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.ImageResizeDto;
import com.xworkz.extraordinary.service.ImageResizeService;
import com.xworkz.extraordinary.service.ImageResizeServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImageResizeRunner {
    public static void main(String[] args) {
        ImageResizeDto dto = new ImageResizeDto();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter image width:");
            int width = scanner.nextInt();
            System.out.println("Enter image height:");
            int height = scanner.nextInt();

            dto.setWidth(width);
            dto.setHeight(height);

            ImageResizeService service = new ImageResizeServiceImpl();
            boolean valid = service.validateAndResize(dto);

            if (valid) {
                System.out.println("Image resize process completed.");
            } else {
                System.out.println("Invalid dimensions.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter integer values only.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

