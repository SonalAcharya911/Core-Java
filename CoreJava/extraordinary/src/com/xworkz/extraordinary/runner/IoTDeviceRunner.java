package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.IoTDeviceDto;
import com.xworkz.extraordinary.exceptions.NoWiFiConnectionException;
import com.xworkz.extraordinary.service.IoTDeviceService;
import com.xworkz.extraordinary.service.IoTDeviceServiceImpl;

import java.util.Scanner;

public class IoTDeviceRunner {
    public static void main(String[] args) {
        IoTDeviceDto dto = new IoTDeviceDto();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter IoT device name: ");
            String name = scanner.nextLine();

            System.out.print("Is WiFi connected? (true/false): ");
            boolean connected = scanner.nextBoolean();

            dto.setDeviceName(name);
            dto.setWifiConnected(connected);

            IoTDeviceService service = new IoTDeviceServiceImpl();
            boolean result = service.checkConnection(dto);

            if (result) {
                System.out.println("Device is online and functioning.");
            }

        } catch (NoWiFiConnectionException e) {
            System.out.println("NoWiFiConnectionException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
