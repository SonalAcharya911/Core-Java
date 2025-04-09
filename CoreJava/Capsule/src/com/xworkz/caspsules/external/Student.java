package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.Badge;

public class Student {
    public void earn(){
        System.out.println("running earn in Student");
        Badge badge=new Badge();

        System.out.println("Badge type: " + badge.getBadgeType());
        System.out.println("Badge location: " + badge.getLocation());
        System.out.println("Badge color: " + badge.getColor());
        System.out.println("Badge rank: " + badge.getRank());
        System.out.println("Badge role: " + badge.getRole());
    }
}
