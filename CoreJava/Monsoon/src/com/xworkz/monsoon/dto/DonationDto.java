package com.xworkz.monsoon.dto;

public class DonationDto {
    private String name;
    private long contact;
    private String email;
    private double amount;
    private String description;

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public long getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

