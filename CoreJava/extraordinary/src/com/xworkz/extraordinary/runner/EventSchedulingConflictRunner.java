package com.xworkz.extraordinary.runner;

import java.time.LocalTime;

public class EventSchedulingConflictRunner {
    public static void main(String[] args) {
        LocalTime event1End = LocalTime.of(12, 0);
        LocalTime event2Start = LocalTime.of(11, 0);
        try {
            if (!event1End.isAfter(event2Start)) {
                throw new IllegalArgumentException("Event 1 must end after Event 2 starts");
            }
            System.out.println("Event scheduling is valid");
        } catch (IllegalArgumentException e) {
            System.out.println("Scheduling conflict: " + e.getMessage());
        }
    }
}
