package com.xworkz.caspsules.internal;

public class Badge {
    private String badgeType="Achievement";
    private String role="Officer";
    private String location="left chest";
    private String color="white";
    private String rank="Master";

    public Badge(){
        System.out.println("no-arg constructor for Badge");
    }

    public String getLocation() {
        return location;
    }

    public String getBadgeType() {
        return badgeType;
    }

    public String getColor() {
        return color;
    }

    public String getRank() {
        return rank;
    }

    public String getRole() {
        return role;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setBadgeType(String badgeType) {
        this.badgeType = badgeType;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setRank(String rank) {
        this.rank = rank;
    }

     void setRole(String role) {
        this.role = role;
    }

}
