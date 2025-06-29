package com.xworkz.birthday.repository;

import com.xworkz.birthday.dto.BirthdayPartyDto;

import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Optional;

public interface BirthdayPartyRepository {
    boolean persist(BirthdayPartyDto birthdayPartyDto);

    default Optional<BirthdayPartyDto[]> findAll(){
        return Optional.empty();
    }

    default Optional<BirthdayPartyDto> findByID(int id) {
        return Optional.empty();
    }

}
