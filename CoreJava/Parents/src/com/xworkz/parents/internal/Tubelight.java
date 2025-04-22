package com.xworkz.parents.internal;

import java.util.Objects;

public class Tubelight {
    private int length;
    private String color;
    private int power;
    private boolean isLED;

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLED(boolean LED) {
        isLED = LED;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "length: " + length + "color: " + color + "power: " + power + "isLED: " + isLED;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Tubelight)
        {
            Tubelight tubelight = (Tubelight) obj;
            if(Objects.equals(this.length, tubelight.length)
                    && Objects.equals(this.color, tubelight.color)
                    && Objects.equals(this.power, tubelight.power)
                    && Objects.equals(this.isLED, tubelight.isLED))
            {
                System.out.println("tubelight is matching....");
                return true;
            }
        }
        return false;
    }


}
