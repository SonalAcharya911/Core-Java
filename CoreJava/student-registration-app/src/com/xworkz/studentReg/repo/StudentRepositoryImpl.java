package com.xworkz.studentReg.repo;

import com.xworkz.studentReg.dto.StudentDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
}
