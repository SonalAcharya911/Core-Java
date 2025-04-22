package com.xworkz.parents.internal;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "type: " + type + "weight: " + weight + "isIodized: " + isIodized + "brand: " + brand;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Salt)
        {
            Salt salt = (Salt) obj;
            if(Objects.equals(this.type, salt.type)
                    && Objects.equals(this.weight, salt.weight)
                    && Objects.equals(this.isIodized, salt.isIodized)
                    && Objects.equals(this.brand, salt.brand))
            {
                System.out.println("salt is matching....");
                return true;
            }
        }
        return false;
    }


}
