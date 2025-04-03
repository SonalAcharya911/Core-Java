package com.xworkz.cigarette;

import java.util.Objects;

public class CigaretteRunner {
    public static void main(String[] args) {
        Cigarette cigarette=new Cigarette();
        Smoker smoker=new Smoker();

        if(Objects.nonNull(smoker)){
            smoker.smokes(cigarette);
        }
        else{
            System.err.println("smoker is null");
        }
    }
}
