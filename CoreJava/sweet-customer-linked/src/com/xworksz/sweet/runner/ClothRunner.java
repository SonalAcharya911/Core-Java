package com.xworksz.sweet.runner;

import com.xworksz.sweet.dto.ClothDTO;
import com.xworksz.sweet.repo.ClothRepo;

import java.util.Set;

public class ClothRunner {
    public static void main(String[] args) {
        ClothRepo clothRepo=new ClothRepo();

        Set<ClothDTO> set= clothRepo.getClothes();

       int res= set.spliterator().characteristics();

        System.out.println(res);
    }
}
