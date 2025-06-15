package com.xworkz.ring.service;

import com.xworkz.ring.dto.RingDto;
import com.xworkz.ring.repository.RingRepository;

public interface RingService {
    boolean save(RingDto ringDto);
}
