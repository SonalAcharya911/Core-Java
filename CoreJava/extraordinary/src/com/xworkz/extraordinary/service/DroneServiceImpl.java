package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.DroneDto;
import com.xworkz.extraordinary.exceptions.LowBatteryException;

public class DroneServiceImpl implements DroneService {

    @Override
    public boolean checkBattery(DroneDto dto) throws LowBatteryException {
        if (dto != null) {
            if (dto.getBatteryPercentage() < 10.0) {
                throw new LowBatteryException("Battery too low! (" + dto.getBatteryPercentage() + "%). Please recharge.");
            } else {
                System.out.println("Battery is sufficient: " + dto.getBatteryPercentage() + "%");
                return true;
            }
        } else {
            throw new NullPointerException("Drone data is missing.");
        }
    }
}
