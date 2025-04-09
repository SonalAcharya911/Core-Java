package com.xworkz.caspsules.internal;

public class PostOffice {
    private String name = "GreenPost";
    private String area = "JP Nagar";
    private int staff = 12;
    private double openTime = 9.30;
    private boolean speedPost = true;

    public PostOffice() {
        System.out.println("no-arg constructor for PostOffice");
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public int getStaff() {
        return staff;
    }

    public double getOpenTime() {
        return openTime;
    }

    public boolean getSpeedPost() {
        return speedPost;
    }

    void setName(String name) {
        this.name = name;
    }

    void setArea(String area) {
        this.area = area;
    }

    void setStaff(int staff) {
        this.staff = staff;
    }

    void setOpenTime(double openTime) {
        this.openTime = openTime;
    }

    void setSpeedPost(boolean speedPost) {
        this.speedPost = speedPost;
    }
}

