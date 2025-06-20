package com.xworkz.studentReg.service;

import com.xworkz.studentReg.dto.StudentDto;

public interface StudentService {
    void printStudentDetails(StudentDto studentDto);

    boolean save(StudentDto studentDto);
}
