package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.MapZoomDto;
import com.xworkz.extraordinary.exceptions.InvalidZoomLevelException;

public interface MapZoomService {
    boolean validateZoom(MapZoomDto dto) throws InvalidZoomLevelException;
}
