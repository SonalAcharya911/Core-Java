package com.xworkz.overriding.internal;

public class Brush {
    private String type;
    private String handleMaterial;

    public Brush(String type,String handleMaterial){
        this.handleMaterial=handleMaterial;
        this.type=type;
    }

    @Override
    public String toString() {
        System.out.println(this.handleMaterial);
        System.out.println(this.type);
        return "";
    }

    public Brush(){
        System.out.println("no-arg constructor for Brush");
    }
    public void clean() {
        System.out.println("running clean in Brush");
    }


}
