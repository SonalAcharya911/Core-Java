package com.xworkz.ring.service;

import com.xworkz.ring.dto.RingDto;
import com.xworkz.ring.repository.RingRepository;

import java.util.Optional;

public interface RingService {
    boolean save(RingDto ringDto);
    default Optional<RingDto> findById(int id)
    {
        return  Optional.empty();
    }
}
