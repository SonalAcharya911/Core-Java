package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.SlopeDto;

public class SlopeServiceImpl implements SlopeService {
    @Override
    public boolean validate(SlopeDto dto) {
        try {
            if (dto != null) {
                if (dto.getX1() != dto.getX2()) {
                    double slope = (dto.getY2() - dto.getY1()) / (dto.getX2() - dto.getX1());
                    dto.setSlope(slope);
                    System.out.println("Slope is: " + slope);
                } else {
                    throw new ArithmeticException("Division by zero: x1 and x2 are equal.");
                }
            } else {
                throw new NullPointerException("DTO is null.");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        return true;
    }
}
