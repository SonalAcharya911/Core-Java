package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.ImageResizeDto;

public interface ImageResizeService {
    boolean validateAndResize(ImageResizeDto dto);
}
