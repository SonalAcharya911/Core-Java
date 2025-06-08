package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.ColorCodeDto;
import com.xworkz.extraordinary.exceptions.InvalidColorCodeException;

public interface ColorCodeService {
    boolean validateColor(ColorCodeDto dto) throws InvalidColorCodeException;
}
