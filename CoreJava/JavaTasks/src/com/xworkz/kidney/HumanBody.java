package com.xworkz.kidney;

public class HumanBody {
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
