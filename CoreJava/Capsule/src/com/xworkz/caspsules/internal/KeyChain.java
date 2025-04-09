package com.xworkz.caspsules.internal;

public class KeyChain {
    private String name = "LoopLock";
    private String material = "Metal";
    private int keys = 5;
    private double length = 6.5;
    private boolean custom = false;

    public KeyChain() {
        System.out.println("no-arg constructor for KeyChain");
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getKeys() {
        return keys;
    }

    public double getLength() {
        return length;
    }

    public boolean getCustom() {
        return custom;
    }

    void setName(String name) {
        this.name = name;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setKeys(int keys) {
        this.keys = keys;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setCustom(boolean custom) {
        this.custom = custom;
    }
}
