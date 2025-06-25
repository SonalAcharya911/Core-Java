package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.SareeDto;

import java.util.Collection;

public interface SareeRepository {
    Collection<SareeDto> findAll();

}
