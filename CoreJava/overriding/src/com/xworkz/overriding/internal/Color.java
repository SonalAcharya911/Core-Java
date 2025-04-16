package com.xworkz.overriding.internal;

public class Color {
    private String shade;

    private String hexCode;

    public Color(String shade,String hexCode){
        this.hexCode=hexCode;
        this.shade=shade;
    }

    @Override
    public String toString() {
        System.out.println(this.hexCode);
        System.out.println(this.shade);
        return "";
    }


    public Color(){
        System.out.println("no-arg constructor for Color");
    }

    public void blend() {
        System.out.println("running blend in Color");
    }


}
