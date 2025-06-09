package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.MapZoomDto;
import com.xworkz.extraordinary.exceptions.InvalidZoomLevelException;

public class MapZoomServiceImpl implements MapZoomService {
    @Override
    public boolean validateZoom(MapZoomDto dto) throws InvalidZoomLevelException {
        int max_zoom=20;
        if (dto != null) {
            if (dto.getZoomLevel() <= max_zoom) {
                System.out.println("Zoom level is valid for: " + dto.getMapName());
                return true;
            } else {
                throw new InvalidZoomLevelException("Zoom level " + dto.getZoomLevel() + " exceeds max allowed (" + max_zoom + ")");
            }
        } else {
            throw new NullPointerException("MapZoomDto is null");
        }
    }
}
