package com.xworkz.golden.external;

import com.xworkz.golden.internal.Atm;

public class User {
    private Atm atm;

    public User(Atm atm){
        this.atm=atm;
    }

    public void depositMoney(){
        System.out.println("running depositMoney in User");
        if(this.atm!=null){
            this.atm.drawMoney();
        }
        else{
            System.out.println("atm is null");
        }
    }
}
