package com.xworkz.overriding.internal;

public class Message extends Text{
    public Message(){
        System.out.println("no-arg constructor for Message");
    }

    public void sendMessage() {
        System.out.println("running sendMessage in Message");
    }
    public void sendText() {
        System.out.println("running sendText in Message");
    }
}
