package com.xworkz.parents.internal;

import java.util.Objects;

public class Coffee {
    private String type;
    private String brand;
    private boolean hasSugar;
    private int quantity;

    public Coffee(String type, String brand, boolean hasSugar, int quantity) {
        this.type = type;
        this.brand = brand;
        this.hasSugar = hasSugar;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "type: " + type + "brand: " + brand + "hasSugar: " + hasSugar + "quantity: " + quantity ;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Coffee)
        {
            Coffee coffee = (Coffee) obj;
            if(Objects.equals(this.type, coffee.type)
                    && Objects.equals(this.brand, coffee.brand)
                    && Objects.equals(this.hasSugar, coffee.hasSugar)
                    && Objects.equals(this.quantity, coffee.quantity))
            {
                System.out.println("coffee is matching....");
                return true;
            }
        }
        return false;
    }

}
