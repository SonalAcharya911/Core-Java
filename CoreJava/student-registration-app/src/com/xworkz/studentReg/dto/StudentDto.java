package com.xworkz.studentReg.dto;

public class StudentDto {
    private String studentName;
    private String email;
    private String course;

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "studentName: " + studentName + "course: " + course + "email: " + email;
    }
}
