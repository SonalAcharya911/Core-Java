package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.DeliveryRouteDto;
import com.xworkz.extraordinary.exceptions.RouteNotFoundException;

public class DeliveryRouteServiceImpl implements DeliveryRouteService {

    private static final String[] availableRoutes = {
            "Bangalore-Mysore", "Delhi-Agra", "Mumbai-Pune", "Chennai-Coimbatore"
    };

    @Override
    public boolean checkRoute(DeliveryRouteDto dto) throws RouteNotFoundException {
        if (dto != null) {
            String route = dto.getSource() + "-" + dto.getDestination();

            for (String available : availableRoutes) {
                if (available.equalsIgnoreCase(route)) {
                    System.out.println("Route found: " + route);
                    return true;
                }
            }
            throw new RouteNotFoundException("No delivery route found from " + dto.getSource() + " to " + dto.getDestination());
        } else {
            throw new NullPointerException("DeliveryRouteDto is null");
        }
    }
}
