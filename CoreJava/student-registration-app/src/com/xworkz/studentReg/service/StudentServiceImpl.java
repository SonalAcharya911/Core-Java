package com.xworkz.studentReg.service;

import com.xworkz.studentReg.dto.StudentDto;
public class StudentServiceImpl implements StudentService{

    @Override
    public void printStudentDetails(StudentDto studentDto) {
        System.out.println("studentName: "+studentDto.getStudentName());
        System.out.println("student Roll Number: "+studentDto.getRollNumber());
        System.out.println("student email: "+studentDto.getEmail());

    }
}
