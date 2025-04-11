package com.xworkz.overriding.internal;

public class Alarm extends Notification{
    public Alarm(){
        System.out.println("no-arg constructor for Alarm");
    }
    public void ring() {
        System.out.println("running ring in Alarm");
    }
    public void checkNotification() {
        System.out.println("running checkNotification in Alarm");
    }
}
