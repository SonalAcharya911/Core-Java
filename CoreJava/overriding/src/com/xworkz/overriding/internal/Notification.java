package com.xworkz.overriding.internal;

public class Notification {
    private String message;
    private String type;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        System.out.println("message: " + message);
        System.out.println("type: " + type);
        return "";
    }

    public Notification(){
        System.out.println("no-arg constructor for Notification");
    }
    public void checkNotification() {
        System.out.println("running checkNotification in Notification");
    }
}
