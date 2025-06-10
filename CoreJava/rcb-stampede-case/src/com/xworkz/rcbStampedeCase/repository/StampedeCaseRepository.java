package com.xworkz.rcbStampedeCase.repository;

import com.xworkz.rcbStampedeCase.dto.StampedeCaseDto;

public interface StampedeCaseRepository {
    boolean persist(StampedeCaseDto stampedeCaseDto);
}
