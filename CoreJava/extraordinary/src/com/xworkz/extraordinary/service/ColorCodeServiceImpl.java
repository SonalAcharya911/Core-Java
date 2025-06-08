package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.ColorCodeDto;
import com.xworkz.extraordinary.exceptions.InvalidColorCodeException;

public class ColorCodeServiceImpl implements ColorCodeService {

    @Override
    public boolean validateColor(ColorCodeDto dto) throws InvalidColorCodeException {
        if (dto != null) {
            String code = dto.getColorCode();

            if (code == null || !code.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$")) {
                throw new InvalidColorCodeException("Invalid color code format. Use #RGB or #RRGGBB.");
            } else {
                System.out.println("Valid color code: " + code);
                return true;
            }
        } else {
            throw new NullPointerException("DTO is null.");
        }
    }
}
