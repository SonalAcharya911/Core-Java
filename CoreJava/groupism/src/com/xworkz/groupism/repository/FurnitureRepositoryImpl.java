package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.FurnitureDto;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRepositoryImpl implements FurnitureRepository{
    @Override
    public Collection<FurnitureDto> findaAll() {
        FurnitureDto furnitureDto1 = new FurnitureDto("Dining Table", "Sheesham Wood", 18999, "Walnut Brown", "Urban Ladder");
        FurnitureDto furnitureDto2 = new FurnitureDto("Office Chair", "Mesh & Plastic", 5499, "Black", "Green Soul");
        FurnitureDto furnitureDto3 = new FurnitureDto("Sofa Set", "Fabric & Wood", 28999, "Charcoal Grey", "Wakefit");
        FurnitureDto furnitureDto4 = new FurnitureDto("Bookshelf", "Engineered Wood", 6999, "Wenge", "Godrej Interio");
        FurnitureDto furnitureDto5 = new FurnitureDto("Coffee Table", "Glass & Metal", 4999, "Transparent", "Home Centre");
        FurnitureDto furnitureDto6 = new FurnitureDto("Wardrobe", "Engineered Wood", 15999, "Matte Brown", "Nilkamal");
        FurnitureDto furnitureDto7 = new FurnitureDto("Bed Frame", "Solid Wood", 21999, "Honey Finish", "Durian");
        FurnitureDto furnitureDto8 = new FurnitureDto("TV Unit", "MDF", 8999, "Teak Finish", "Flipkart SmartBuy");
        FurnitureDto furnitureDto9 = new FurnitureDto("Study Table", "Particle Board", 3999, "White Maple", "IKEA");
        FurnitureDto furnitureDto10 = new FurnitureDto("Recliner", "Leatherette", 19999, "Chocolate Brown", "Amazon Basics");

        Collection<FurnitureDto> furnitureDtos=new ArrayList<>();
        furnitureDtos.add(furnitureDto1);
        furnitureDtos.add(furnitureDto2);
        furnitureDtos.add(furnitureDto3);
        furnitureDtos.add(furnitureDto4);
        furnitureDtos.add(furnitureDto5);
        furnitureDtos.add(furnitureDto6);
        furnitureDtos.add(furnitureDto7);
        furnitureDtos.add(furnitureDto8);
        furnitureDtos.add(furnitureDto9);
        furnitureDtos.add(furnitureDto10);

        return furnitureDtos;

    }
}
