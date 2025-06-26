package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.AppliancesDto;

import java.util.Collection;

public interface ApplianceRepository {

    Collection<AppliancesDto> findAll();
}
