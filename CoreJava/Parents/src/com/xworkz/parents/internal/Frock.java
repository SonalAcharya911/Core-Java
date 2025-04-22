package com.xworkz.parents.internal;

import java.util.Objects;

public class Frock {
    private String color;
    private String size;
    private String fabric;
    private boolean hasSleeves;

    public Frock(String color, String size, String fabric, boolean hasSleeves) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        this.hasSleeves = hasSleeves;
    }

    @Override
    public String toString() {
        return "color: " + color + "size: " + size + "fabric: " + fabric + "hasSleeves: " + hasSleeves ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Frock) {
            Frock frock = (Frock) obj;
            if (Objects.equals(this.color, frock.color) && Objects.equals(this.size, frock.size) && Objects.equals(this.fabric, frock.fabric) && Objects.equals(this.hasSleeves, frock.hasSleeves)) {
                System.out.println("Frock is matching....");
                    return true;
            }
        }
        return false;
    }
}
