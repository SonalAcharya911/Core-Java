package com.xworkz.studentReg.repo;

import com.xworkz.studentReg.dto.StudentDto;

import java.util.Optional;

public interface StudentRepository {
    void saveStudent(StudentDto studentDto);

    Optional<StudentDto> findById(int id);

}
