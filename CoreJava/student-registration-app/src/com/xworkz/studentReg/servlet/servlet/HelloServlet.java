package com.xworkz.studentReg.servlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Welcome to Servlets");

        PrintWriter writer=resp.getWriter();
        writer.println("Welcome to Servlets");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentName=req.getParameter("studentName");
        System.out.println(studentName);

        PrintWriter writer=resp.getWriter();
        writer.println(studentName);
    }
}
