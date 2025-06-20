package com.xworkz.studentReg.repo;

import com.xworkz.studentReg.dto.StudentDto;

import java.sql.*;
import java.util.Optional;

public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public void saveStudent(StudentDto studentDto) {
        if(studentDto!=null){
            String userName="root";

            String password="Sample.password@123";

            String url="jdbc:mysql://localhost:3306/student";

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection= DriverManager.getConnection(url,userName,password);
                Statement statement=connection.createStatement();
                String sql1="SELECT * FROM student;";
                int row=statement.executeUpdate(sql1);
                System.out.println("statement executed........rows affected: "+row);
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Student saved");




    }

    @Override
    public Optional<StudentDto> findById(int id) {
        StudentDto studentDto=new StudentDto();
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="example@1234";
        if(id!=0){

            String findByIdQuery="SELECT * FROM student s WHERE s.id=?";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try(Connection connection=DriverManager.getConnection(url,userName,password);
                    PreparedStatement preparedStatement=connection.prepareStatement(findByIdQuery)){
                    preparedStatement.setInt(1,id);

                    ResultSet resultSet=preparedStatement.executeQuery();

                    studentDto.setStudentName(resultSet.getString(2));
                    studentDto.setEmail(resultSet.getString(3));
                    studentDto.setCourse(resultSet.getString(4));
                }
            } catch (ClassNotFoundException|SQLException e) {
                throw new RuntimeException(e);
            }
            return Optional.of(studentDto);
        }
        return Optional.empty();

    }
}
