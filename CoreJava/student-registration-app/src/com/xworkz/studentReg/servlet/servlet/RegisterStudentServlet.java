package com.xworkz.studentReg.servlet.servlet;


import com.xworkz.studentReg.dto.StudentDto;
import com.xworkz.studentReg.service.StudentService;
import com.xworkz.studentReg.service.StudentServiceImpl;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterStudentServlet extends HttpServlet {

    public RegisterStudentServlet(){
        System.out.println("RegisterStudentServlet created by tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentName=req.getParameter("name");
        String studentEmail=req.getParameter("email");
        String studentCourse=req.getParameter("course");

        StudentDto studentDto=new StudentDto();
        studentDto.setEmail(studentEmail);
        studentDto.setCourse(studentCourse);
        studentDto.setStudentName(studentName);

        StudentService studentService=new StudentServiceImpl();
        studentService.save(studentDto);


    }
}
