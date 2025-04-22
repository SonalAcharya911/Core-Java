package com.xworkz.parents.internal;

import java.util.Objects;

public class Medal {
    private String metalType;
    private String event;
    private String winnerName;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setMetalType(String metalType) {
        this.metalType = metalType;
    }

    public void setWinnerName(String winnerName) {
        this.winnerName = winnerName;
    }

    @Override
    public String toString() {
        return "metalType: " + metalType + "event: " + event + "winnerName: " + winnerName + "color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Medal) {
            Medal medal = (Medal) obj;
            if (Objects.equals(this.metalType, medal.metalType) && Objects.equals(this.event, medal.event) && Objects.equals(this.winnerName, medal.winnerName) && Objects.equals(this.color, medal.color)) {
                System.out.println("Medal is matching....");
                return true;
            }
        }
        return false;
    }


}
