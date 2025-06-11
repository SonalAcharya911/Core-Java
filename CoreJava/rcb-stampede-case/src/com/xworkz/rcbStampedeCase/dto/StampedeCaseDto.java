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
        this.event=event;
        this.location=location;
        this.deaths=deaths;
        this.injuries=injuries;
    }

}
