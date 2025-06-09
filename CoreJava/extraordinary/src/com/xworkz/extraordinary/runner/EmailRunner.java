package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.EmailDto;
import com.xworkz.extraordinary.exceptions.InvalidDomainException;
import com.xworkz.extraordinary.exceptions.InvalidEmailFormatException;
import com.xworkz.extraordinary.service.EmailService;
import com.xworkz.extraordinary.service.EmailServiceImpl;

import java.util.Scanner;

public class EmailRunner {
    public static void main(String[] args) {
        EmailDto dto = new EmailDto();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();

            dto.setEmailAddress(email);

            EmailService service = new EmailServiceImpl();
            service.validateEmail(dto);

        } catch (InvalidEmailFormatException | InvalidDomainException e) {
            System.out.println("Validation Failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
