package com.xworkz.caspsules.internal;

public class PostMan {

    public PostMan(){
        System.out.println("no-arg constructor for PostMan");
    }

    public void deliver(){

        System.out.println("running deliver in PostMan");
        PostOffice postOffice = new PostOffice();

        System.out.println("PostOffice Name: " + postOffice.getName());
        System.out.println("PostOffice Area: " + postOffice.getArea());
        System.out.println("PostOffice Staff: " + postOffice.getStaff());
        System.out.println("PostOffice OpenTime: " + postOffice.getOpenTime());
        System.out.println("PostOffice SpeedPost: " + postOffice.getSpeedPost());

        postOffice.setName("QuickMail");
        postOffice.setArea("Indiranagar");
        postOffice.setStaff(20);
        postOffice.setOpenTime(8.00);
        postOffice.setSpeedPost(false);

        System.out.println("updated PostOffice Name: " + postOffice.getName());
        System.out.println("updated PostOffice Area: " + postOffice.getArea());
        System.out.println("updated PostOffice Staff: " + postOffice.getStaff());
        System.out.println("updated PostOffice OpenTime: " + postOffice.getOpenTime());
        System.out.println("updated PostOffice SpeedPost: " + postOffice.getSpeedPost());
    }
}
