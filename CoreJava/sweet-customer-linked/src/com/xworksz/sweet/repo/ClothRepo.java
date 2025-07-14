package com.xworksz.sweet.repo;

import com.xworksz.sweet.dto.ClothDTO;

import java.util.Set;
import java.util.TreeSet;

public class ClothRepo {
    public Set<ClothDTO> getClothes(){
        ClothDTO clothDTO1=new ClothDTO("Silk",2,5000);
        ClothDTO clothDTO2 = new ClothDTO("Chiffon",6,1000);
        ClothDTO clothDTO3= new ClothDTO("Velvet",4,3200);

        Set<ClothDTO> clothDTOSet=new TreeSet<>();
        clothDTOSet.add(clothDTO1);
        clothDTOSet.add(clothDTO2);
        clothDTOSet.add(clothDTO3);

        return clothDTOSet;
    }
}
