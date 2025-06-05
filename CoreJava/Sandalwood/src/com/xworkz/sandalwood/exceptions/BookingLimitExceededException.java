package com.xworkz.sandalwood.exceptions;

public class BookingLimitExceededException extends Exception{
    public BookingLimitExceededException(String message){
        super(message);
    }
}
