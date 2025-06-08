package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.FilenameParserDto;

public class FilenameParserServiceImpl implements FilenameParserService{
    @Override
    public boolean validate(FilenameParserDto filenameParserDto) {
        try {
            if (filenameParserDto != null) {
                String fileName = filenameParserDto.getFileName();
                if (fileName != null && fileName.contains(".") && !fileName.endsWith(".")) {
                    int index = fileName.lastIndexOf(".");
                    String extension = fileName.substring(index + 1);
                    filenameParserDto.setExtension(extension);
                    System.out.println("Valid file. Extension is: " + extension);
                } else {
                    throw new StringIndexOutOfBoundsException("Invalid file name: No valid extension found");
                }
            } else {
                throw new NullPointerException("DTO is null");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return true;
    }
}
