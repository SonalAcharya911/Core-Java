package com.xworkz.kidney;

public class HumanBody {
    Kidney kidney;
    public HumanBody(Kidney kidney){
        this.kidney=kidney;
        System.out.println("parameterized constructor for HumanBody");
    }
    public void performKidneyFunction(Kidney kidney){
        System.out.println("running performKidneyFunction in HumanBody");
        if(kidney!=null){
            kidney.filter();
        }
        else{
            System.err.println("kidney is null");
        }
    }
}
