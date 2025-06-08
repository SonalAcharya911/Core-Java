package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.GameMenuDto;

public class GameMenuServiceImpl implements GameMenuService {

    @Override
    public boolean validateOption(GameMenuDto dto) {
        try {
            if (dto != null) {
                int option = dto.getSelectedOption();
                if (option >= 1 && option <= 4) {
                    System.out.println("You selected option " + option);
                } else {
                    throw new IllegalArgumentException("Invalid option selected: Must be between 1 and 4");
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
