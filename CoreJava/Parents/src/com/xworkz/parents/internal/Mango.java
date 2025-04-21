package com.xworkz.parents.internal;

import java.util.Objects;

public class Mango {
    private int weight;
    private String color;
    private String type;
    private boolean isRipe;

    public Mango(int weight, String color, String type, boolean isRipe){
        this.weight=weight;
        this.color=color;
        this.type=type;
        this.isRipe=isRipe;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mango) {
            Mango mango = (Mango) obj;
            if (Objects.equals(this.weight, mango.weight) &&
                    Objects.equals(this.color, mango.color) &&
                    Objects.equals(this.type, mango.type) &&
                    Objects.equals(this.isRipe, mango.isRipe)) {
                System.out.println("Mango is matching....");
                return true;
            }
        }
        return false;
    }

}
