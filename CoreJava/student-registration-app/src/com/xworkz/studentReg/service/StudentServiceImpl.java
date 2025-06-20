package com.xworkz.studentReg.service;

import com.xworkz.studentReg.dto.StudentDto;
public class StudentServiceImpl implements StudentService{

    @Override
    public void printStudentDetails(StudentDto studentDto) {
        System.out.println("studentName: "+studentDto.getStudentName());
        System.out.println("student Course: "+studentDto.getCourse());
        System.out.println("student email: "+studentDto.getEmail());

    }

    @Override
    public boolean save(StudentDto studentDto) {
        return false;
    }
}
