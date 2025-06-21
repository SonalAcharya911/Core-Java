package com.xworkz.birthday.service;

import com.xworkz.birthday.dto.BirthdayPartyDto;

import java.util.Optional;

public interface BirthdayPartyService {
    boolean validate(BirthdayPartyDto birthdayPartyDto);

    Optional<BirthdayPartyDto[]> findAll();
}
