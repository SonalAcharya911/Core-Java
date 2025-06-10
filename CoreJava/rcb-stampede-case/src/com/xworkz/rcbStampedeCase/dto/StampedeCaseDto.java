package com.xworkz.rcbStampedeCase.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor


public class StampedeCaseDto {
    private String event;
    private int deaths;
    private int injuries;
    private String location;

    public StampedeCaseDto(String event,String location,int deaths,int injuries){
        event=this.event;
        location=this.location;
        deaths=this.deaths;
        injuries=this.injuries;
    }

}
