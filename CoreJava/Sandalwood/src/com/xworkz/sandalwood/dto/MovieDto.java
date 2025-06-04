package com.xworkz.sandalwood.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private String movieName;
    private String releaseDate;
    private int budget;
    private int boxOffice;
    private String leadActor;
    private String genre;
}
