package com.xworkz.birthday.servlet;

import com.xworkz.birthday.dto.BirthdayPartyDto;
import com.xworkz.birthday.service.BirthdayPartyService;
import com.xworkz.birthday.service.BirthdayPartyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@WebServlet(urlPatterns = "/saveGuest")
public class BirthdayPartyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost in BirthdayPartyServlet");
        String guestName=req.getParameter("guestName");
        String phone=req.getParameter("contactNumber");
        String email=req.getParameter("email");
        String rsvpStatus=req.getParameter("rsvpStatus");
        String numOfAttendees=req.getParameter("attendees");
        String foodPref=req.getParameter("foodPreference");
        String specialRequests=req.getParameter("specialRequests");

        if(phone!=null && numOfAttendees!=null){
            long contactNumber=Long.parseLong(phone);
            int numberOfAttendees=Integer.parseInt(numOfAttendees);

            BirthdayPartyDto birthdayPartyDto=new BirthdayPartyDto(0,guestName,contactNumber,email,rsvpStatus,numberOfAttendees,foodPref,specialRequests, LocalDate.now(), LocalTime.now());

            BirthdayPartyService birthdayPartyService=new BirthdayPartyServiceImpl();

            if(birthdayPartyService.validate(birthdayPartyDto)==true){
                req.setAttribute("result","saved Successfully");
                System.out.println("data saved successfully");
            }
            else{
                System.out.println("data not saved");
                req.setAttribute("result","couldn't save guest data");
                req.setAttribute("dto",birthdayPartyDto);
            }

            RequestDispatcher requestDispatcher=req.getRequestDispatcher("BirthdayForm.jsp");
            requestDispatcher.forward(req,resp);

            System.out.println("data is finally saved .....");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doGet in BirthdayPartyServlet");

        BirthdayPartyService birthdayPartyService=new BirthdayPartyServiceImpl();
        birthdayPartyService.findAll();

        if(birthdayPartyService.findAll().isPresent()){
            System.out.println("found all in service...");
        }

        String guestId=req.getParameter("guestId");
        int id=0;
        if(guestId!=null) id=Integer.parseInt(guestId);

        if(birthdayPartyService.findById(id).isPresent()){
            Optional<BirthdayPartyDto> optionalBirthdayPartyDto=birthdayPartyService.findById(id);
            req.setAttribute("returningID",optionalBirthdayPartyDto);
        }

    }
}
