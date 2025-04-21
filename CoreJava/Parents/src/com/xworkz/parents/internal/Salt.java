package com.xworkz.parents.internal;

public class Salt {
    private String type;
    private int weight;
    private boolean isIodized;
    private String brand;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIodized(boolean iodized) {
        isIodized = iodized;
    }

}
