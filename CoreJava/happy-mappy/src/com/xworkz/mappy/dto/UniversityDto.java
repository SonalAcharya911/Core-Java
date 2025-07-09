package com.xworkz.mappy.dto;
import com.xworkz.mappy.runner.UniversityRunner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UniversityDto {
    private String name;
    private String city;
    private int establishedYear;

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof UniversityDto){
                UniversityDto university=(UniversityDto) obj;
                return this.city.equals(university.city);
            }
        }
        return false;
    }
}
