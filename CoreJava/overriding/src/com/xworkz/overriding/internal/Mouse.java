package com.xworkz.overriding.internal;

public class Mouse extends InputDevice{
    public Mouse(){
        System.out.println("no-arg constructor for Mouse");
    }
    public void input() {
        System.out.println("running input in Mouse");
    }
    public void click() {
        System.out.println("running click in Mouse");
    }
}
