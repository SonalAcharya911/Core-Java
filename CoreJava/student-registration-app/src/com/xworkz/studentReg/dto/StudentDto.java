package com.xworkz.studentReg.dto;

public class StudentDto {
    private String studentName;
    private int rollNumber;
    private String email;

    public String getEmail() {
        return email;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "studentName: " + studentName + "rollNumber: " + rollNumber + "email: " + email;
    }
}
