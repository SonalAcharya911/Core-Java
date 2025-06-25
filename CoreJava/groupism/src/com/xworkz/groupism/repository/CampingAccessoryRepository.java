package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.CampingAccessoriesDto;

import java.util.Collection;

public interface CampingAccessoryRepository {
    Collection<CampingAccessoriesDto> findAll();
}
