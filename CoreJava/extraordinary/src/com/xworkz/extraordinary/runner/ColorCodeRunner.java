package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.ColorCodeDto;
import com.xworkz.extraordinary.exceptions.InvalidColorCodeException;
import com.xworkz.extraordinary.service.ColorCodeService;
import com.xworkz.extraordinary.service.ColorCodeServiceImpl;

import java.util.Scanner;

public class ColorCodeRunner {
    public static void main(String[] args) {
        ColorCodeDto dto = new ColorCodeDto();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a color code (e.g., #FF5733 or #FFF): ");
            String code = scanner.nextLine();

            dto.setColorCode(code);

            ColorCodeService service = new ColorCodeServiceImpl();
            boolean result = service.validateColor(dto);

            if (result) {
                System.out.println("Color code accepted for digital design.");
            }

        } catch (InvalidColorCodeException e) {
            System.out.println("InvalidColorCodeException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
