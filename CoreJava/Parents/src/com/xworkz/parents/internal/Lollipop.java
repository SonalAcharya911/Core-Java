package com.xworkz.parents.internal;

import java.util.Objects;

public class Lollipop {
    private String flavor;
    private int weight;
    private String color;
    private boolean hasStick;

    public Lollipop(String flavor,int weight,String color, boolean hasStick){
        this.flavor=flavor;
        this.weight=weight;
        this.color=color;
        this.hasStick=hasStick;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lollipop) {
            Lollipop lollipop = (Lollipop) obj;
            if (Objects.equals(this.flavor, lollipop.flavor) &&
                    Objects.equals(this.weight, lollipop.weight) &&
                    Objects.equals(this.color, lollipop.color) &&
                    Objects.equals(this.hasStick, lollipop.hasStick)) {
                System.out.println("Lollipop is matching....");
                return true;
            }
        }
        return false;
    }


}
