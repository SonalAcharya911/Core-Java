package com.xworkz.blackAndWhite;

public class Television {
    BlackAndWhite blackAndWhite;

    public Television(BlackAndWhite blackAndWhite){
        this.blackAndWhite=blackAndWhite;
        System.out.println("parameterized constructor for Television");
    }
    public void channel(){
        System.out.println("running channel in Television");
        if(blackAndWhite!=null){
            blackAndWhite.show();
        }
        else{
            System.out.println("blackAndWhite is null");
        }
    }
}
