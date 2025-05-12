package com.xworkz.docAppointmentServlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/getContact", loadOnStartup = 1)
public class ContactServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String fname = servletRequest.getParameter("firstname");
        String lname = servletRequest.getParameter("lastname");
        String email = servletRequest.getParameter("email");
        String message = servletRequest.getParameter("sickness");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        writer.println("<h1>Contact collected successfully</h1>");
        writer.println("firstname: "+fname);
        writer.println("lastName: "+lname);
        writer.println("email: "+email);
        writer.println("Reason: "+message);


    }
}
