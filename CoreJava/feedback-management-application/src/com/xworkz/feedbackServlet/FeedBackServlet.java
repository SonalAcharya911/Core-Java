package com.xworkz.feedbackServlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class FeedBackServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in FeedBackServlet");
        String name=servletRequest.getParameter("userName");
        String email=servletRequest.getParameter("email");
        String contact=servletRequest.getParameter("contact");
        String feedback=servletRequest.getParameter("feedback");

        System.out.println("name: "+name);
        System.out.println("email: "+email);
        System.out.println("contact: "+contact);
        System.out.println("feedback: "+feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();

        writer.println("Thanks for submitting the form");
        System.out.println("this might be printed on the console");
    }
}
