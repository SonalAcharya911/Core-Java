package com.xworkz.overriding.internal;

public class Software {
    private String name;
    private String version;

    public void setName(String name){
        this.name = name;
    }

    public void setVersion(String version){
        this.version = version;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("version: " + version);
        return "";
    }

    public Software(){
        System.out.println("no-arg constructor for Software");
    }
    public void developSoftware() {
        System.out.println("running developSoftware in Software");
    }
}
