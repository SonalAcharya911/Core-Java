package com.xworkz.overriding.internal;

public class Tool {
    private String type;
    private String material;

    public void setType(String type){
        this.type = type;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    @Override
    public String toString() {
        System.out.println("type: " + type);
        System.out.println("material: " + material);
        return "";
    }

    public Tool(){
        System.out.println("no-arg constructor for Tool");
    }
    public void useTool() {
        System.out.println("running useTool in Tool");
    }
}
