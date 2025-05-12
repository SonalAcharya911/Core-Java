package com.xworkz.docAppointmentServlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/getAppointment")
public class DoctorAppointmentServlet extends GenericServlet {

    public DoctorAppointmentServlet(){
        System.out.println("DoctorAppointmentServlet created by tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in DoctorAppointmentServlet");
        String firstName= servletRequest.getParameter("firstname");
        String lastName=servletRequest.getParameter("lastname");
        String email=servletRequest.getParameter("email");

        String phone=servletRequest.getParameter("");
        long phNum=0;
        if (phone != null && phone!="") {
            phNum=Long.parseLong(phone);
        }

        String patientAge=servletRequest.getParameter("age");
        int age=0;
        if (patientAge != null && patientAge!="") {
            age= Integer.parseInt(patientAge);
        }

        String address=servletRequest.getParameter("address");
        String gender=servletRequest.getParameter("gender");
        String dept=servletRequest.getParameter("department");
        String prefDoc=servletRequest.getParameter("doctor");
        String date=servletRequest.getParameter("date");
        String time=servletRequest.getParameter("time");
        String reason=servletRequest.getParameter("reason");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(phNum);
        System.out.println(age);
        System.out.println(address);
        System.out.println(gender);
        System.out.println(dept);
        System.out.println(prefDoc);
        System.out.println(date);
        System.out.println(time);
        System.out.println(reason);

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();

        writer.println("<h1>Appointment details collected successfully</h1>");
        writer.println("firstname: "+firstName+"<br>");
        writer.println("lastName: "+lastName+"<br>");
        writer.println("email: "+email+"<br>");
        writer.println("Phone number: "+phNum+"<br>");
        writer.println("Age: "+age+"<br>");
        writer.println("Address: "+address+"<br>");
        writer.println("Gender: "+gender+"<br>");
        writer.println("Department: "+dept+"<br>");
        writer.println("Preferred doctor"+prefDoc+"<br>");
        writer.println("Date: "+date+"<br>");
        writer.println("Time: "+time+"<br>");
        writer.println("Reason: "+reason+"<br>");


    }
}
