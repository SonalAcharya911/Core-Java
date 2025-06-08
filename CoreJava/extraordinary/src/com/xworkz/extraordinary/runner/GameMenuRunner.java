package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.GameMenuDto;
import com.xworkz.extraordinary.service.GameMenuService;
import com.xworkz.extraordinary.service.GameMenuServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMenuRunner {
    public static void main(String[] args) {
        GameMenuDto dto = new GameMenuDto();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Game Menu ===");
            System.out.println("1. Start Game");
            System.out.println("2. Load Game");
            System.out.println("3. Settings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            dto.setSelectedOption(choice);

            GameMenuService service = new GameMenuServiceImpl();
            boolean valid = service.validateOption(dto);

            if (valid) {
                switch (choice) {
                    case 1:
                        System.out.println("Game starting...");
                        break;
                    case 2:
                        System.out.println("Loading game...");
                        break;
                    case 3:
                        System.out.println("Opening settings...");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                }
            } else {
                System.out.println("Invalid selection.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please enter a number between 1 and 4.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
