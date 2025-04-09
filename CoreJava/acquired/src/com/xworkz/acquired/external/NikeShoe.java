package com.xworkz.acquired.external;

import com.xworkz.acquired.internal.AdidasShoe;
import com.xworkz.acquired.internal.Shoe;

public class NikeShoe extends Shoe {
    public NikeShoe(){
        System.out.println("no-arg constructor of NikeShoe");
    }

    public void manufacture(){
        Shoe shoe=new AdidasShoe();
        //Shoe shoe1=new Shoe();
    }
}
