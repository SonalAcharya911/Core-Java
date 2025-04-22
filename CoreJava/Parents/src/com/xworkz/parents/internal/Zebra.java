package com.xworkz.parents.internal;

import java.util.Objects;

public class Zebra {
    private String name;
    private int age;
    private int weight;
    private boolean isWild;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    @Override
    public String toString() {
        return "name: " + name + "age: " + age + "weight: " + weight + "isWild: " + isWild;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Zebra)
        {
            Zebra zebra = (Zebra) obj;
            if(Objects.equals(this.name, zebra.name)
                    && Objects.equals(this.age, zebra.age)
                    && Objects.equals(this.weight, zebra.weight)
                    && Objects.equals(this.isWild, zebra.isWild))
            {
                System.out.println("zebra is matching....");
                return true;
            }
        }
        return false;
    }


}
