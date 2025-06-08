package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.ShoppingDto;

public class ShoppingServiceImpl implements ShoppingService {

    @Override
    public boolean validateAndAccess(ShoppingDto dto) {
        try {
            if (dto != null) {
                String[] list = dto.getShoppingList();
                int index = dto.getIndexToAccess();

                if (list != null && index >= 0 && index < list.length) {
                    System.out.println("Item at index " + index + ": " + list[index]);
                } else {
                    throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
                }
            } else {
                throw new NullPointerException("DTO is null");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return true;
    }
}
