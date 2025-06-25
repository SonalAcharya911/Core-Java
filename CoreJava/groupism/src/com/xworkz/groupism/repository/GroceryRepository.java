package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.GroceryDto;

import java.util.Collection;

public interface GroceryRepository {
    Collection<GroceryDto> findAll();

}
