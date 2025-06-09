package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.EmailDto;
import com.xworkz.extraordinary.exceptions.InvalidDomainException;
import com.xworkz.extraordinary.exceptions.InvalidEmailFormatException;

public interface EmailService {
    boolean validateEmail(EmailDto dto) throws InvalidEmailFormatException, InvalidDomainException;
}
