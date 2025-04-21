package com.xworkz.parents.internal;

import java.util.Objects;

public class Ball {
    private String color;
    private int size;
    private String material;
    private boolean isInflated;

    public Ball(String color, int size, String material, boolean isInflated) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.isInflated = isInflated;
    }

    @Override
    public String toString() {
        return "color: " + color + "size: " + size + "material: " + material + "isInflated: " + isInflated;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Ball)
        {
            Ball ball=(Ball) obj;
            if(Objects.equals(this.color,ball.color)&& Objects.equals(this.isInflated,ball.isInflated)  && Objects.equals(this.material,ball.material) && Objects.equals(this.size,ball.size))
            {
                System.out.println("ball is matching....");
                return true;
            }
        }
        return false;
    }
}
