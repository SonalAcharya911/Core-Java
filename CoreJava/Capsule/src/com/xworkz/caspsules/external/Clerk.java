package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.PostOffice;

public class Clerk {
    public void process(){
        System.out.println("running process in Clerk");
        PostOffice postOffice = new PostOffice();

        System.out.println("PostOffice Name: " + postOffice.getName());
        System.out.println("PostOffice Area: " + postOffice.getArea());
        System.out.println("PostOffice Staff: " + postOffice.getStaff());
        System.out.println("PostOffice OpenTime: " + postOffice.getOpenTime());
        System.out.println("PostOffice SpeedPost: " + postOffice.getSpeedPost());
    }
}
