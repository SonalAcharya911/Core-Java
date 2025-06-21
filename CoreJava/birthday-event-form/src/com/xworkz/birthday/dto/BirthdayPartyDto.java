package com.xworkz.birthday.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BirthdayPartyDto {
    private int guestId;
    private String guestName;
    private long contactNumber;
    private String email;
    private String rsvpStatus;
    private int numberOfAttendees;
    private String foodPreference;
    private String specialRequests;
    private LocalDate createdDate;
    private LocalTime createdTime;
    private int id;
}
