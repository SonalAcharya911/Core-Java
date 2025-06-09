package com.xworkz.extraordinary.runner;

import java.time.LocalDateTime;

public class MeetingSchedulerRunner {
    public static void main(String[] args) {
        Meeting[] meetings = new Meeting[1];
        meetings[0] = new Meeting(LocalDateTime.of(2025, 6, 10, 9, 0), 60);
        System.out.println(meetings[0].durationMinutes);
        Meeting newMeeting = new Meeting(LocalDateTime.of(2025, 6, 10, 9, 30), 30);

        try {
            for (int i = 0; i < meetings.length; i++) {
                if (meetings[i].overlaps(newMeeting)) {
                    throw new IllegalArgumentException("Meeting time overlaps with existing meeting");
                }
            }
            System.out.println("Meeting scheduled successfully");
            // To add new meeting, need to create new array with length + 1 (optional)
        } catch (IllegalArgumentException e) {
            System.out.println("Scheduling error: " + e.getMessage());
        }
    }

    static class Meeting {
        LocalDateTime start;
        int durationMinutes;

        public Meeting(LocalDateTime start, int duration) {
            this.start = start;
            this.durationMinutes = duration;
        }

        boolean overlaps(Meeting other) {
            LocalDateTime thisEnd = this.start.plusMinutes(this.durationMinutes);
            LocalDateTime otherEnd = other.start.plusMinutes(other.durationMinutes);
            return !this.start.isAfter(otherEnd) && !other.start.isAfter(thisEnd);
        }
    }

}
