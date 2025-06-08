package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.ShoppingDto;
import com.xworkz.extraordinary.service.ShoppingService;
import com.xworkz.extraordinary.service.ShoppingServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingRunner {
    public static void main(String[] args) {
        ShoppingDto dto = new ShoppingDto();
        String[] items = {"Milk", "Bread", "Eggs", "Fruits", "Vegetables"};
        dto.setShoppingList(items);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Shopping List:");
            for (int i = 0; i < items.length; i++) {
                System.out.println(i + ": " + items[i]);
            }

            System.out.print("Enter index to access item: ");
            int index = scanner.nextInt();
            dto.setIndexToAccess(index);

            ShoppingService service = new ShoppingServiceImpl();
            boolean valid = service.validateAndAccess(dto);

            if (!valid) {
                System.out.println("Could not access the item.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter a valid integer index.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
