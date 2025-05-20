package com.xworkz.donation.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class DonationAppServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String cause=servletRequest.getParameter("cause");
        String amount=servletRequest.getParameter("amount");
        String email=servletRequest.getParameter("email");

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<h1> Donation details collected successfully..</h1>");
        writer.println("<h3> Donation details: ");
        writer.println("Donor Name: "+name+"<br>");
        writer.println("Cause: "+cause+"<br>");
        writer.println("Amount: "+amount+"<br>");
        writer.println("Email: "+email+"<br>"+"</h1>");
    }
}


