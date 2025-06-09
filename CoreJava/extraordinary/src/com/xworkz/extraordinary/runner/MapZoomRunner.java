package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.MapZoomDto;
import com.xworkz.extraordinary.exceptions.InvalidZoomLevelException;
import com.xworkz.extraordinary.service.MapZoomService;
import com.xworkz.extraordinary.service.MapZoomServiceImpl;

import java.util.Scanner;

public class MapZoomRunner {
    public static void main(String[] args) {
        MapZoomDto dto = new MapZoomDto();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter map name: ");
            String name = scanner.nextLine();

            System.out.print("Enter zoom level: ");
            int zoom = scanner.nextInt();

            dto.setMapName(name);
            dto.setZoomLevel(zoom);

            MapZoomService service = new MapZoomServiceImpl();
            boolean result = service.validateZoom(dto);

            if (result) {
                System.out.println("Displaying " + name + " at zoom level " + zoom);
            }

        } catch (InvalidZoomLevelException e) {
            System.out.println("InvalidZoomLevelException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
