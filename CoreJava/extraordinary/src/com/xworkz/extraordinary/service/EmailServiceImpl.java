package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.EmailDto;
import com.xworkz.extraordinary.exceptions.InvalidDomainException;
import com.xworkz.extraordinary.exceptions.InvalidEmailFormatException;

public class EmailServiceImpl implements EmailService {

    @Override
    public boolean validateEmail(EmailDto dto) throws InvalidEmailFormatException, InvalidDomainException {
        try {
            if (dto != null && dto.getEmailAddress() != null) {
                String email = dto.getEmailAddress();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new InvalidEmailFormatException("Invalid email format: Missing '@' or '.'");
                }

                // Inner try-catch block to check domain
                try {
                    String domain = email.substring(email.lastIndexOf("."));
                    if (!(domain.equals(".com") || domain.equals(".org") || domain.equals(".in"))) {
                        throw new InvalidDomainException("Unsupported domain: " + domain);
                    } else {
                        System.out.println("Email domain is valid: " + domain);
                    }
                } catch (InvalidDomainException ide) {
                    System.out.println("Domain Error: " + ide.getMessage());
                    throw ide;
                }

                System.out.println("Email format is valid: " + email);
                return true;
            } else {
                throw new NullPointerException("Email DTO or address is null");
            }
        } catch (InvalidEmailFormatException iefe) {
            System.out.println("Format Error: " + iefe.getMessage());
            throw iefe;
        }
    }
}
