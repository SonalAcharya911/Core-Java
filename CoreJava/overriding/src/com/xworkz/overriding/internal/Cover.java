package com.xworkz.overriding.internal;

public class Cover {
    private String pattern;

    private String texture;

    public Cover(String pattern,String texture){
        this.pattern=pattern;
        this.texture=texture;
    }

    @Override
    public String toString() {
        System.out.println("pattern: " + pattern);
        System.out.println("texture: " + texture);
        return "";
    }

    public Cover(){
        System.out.println("no-arg constructor for Cover");
    }
    public void shield() {
        System.out.println("running shield in Cover");
    }
}
