package com.xworkz.cigarette;

import java.util.Objects;

public class CigaretteRunner {
    public static void main(String[] args) {
        Smoker smoker=new Smoker();
        Cigarette cigarette=new Cigarette();
        if(Objects.nonNull(smoker)){
            smoker.smokes(cigarette);
        }
        else{
            System.err.println("smoker is null");
        }
    }
}
