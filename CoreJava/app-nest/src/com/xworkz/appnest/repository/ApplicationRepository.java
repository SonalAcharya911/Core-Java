package com.xworkz.appnest.repository;

import com.xworkz.appnest.dto.ApplicationDto;

import java.util.Collection;
import java.util.List;

public interface ApplicationRepository {
    List<ApplicationDto> findAll();
}
