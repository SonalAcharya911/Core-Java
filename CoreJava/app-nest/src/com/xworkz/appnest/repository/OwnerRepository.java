package com.xworkz.appnest.repository;

import com.xworkz.appnest.dto.OwnerDto;

import java.util.List;

public interface OwnerRepository {
    List<List<OwnerDto>> getOwnerDto();
}
