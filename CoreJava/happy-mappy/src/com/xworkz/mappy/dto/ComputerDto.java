package com.xworkz.mappy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ComputerDto {
    private String model;
    private String type;
    private double price;
    private int storage;

    @Override
    public int hashCode() {
        System.out.println("running hashCode of computer");
        return Objects.hashCode(model);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running equals in computer");
        if(obj!=null){
            if(obj instanceof ComputerDto){
                ComputerDto computer=(ComputerDto) obj;
                return this.model.equals(computer.model);
            }
        }
        return false;
    }
}
