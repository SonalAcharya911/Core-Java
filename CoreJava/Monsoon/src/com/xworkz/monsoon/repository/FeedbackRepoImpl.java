package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.FeedbackDto;

public class FeedbackRepoImpl implements FeedbackRepo{
    @Override
    public boolean persist(FeedbackDto feedbackDto) {
        System.out.println("running persist in FeedbackRepoImpl");
        if(feedbackDto!=null){
            System.out.println("feedbackDto is not null");
        }
        else{
            System.out.println("feedbackDto is cannot be null");
            return false;
        }
        return true;
    }
}
