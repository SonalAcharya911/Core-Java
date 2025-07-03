package com.xworkz.appnest.repository;

import com.xworkz.appnest.dto.ApplicationDto;

import java.util.Collection;

public interface ApplicationRepository {
    Collection<ApplicationDto> findAll();
}
