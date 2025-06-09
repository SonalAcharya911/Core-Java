package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.IoTDeviceDto;
import com.xworkz.extraordinary.exceptions.NoWiFiConnectionException;

public interface IoTDeviceService {
    boolean checkConnection(IoTDeviceDto dto) throws NoWiFiConnectionException;
}
