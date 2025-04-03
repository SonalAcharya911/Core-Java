package com.xworkz.kidney;

public class KidneyRunner {
    public static void main(String[] args) {
        HumanBody humanBody=new HumanBody();
        Kidney kidney=new Kidney();

        if(humanBody!=null){
            humanBody.performKidneyFunction(kidney);
        }
        else{
            System.err.println("humanBody is null");
        }
    }
}
