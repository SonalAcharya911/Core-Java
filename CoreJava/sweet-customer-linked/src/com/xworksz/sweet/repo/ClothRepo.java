package com.xworksz.sweet.repo;

import com.xworksz.sweet.dto.ClothDTO;

import java.util.Set;
import java.util.TreeSet;

public class ClothRepo {
    public Set<ClothDTO> getClothes(){
        ClothDTO clothDTO1=new ClothDTO("Silk",2,5000);

        Set<ClothDTO> clothDTOSet=new TreeSet<>();
        clothDTOSet.add(clothDTO1);

        return clothDTOSet;
    }
}
