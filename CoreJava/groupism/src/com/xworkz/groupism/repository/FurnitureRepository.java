package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.FurnitureDto;

import java.util.Collection;

public interface FurnitureRepository {
    Collection<FurnitureDto> findaAll();

}
