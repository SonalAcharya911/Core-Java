package com.xworkz.docAppointmentServlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/getAppointment")
public class DoctorAppointmentServlet extends GenericServlet {

    public DoctorAppointmentServlet(){
        System.out.println("DoctorAppointmentServlet created by tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in DoctorAppointmentServlet");
    }
}
