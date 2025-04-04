package com.xworkz.property;

public class Property {
    int area;
    String loc;

    public Property(int area,String loc){
        this.area=area;
        this.loc=loc;
    }

    public void display(){
        System.out.println("area: "+area+" location: "+loc);
    }
}


