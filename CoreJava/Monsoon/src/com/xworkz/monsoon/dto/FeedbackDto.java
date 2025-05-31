package com.xworkz.monsoon.dto;

public class FeedbackDto {
    String name;
    int age;
    String feedback;
    String subject;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
