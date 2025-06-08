package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.FilenameParserDto;
import com.xworkz.extraordinary.service.FilenameParserService;
import com.xworkz.extraordinary.service.FilenameParserServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FilenameParserRunner {
    public static void main(String[] args) {
        FilenameParserDto fileDto = new FilenameParserDto();
        String fileName;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the file name:");
            fileName = scanner.nextLine();
            fileDto.setFileName(fileName);

            FilenameParserService fileService = new FilenameParserServiceImpl();
            boolean valid = fileService.validate(fileDto);

            if (valid) {
                System.out.println("File name: " + fileDto.getFileName());
                System.out.println("File extension: " + fileDto.getExtension());
            } else {
                System.out.println("Data not valid");
            }

        } catch (InputMismatchException | NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
