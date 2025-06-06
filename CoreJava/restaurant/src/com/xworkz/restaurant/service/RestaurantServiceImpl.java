package com.xworkz.restaurant.service;

import com.xworkz.restaurant.dto.RestaurantDto;
import com.xworkz.restaurant.exceptions.*;

import java.time.LocalTime;

public class RestaurantServiceImpl implements RestaurantService{
    @Override
    public boolean validate(RestaurantDto restaurantDto) {
        if(restaurantDto!=null){
            try{
                //name
                if(restaurantDto.getRestaurantName()==null){
                    throw new NullPointerException("restaurant name is null");
                }
                else if(restaurantDto.getRestaurantName().length()<3){
                    throw new LengthCheckException("restaurant name is too short");
                }
                else if(restaurantDto.getRestaurantName().length()>25){
                    throw new LengthCheckException("restaurant name is too long");
                }
                else if (Character.isDigit(restaurantDto.getRestaurantName().charAt(0))) {
                    throw new StartWithNumberException("Restaurant name starts with a number");
                }
                else{
                    System.out.println("restaurant name is valid");
                }

                //loc
                if(restaurantDto.getLocation()==null){
                    throw new NullPointerException("restaurant location is null");
                }
                else{
                    System.out.println("valid location");
                }

                //contact
                if(restaurantDto.getContact()==0){
                    throw new NullPointerException("no contact");
                }
                else{
                    System.out.println("valid contact");
                }

                //email
                if(restaurantDto.getEmail()==null){
                    throw new NullPointerException("email is null");
                }
                else{
                    System.out.println("valid email");
                }

                //rating
                if(restaurantDto.getRating()==0){
                    throw new NullPointerException("rating is zero");
                }
                else if(restaurantDto.getRating()<3){
                    throw new InvalidRatingException("rating should be >=3");
                }
                else{
                    System.out.println("valid rating");
                }

                //food menu
                if(restaurantDto.getFoodMenu()==null){
                    throw new NullPointerException("food menu is null");
                } else if (checkElement(restaurantDto.getFoodMenu(), restaurantDto.getFoodMenu().length)){
                    throw new ArrayIndexOutOfBoundsException("index is more than array length");
                }
                else {
                    System.out.println("valid food menu");
                }

                //open and close time
                if(restaurantDto.getOpeningTime().isBefore(LocalTime.of(8,00))){
                    throw new TimeMatchException("restaurant is not yet open");
                }
                else if(restaurantDto.getClosingTime().isAfter(LocalTime.of(23,00))){
                    throw new TimeMatchException("restaurant has already closed");
                }
                else{
                    System.out.println("restaurant is open");
                }

                //book date
                if(restaurantDto.getBookedDate().isBefore(restaurantDto.getBookedDate())){
                    throw new InvalidDateException("date is invalid");
                }
                else{
                    System.out.println("valid date");
                }

                //book time
                if(restaurantDto.getBookedTime().isAfter(restaurantDto.getClosingTime())||restaurantDto.getBookedTime().isBefore(restaurantDto.getOpeningTime())){
                    throw new TimeMatchException("booking time is invalid");
                }else{
                    System.out.println("valid booking time");
                }

            }
            catch(Exception e){
                System.out.println("validation failed "+ e.getMessage());
                return false;
            }
        }
        else{
            throw new NullPointerException("restaurantDto is null");
        }
        return true;
    }

    public boolean checkElement(String[] arr,int index){
        if(arr.length<=index){
            return false;
        }
        else return true;
    }
}
