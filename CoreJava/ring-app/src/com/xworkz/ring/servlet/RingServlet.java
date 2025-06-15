package com.xworkz.ring.servlet;

import com.xworkz.ring.dto.RingDto;
import com.xworkz.ring.service.RingService;
import com.xworkz.ring.service.RingServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/ring")
public class RingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String material=req.getParameter("material");
        String weight=req.getParameter("weight");
        String size=req.getParameter("size");
        String price=req.getParameter("price");
        String purchaseDate=req.getParameter("purchaseDate");
        String haveStones=req.getParameter("haveStones");
        String customMade=req.getParameter("customMade");

        System.out.println("haveStones: "+haveStones+".....customMade: "+customMade);
        RingDto ringDto=new RingDto(material,Long.parseLong(weight),Integer.parseInt(size),Long.parseLong(price), LocalDate.parse(purchaseDate),Boolean.parseBoolean(haveStones),Boolean.parseBoolean(customMade));

        RingService ringService=new RingServiceImpl();
        boolean valid=ringService.save(ringDto);

        if(valid){
            req.setAttribute("success","saved successfully");
        }
        else{
            req.setAttribute("failure","saved successfully");
        }
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("ring.jsp");
        requestDispatcher.forward(req,resp);

    }
}
