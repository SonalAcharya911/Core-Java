package com.xworkz.birthday.service;

import com.xworkz.birthday.dto.BirthdayPartyDto;

public interface BirthdayPartyService {
    boolean validate(BirthdayPartyDto birthdayPartyDto);

    BirthdayPartyDto[] findAll();
}
