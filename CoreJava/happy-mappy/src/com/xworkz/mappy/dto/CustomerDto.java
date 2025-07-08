package com.xworkz.mappy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CustomerDto {
    private String name;
    private int id;
    private String email;
    private String city;

    @Override
    public int hashCode() {
        System.out.println("running hashCode of customer");
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running equals in customer");
        if(obj!=null){
            if(obj instanceof CustomerDto){
                CustomerDto customer=(CustomerDto) obj;
                return this.name.equals(customer.name);
            }
        }
        return false;
    }
}
