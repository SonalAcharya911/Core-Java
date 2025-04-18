package com.xworkz.parents.internal;

import java.util.Objects;

public class Bedsheet {
    private String material;
    private String color;
    private int cost;
    private String size;

    public Bedsheet(String material,String color,int cost,String size){
        this.color=color;
        this.material=material;
        this.cost=cost;
        this.size=size;
    }

    @Override
    public String toString() {
        return "material: " + material + "color: " + color + "cost: " + cost + "size: " + size;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Bedsheet)
        {
            Bedsheet bedsheet=(Bedsheet) obj;
            if(Objects.equals(this.color,bedsheet.color)&& Objects.equals(this.cost,bedsheet.cost)  && Objects.equals(this.material,bedsheet.material) && Objects.equals(this.size,bedsheet.size))
            {
                System.out.println("bedsheet is matching....");
                return true;
            }
        }

        return false;
    }
}
