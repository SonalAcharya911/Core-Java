package com.xworkz.cigarette;

import java.util.Objects;

public class CigaretteRunner {
    public static void main(String[] args) {
        Cigarette cigarette=new Cigarette();
        Smoker smoker=new Smoker(cigarette);
        smoker.smokes();

    }
}
