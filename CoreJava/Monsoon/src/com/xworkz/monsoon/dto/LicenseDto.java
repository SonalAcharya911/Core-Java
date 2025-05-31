package com.xworkz.monsoon.dto;

public class LicenseDto {
    String name;
    String age;
    String address;
    String contact;
    String type;

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

}
