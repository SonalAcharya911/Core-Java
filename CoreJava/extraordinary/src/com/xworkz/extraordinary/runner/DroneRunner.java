package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.DroneDto;
import com.xworkz.extraordinary.exceptions.LowBatteryException;
import com.xworkz.extraordinary.service.DroneService;
import com.xworkz.extraordinary.service.DroneServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DroneRunner {
    public static void main(String[] args) {
        DroneDto droneDto = new DroneDto();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter drone model: ");
            String model = scanner.nextLine();

            System.out.print("Enter battery percentage: ");
            double battery = scanner.nextDouble();

            droneDto.setModel(model);
            droneDto.setBatteryPercentage(battery);

            DroneService service = new DroneServiceImpl();
            boolean result = service.checkBattery(droneDto);

            if (result) {
                System.out.println("Drone is ready for flight.");
            }

        } catch (LowBatteryException e) {
            System.out.println("LowBatteryException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric value for battery.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
