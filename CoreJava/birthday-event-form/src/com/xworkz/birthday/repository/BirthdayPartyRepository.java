package com.xworkz.birthday.repository;

import com.xworkz.birthday.dto.BirthdayPartyDto;

import java.util.Optional;

public interface BirthdayPartyRepository {
    boolean persist(BirthdayPartyDto birthdayPartyDto);

    default Optional<BirthdayPartyDto[]> findAll(){
        return java.util.Optional.empty();
    }

    default Optional<BirthdayPartyDto> findByID(int id) {
        return java.util.Optional.empty();
    }

}
