package com.xworkz.caspsules.internal;

public class Officer {
    public void wears() {
        System.out.println("running wears in Officer");
        Badge badge = new Badge();
        System.out.println("Badge type: " + badge.getBadgeType());
        System.out.println("Badge location: " + badge.getLocation());
        System.out.println("Badge color: " + badge.getColor());
        System.out.println("Badge rank: " + badge.getRank());
        System.out.println("Badge role: " + badge.getRole());

        badge.setBadgeType("Achievement");
        badge.setLocation("right chest");
        badge.setRank("Expert");
        badge.setRole("Volunteer");
        badge.setColor("Gold");

        System.out.println("updated Badge type: " + badge.getBadgeType());
        System.out.println("updated Badge location: " + badge.getLocation());
        System.out.println("updated Badge color: " + badge.getColor());
        System.out.println("updated Badge rank: " + badge.getRank());
        System.out.println("updated Badge role: " + badge.getRole());
    }
}
