package com.xworkz.parents.internal;

public class Popcorn {
    private String flavor;
    private int weight;
    private boolean isSalted;
    private boolean isButtered;

    public void setButtered(boolean buttered) {
        isButtered = buttered;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSalted(boolean salted) {
        isSalted = salted;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
