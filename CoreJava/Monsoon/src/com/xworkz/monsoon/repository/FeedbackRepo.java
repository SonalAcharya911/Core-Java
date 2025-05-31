package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.DonationDto;
import com.xworkz.monsoon.dto.FeedbackDto;

public interface FeedbackRepo {
    boolean persist(FeedbackDto feedbackDto);
}
