package com.xworkz.kidney;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney=new Kidney();
        HumanBody humanBody=new HumanBody(kidney);
        humanBody.performKidneyFunction(kidney);
    }
}
