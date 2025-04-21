package com.xworkz.parents.internal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Popcorn) {
            Popcorn popcorn = (Popcorn) obj;
            if (Objects.equals(this.flavor, popcorn.flavor) &&
                    Objects.equals(this.weight, popcorn.weight) &&
                    Objects.equals(this.isSalted, popcorn.isSalted) &&
                    Objects.equals(this.isButtered, popcorn.isButtered)) {
                System.out.println("Popcorn is matching....");
                return true;
            }
        }
        return false;
    }


}
