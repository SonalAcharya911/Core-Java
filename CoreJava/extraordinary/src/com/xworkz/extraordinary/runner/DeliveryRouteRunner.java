package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.DeliveryRouteDto;
import com.xworkz.extraordinary.exceptions.RouteNotFoundException;
import com.xworkz.extraordinary.service.DeliveryRouteService;
import com.xworkz.extraordinary.service.DeliveryRouteServiceImpl;

import java.util.Scanner;

public class DeliveryRouteRunner {
    public static void main(String[] args) {
        DeliveryRouteDto dto = new DeliveryRouteDto();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter source location: ");
            String source = scanner.nextLine();

            System.out.print("Enter destination location: ");
            String destination = scanner.nextLine();

            dto.setSource(source);
            dto.setDestination(destination);

            DeliveryRouteService service = new DeliveryRouteServiceImpl();
            boolean result = service.checkRoute(dto);

            if (result) {
                System.out.println("Tracking delivery from " + source + " to " + destination + "...");
            }

        } catch (RouteNotFoundException e) {
            System.out.println("RouteNotFoundException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}
