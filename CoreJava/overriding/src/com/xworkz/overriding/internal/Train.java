package com.xworkz.overriding.internal;

public class Train {

    private String route;
    private int coaches;

    public void setRoute(String route){
        this.route = route;
    }

    public void setCoaches(int coaches){
        this.coaches = coaches;
    }

    @Override
    public String toString() {
        System.out.println("route: " + route);
        System.out.println("coaches: " + coaches);
        return "";
    }

    public Train(){
        System.out.println("no-arg constructor for Train");
    }
    public void rideTrain() {
        System.out.println("running rideTrain in Train");
    }
}
