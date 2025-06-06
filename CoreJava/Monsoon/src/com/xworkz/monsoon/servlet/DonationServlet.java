package com.xworkz.monsoon.servlet;

import com.xworkz.monsoon.dto.DonationDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate",loadOnStartup = 1)
public class DonationServlet extends HttpServlet {

    public DonationServlet(){
        System.out.println("DonationServlet created....");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost in DonationServlet");
        String name=req.getParameter("name");
        String cont=req.getParameter("contact");
        long contact=0;
        if(cont!=null || cont!=""){
            contact=Long.parseLong(cont);
        }

        String email=req.getParameter("email");

        String amt=req.getParameter("amount");
        double amount=0;
        if(amt!=null || amt!=""){
            amount=Double.parseDouble(amt);
        }
        String description=req.getParameter("desc");

        DonationDto donationDto=new DonationDto();
        donationDto.setAmount(amount);
        donationDto.setName(name);
        donationDto.setContact(contact);
        donationDto.setEmail(email);
        donationDto.setDescription(description);



    }
}
