package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.ImageResizeDto;

public class ImageResizeServiceImpl implements ImageResizeService {

    @Override
    public boolean validateAndResize(ImageResizeDto dto) {
        try {
            if (dto != null) {
                if (dto.getWidth() < 0 || dto.getHeight() < 0) {
                    throw new IllegalArgumentException("Width and Height must be non-negative");
                }

                System.out.println("Image resized to " + dto.getWidth() + "x" + dto.getHeight());
            } else {
                throw new NullPointerException("DTO is null");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        return true;
    }
}
