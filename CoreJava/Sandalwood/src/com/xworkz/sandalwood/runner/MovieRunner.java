package com.xworkz.sandalwood.runner;

import com.xworkz.sandalwood.dto.MovieDto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;
import java.text.ParseException;

public class MovieRunner {
    public static void main(String[] args) throws IOException, ParseException, SQLException, ClassNotFoundException, InterruptedException, NoSuchMethodException {
        MovieDto movieDto=new MovieDto();

        movieDto.toString();


        checkFile();
        fileExist();
        readFile();
        parseDate();
        connectDatabase();
        findClass();
        openURL();
        performTask();
        getMethodDetails();

        int seatNo=19;
        String employeeName="Shashi";
        int age=20;
        boolean loginSuccess=true;
        boolean seatsAvailable=true;


    }

    public static void checkFile() throws FileNotFoundException {
        System.out.println("running checkFile");
        throw new FileNotFoundException("file not found");
    }

    public static void fileExist() throws FileAlreadyExistsException {
        System.out.println("running fileExist");
        throw new FileAlreadyExistsException("file exists already");
    }
    public static void readFile() throws IOException {
        throw new IOException();
    }

    public static void parseDate() throws ParseException {
        throw new ParseException("Invalid date format", 0);
    }

    public static void connectDatabase() throws SQLException {
        throw new SQLException();
    }


    public static void findClass() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void openURL() throws MalformedURLException {
        throw new MalformedURLException();
    }

    public static void performTask() throws InterruptedException {
        throw new InterruptedException();
    }

    public static void getMethodDetails() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

}
