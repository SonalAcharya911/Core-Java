package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.IoTDeviceDto;
import com.xworkz.extraordinary.exceptions.NoWiFiConnectionException;

 public class IoTDeviceServiceImpl implements IoTDeviceService {

    @Override
    public boolean checkConnection(IoTDeviceDto dto) throws NoWiFiConnectionException {
        if (dto != null) {
            if (dto.isWifiConnected()) {
                System.out.println("Device '" + dto.getDeviceName() + "' is connected to WiFi.");
                return true;
            } else {
                throw new NoWiFiConnectionException("No WiFi connection for device: " + dto.getDeviceName());
            }
        } else {
            throw new NullPointerException("IoTDeviceDto is null.");
        }
    }
}
