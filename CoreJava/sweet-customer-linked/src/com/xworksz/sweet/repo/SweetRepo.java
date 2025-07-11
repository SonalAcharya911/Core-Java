package com.xworksz.sweet.repo;

import com.xworksz.sweet.dto.SweetDto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SweetRepo {
    public Set<SweetDto> getSweets(){
        SweetDto sweetDto1 = new SweetDto("Laddoo",25,new String[]{"sugar","ghee","besan","pumpkinSeeds","badam"},6,2);
        SweetDto sweetDto2 = new SweetDto("Gulab Jamun", 20, new String[]{"khoya", "sugar", "roseWater", "cardamom", "maida"}, 10, 1);
        SweetDto sweetDto3 = new SweetDto("Jalebi", 18, new String[]{"maida", "curd", "sugar", "saffron", "bakingSoda"}, 8, 2);
        SweetDto sweetDto4 = new SweetDto("Rasgulla", 25, new String[]{"chhena", "sugar", "cardamom", "roseWater", "maida"}, 12, 1);
        SweetDto sweetDto5 = new SweetDto("Kaju Katli", 30, new String[]{"cashew", "sugar", "roseEssence", "ghee", "cardamom"}, 5, 1);
        SweetDto sweetDto6 = new SweetDto("Barfi", 22, new String[]{"milk", "sugar", "ghee", "dryFruits", "cardamom"}, 6, 2);
        SweetDto sweetDto7 = new SweetDto("Mysore Pak", 18, new String[]{"besan", "ghee", "sugar", "milk", "cardamom"}, 8, 1);
        SweetDto sweetDto8 = new SweetDto("Peda", 16, new String[]{"khoya", "sugar", "cardamom", "ghee", "saffron"}, 10, 2);
        SweetDto sweetDto9 = new SweetDto("Soan Papdi", 12, new String[]{"gramFlour", "sugar", "ghee", "cardamom", "milk"}, 12, 3);
        SweetDto sweetDto10 = new SweetDto("Sandesh", 20, new String[]{"paneer", "sugar", "saffron", "cardamom", "roseWater"}, 7, 1);
        SweetDto sweetDto11 = new SweetDto("Halwa", 15, new String[]{"semolina", "ghee", "sugar", "cashew", "raisins"}, 6, 2);
        SweetDto sweetDto12 = new SweetDto("Modak", 25, new String[]{"riceFlour", "jaggery", "coconut", "cardamom", "ghee"}, 8, 2);
        SweetDto sweetDto13 = new SweetDto("Imarti", 18, new String[]{"uradDal", "sugar", "saffron", "ghee", "cardamom"}, 9, 2);
        SweetDto sweetDto14 = new SweetDto("Kheer Kadam", 28, new String[]{"milk", "sugar", "paneer", "dryFruits", "roseEssence"}, 5, 1);
        SweetDto sweetDto15 = new SweetDto("Rabri", 35, new String[]{"milk", "sugar", "saffron", "cardamom", "nuts"}, 4, 1);
        SweetDto sweetDto16 = new SweetDto("Khaja", 20, new String[]{"maida", "sugar", "ghee", "curd", "bakingSoda"}, 6, 2);
        SweetDto sweetDto17 = new SweetDto("Balushahi", 22, new String[]{"maida", "ghee", "sugar", "curd", "cardamom"}, 7, 1);
        SweetDto sweetDto18 = new SweetDto("Pineapple Pastry", 40, new String[]{"flour", "sugar", "pineapple", "cream", "butter"}, 3, 1);
        SweetDto sweetDto19 = new SweetDto("Milk Cake", 30, new String[]{"milk", "sugar", "ghee", "cardamom", "lemonJuice"}, 5, 2);
        SweetDto sweetDto20 = new SweetDto("Cham Cham", 26, new String[]{"chhena", "sugar", "coconut", "cardamom", "roseWater"}, 6, 1);
        SweetDto sweetDto21 = new SweetDto("Basundi", 25, new String[]{"milk", "sugar", "cardamom", "dryFruits", "saffron"}, 5, 2);
        SweetDto sweetDto22 = new SweetDto("Kalakand", 24, new String[]{"milk", "sugar", "lemonJuice", "ghee", "cardamom"}, 6, 1);
        SweetDto sweetDto23 = new SweetDto("Double Ka Meetha", 32, new String[]{"bread", "milk", "sugar", "cardamom", "ghee"}, 4, 1);
        SweetDto sweetDto24 = new SweetDto("Phirni", 22, new String[]{"rice", "milk", "sugar", "saffron", "roseWater"}, 5, 2);
        SweetDto sweetDto25 = new SweetDto("Carrot Halwa", 28, new String[]{"carrot", "milk", "sugar", "ghee", "cashew"}, 4, 2);
        SweetDto sweetDto26 = new SweetDto("Badusha", 18, new String[]{"maida", "ghee", "sugar", "curd", "bakingPowder"}, 7, 2);
        SweetDto sweetDto27 = new SweetDto("Gujiya", 26, new String[]{"maida", "khoya", "sugar", "dryFruits", "cardamom"}, 6, 1);
        SweetDto sweetDto28 = new SweetDto("Anarsa", 20, new String[]{"rice", "jaggery", "poppySeeds", "ghee", "cardamom"}, 5, 2);
        SweetDto sweetDto29 = new SweetDto("Laddoo", 15, new String[]{"coconut", "condensedMilk", "sugar", "ghee", "cardamom"}, 8, 2);
        SweetDto sweetDto30 = new SweetDto("Til Chikki", 10, new String[]{"sesameSeeds", "jaggery", "ghee", "peanuts", "cardamom"}, 10, 3);




        Set<SweetDto> sweetDtoSet=new HashSet<>();

        sweetDtoSet.add(sweetDto1);
        sweetDtoSet.add(sweetDto2);
        sweetDtoSet.add(sweetDto3);
        sweetDtoSet.add(sweetDto4);
        sweetDtoSet.add(sweetDto5);
        sweetDtoSet.add(sweetDto6);
        sweetDtoSet.add(sweetDto7);
        sweetDtoSet.add(sweetDto8);
        sweetDtoSet.add(sweetDto9);
        sweetDtoSet.add(sweetDto10);
        sweetDtoSet.add(sweetDto11);
        sweetDtoSet.add(sweetDto12);
        sweetDtoSet.add(sweetDto13);
        sweetDtoSet.add(sweetDto14);
        sweetDtoSet.add(sweetDto15);
        sweetDtoSet.add(sweetDto16);
        sweetDtoSet.add(sweetDto17);
        sweetDtoSet.add(sweetDto18);
        sweetDtoSet.add(sweetDto19);
        sweetDtoSet.add(sweetDto20);
        sweetDtoSet.add(sweetDto21);
        sweetDtoSet.add(sweetDto22);
        sweetDtoSet.add(sweetDto23);
        sweetDtoSet.add(sweetDto24);
        sweetDtoSet.add(sweetDto25);
        sweetDtoSet.add(sweetDto26);
        sweetDtoSet.add(sweetDto27);
        sweetDtoSet.add(sweetDto28);
        sweetDtoSet.add(sweetDto29);
        sweetDtoSet.add(sweetDto30);


        return sweetDtoSet;
    }
}
