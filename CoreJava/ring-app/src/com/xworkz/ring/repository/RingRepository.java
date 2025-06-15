package com.xworkz.ring.repository;

import com.xworkz.ring.dto.RingDto;

public interface RingRepository {
    boolean persist(RingDto ringDto);
    
}
