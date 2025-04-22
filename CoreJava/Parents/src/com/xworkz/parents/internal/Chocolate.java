package com.xworkz.parents.internal;

import java.util.Objects;

public class Chocolate {
    private String flavor;
    private int weight;
    private boolean isDark;
    private int price;

    public Chocolate(String flavor, int weight, boolean isDark, int price) {
        this.flavor = flavor;
        this.weight = weight;
        this.isDark = isDark;
        this.price = price;
    }

    @Override
    public String toString() {
        return "flavor: " + flavor + "weight: " + weight + "isDark: " + isDark + "price: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Chocolate)
        {
            Chocolate chocolate = (Chocolate) obj;
            if(Objects.equals(this.flavor, chocolate.flavor) && Objects.equals(this.weight, chocolate.weight) && Objects.equals(this.isDark, chocolate.isDark) && Objects.equals(this.price, chocolate.price))
            {
                System.out.println("chocolate is matching....");
                return true;
            }
        }
        return false;
    }


}
