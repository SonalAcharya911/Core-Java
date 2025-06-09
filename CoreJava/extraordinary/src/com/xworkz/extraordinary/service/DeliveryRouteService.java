package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.DeliveryRouteDto;
import com.xworkz.extraordinary.exceptions.RouteNotFoundException;

public interface DeliveryRouteService {
    boolean checkRoute(DeliveryRouteDto dto) throws RouteNotFoundException;
}
