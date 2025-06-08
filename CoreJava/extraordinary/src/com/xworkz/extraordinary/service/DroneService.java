package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.DroneDto;
import com.xworkz.extraordinary.exceptions.LowBatteryException;

public interface DroneService {
    boolean checkBattery(DroneDto dto) throws LowBatteryException;
}
