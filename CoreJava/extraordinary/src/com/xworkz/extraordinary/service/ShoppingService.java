package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.ShoppingDto;

public interface ShoppingService {
    boolean validateAndAccess(ShoppingDto dto);
}
