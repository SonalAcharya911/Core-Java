package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.dto.RestaurantDto;
import com.xworkz.restaurant.service.RestaurantService;
import com.xworkz.restaurant.service.RestaurantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;


public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantDto restaurantDto=new RestaurantDto();


        restaurantDto.setRestaurantName("Empire");
        restaurantDto.setEmail("hotelempire@gmail.com");
        restaurantDto.setLocation("Brookefield");
        restaurantDto.setContact(9083450825L);
        restaurantDto.setRating(4);

        String[] foodMenu=new String[]{"Chicken Fried Rice","Chicken Noodles","Paneer Butter Masala","Butter Chicken","Paneer Tikka","Dal fry","Rice","Naan","Tandoori Roti"};

        restaurantDto.setFoodMenu(foodMenu);
        restaurantDto.setType("veg & non-veg");
        restaurantDto.setOpeningTime(LocalTime.of(10,00));
        restaurantDto.setClosingTime(LocalTime.of(21,00));
        restaurantDto.setBookedDate(LocalDate.of(2025,05,17));
        restaurantDto.setBookedTime(LocalTime.of(15,15));

        RestaurantServiceImpl restaurantService=new RestaurantServiceImpl();
        restaurantService.validate(restaurantDto);
    }
}
