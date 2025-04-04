package com.xworkz.village;

public class Village {
    private String name;
    private String state;
    private String country;
    private int pincode;

    public Village(String name,String state, String country, int pincode){
        this.name=name;
        this.state=state;
        this.country=country;
        this.pincode=pincode;

    }

    public void showInfo(){
        System.out.println("name: "+name+" state: "+state+" country: "+country+" pincode:"+pincode);
    }
}
