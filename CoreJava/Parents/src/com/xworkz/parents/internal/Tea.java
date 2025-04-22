package com.xworkz.parents.internal;

import jdk.nashorn.internal.codegen.ObjectCreator;

import java.util.Objects;

public class Tea {
    private String type;
    private int quantity;
    private String brand;
    private boolean hasSugar;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "type: " + type + "quantity: " + quantity + "brand: " + brand + "hasSugar: " + hasSugar;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Tea){
            Tea tea=(Tea)obj;
            if(Objects.equals(this.brand,tea.brand)&& Objects.equals(this.quantity,tea.quantity)&&Objects.equals(this.type,tea.type)&&Objects.equals(this.hasSugar,tea.hasSugar)){
                System.out.println("tea tastes the same");
                return true;
            }
        }
        return false;
    }
}
