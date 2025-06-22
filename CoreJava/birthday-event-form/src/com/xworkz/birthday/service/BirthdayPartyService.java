package com.xworkz.birthday.service;

import com.xworkz.birthday.dto.BirthdayPartyDto;

import java.util.Optional;

public interface BirthdayPartyService {
    boolean validate(BirthdayPartyDto birthdayPartyDto);

    default Optional<BirthdayPartyDto[]> findAll(){
        return Optional.empty();
    }
}
