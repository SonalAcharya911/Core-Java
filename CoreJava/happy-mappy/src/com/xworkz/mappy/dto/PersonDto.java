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
public class PersonDto {
    private String name;
    private String email;
    private String aadharNumber;

    @Override
    public int hashCode() {
        System.out.println("running hashCode of person");
        return Objects.hashCode(email);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running equals in person");
        if(obj!=null){
            if(obj instanceof PersonDto){
                PersonDto person=(PersonDto) obj;
                return this.name.equals(person.name);
            }
        }
        return false;
    }
}
