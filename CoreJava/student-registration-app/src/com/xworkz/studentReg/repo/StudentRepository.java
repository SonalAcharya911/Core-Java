package com.xworkz.studentReg.repo;

import com.xworkz.studentReg.dto.StudentDto;

public interface StudentRepository {
    void saveStudent(StudentDto studentDto);
}
