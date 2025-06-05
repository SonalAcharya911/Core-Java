package com.xworkz.sandalwood.runner;

import com.xworkz.sandalwood.dto.MovieDto;
import com.xworkz.sandalwood.exceptions.*;
import javafx.fxml.LoadException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;

public class MovieRunner {
    public static void main(String[] args) throws IOException, ParseException, SQLException, ClassNotFoundException, InterruptedException, NoSuchMethodException, BookingLimitExceededException, EmployeeNotFoundException, InvalidAgeException, LoginFailedException, PaymentFailedException, SeatAlreadyBooked, TicketExpiredException, NoSeatsAvailableException {
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
        int numOfTickets=3;
        boolean employeeAbsent=true;
        int age=20;
        boolean loginSuccess=true;
        boolean seatsAvailable=true;
        boolean paid=true;
        isSeatAvailable(seatNo);
        int ticketNum=101;
        Date date=null;

        if(numOfTickets>3){
            throw new BookingLimitExceededException("booking limit exceeded");
        }
        if(employeeAbsent){
            throw new EmployeeNotFoundException("employee not found");
        }
        if(age>90){
            throw new InvalidAgeException("invalid age");

        }
        if(!loginSuccess){
            throw new LoginFailedException("login failed");
        }
        if(!paid){
            throw new PaymentFailedException("payment failed");
        }
        if(!isSeatAvailable(seatNo)){
            throw new SeatAlreadyBooked("seat already booked");
        }
        if(!isTicketValid(ticketNum,date)){
            throw new TicketExpiredException("ticket expired");
        }
        if(!seatsAvailable){
            throw new NoSeatsAvailableException("no seats available");
        }


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

    public static boolean isSeatAvailable(int seatNo){
        if(seatNo==1 || seatNo==10 || seatNo == 15){
            return false;
        }
        else{
            return true;
        }


    }
    public static boolean isTicketValid(int ticketNum, Date date){
        if(date.after(date)){
            return false;
        }
        else{
            return true;
        }
    }
}
