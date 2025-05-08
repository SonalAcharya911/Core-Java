package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/book")
public class MovieBookingServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in MovieBookingServlet");

        String name=servletRequest.getParameter("name");

        String contactNumber=servletRequest.getParameter("contact");
        long contact=0L;
        if(contactNumber!=null && contactNumber!=""){
            contact=Long.parseLong(contactNumber);
        }
        String theatreName=servletRequest.getParameter("theatre");
        String movie=servletRequest.getParameter("moviename");

        String numOfTickets=servletRequest.getParameter("numberoftickets");
        int tickets=0;
        if(numOfTickets!=null && numOfTickets!=""){
            tickets=Integer.parseInt(numOfTickets);
        }

        String tprice=servletRequest.getParameter("price");
        int price=0;
        if(tprice!=null && tprice!=""){
            price=Integer.parseInt(tprice);

        }

        long payableAmount=price*tickets;

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();

        writer.println("<h1> Thanks for booking a movie </h1>");
        writer.println("<h2> Your payable Amount is</h2>"+payableAmount);

    }
}
