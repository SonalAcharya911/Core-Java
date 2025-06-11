package com.xworkz.rcbStampedeCase.servlet;

import com.xworkz.rcbStampedeCase.dto.StampedeCaseDto;
import com.xworkz.rcbStampedeCase.service.StampedeCaseService;
import com.xworkz.rcbStampedeCase.service.StampedeCaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/case")
public class StampedeCaseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost in StampedeCaseServlet");
        String event=req.getParameter("event");
        String location=req.getParameter("location");
        String deaths=req.getParameter("deaths");
        String injuries=req.getParameter("injuries");

        StampedeCaseDto stampedeCaseDto=new StampedeCaseDto(event,location,Integer.parseInt(deaths),Integer.parseInt(injuries));

        StampedeCaseService stampedeCaseService=new StampedeCaseServiceImpl();
        String result=stampedeCaseService.save(stampedeCaseDto);

        System.out.println("result : "+result);
    }
}
