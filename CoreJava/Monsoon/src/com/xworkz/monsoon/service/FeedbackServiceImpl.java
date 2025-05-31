package com.xworkz.monsoon.service;

import com.xworkz.monsoon.dto.FeedbackDto;

public class FeedbackServiceImpl implements FeedbackService{

    public FeedbackServiceImpl(){
        System.out.println("FeedbackServiceImpl created...");
    }


    @Override
    public boolean save(FeedbackDto feedbackDto) {
        return false;
    }
}
