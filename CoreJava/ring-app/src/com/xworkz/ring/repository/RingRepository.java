package com.xworkz.ring.repository;

import com.xworkz.ring.dto.RingDto;

import java.util.Optional;

public interface RingRepository {
    boolean persist(RingDto ringDto);
    default Optional<RingDto> findById(int id)
    {
        System.out.println("");
        return  Optional.empty();
    }
}
