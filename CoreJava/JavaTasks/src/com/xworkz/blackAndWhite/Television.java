package com.xworkz.blackAndWhite;

public class Television {

    public void channel(BlackAndWhite blackAndWhite){
        System.out.println("running channel in Television");
        if(blackAndWhite!=null){
            blackAndWhite.show();
        }
        else{
            System.out.println("blackAndWhite is null");
        }
    }
}
