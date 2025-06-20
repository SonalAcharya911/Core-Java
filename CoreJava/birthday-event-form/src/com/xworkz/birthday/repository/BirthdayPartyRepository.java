package com.xworkz.birthday.repository;

import com.xworkz.birthday.dto.BirthdayPartyDto;

import java.util.Optional;

public interface BirthdayPartyRepository {
    boolean persist(BirthdayPartyDto birthdayPartyDto);

    default Optional<BirthdayPartyDto[]> findAll(){
        return Optional.empty();
    }

    BirthdayPartyDto findByID(int id);
}
