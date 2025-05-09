package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/convert")
public class UnitConverterServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String fromUnit=servletRequest.getParameter("fromUnit");
        String toUnit=servletRequest.getParameter("toUnit");
        double value=Integer.parseInt(servletRequest.getParameter("value"));
        double res=convertUnit(fromUnit,toUnit,value);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<h1> Value converted succesfully</h1>");
        writer.println(value+" "+fromUnit+"="+" "+res+" "+toUnit);

    }

    public static double convertUnit(String fromUnit ,String toUnit, double value){
        double result=0;

        if(toUnit.equals("kilometer")){
            return result=(value*1000);
        }
        else if (toUnit=="centimeter") {
            return result=(value/100);
        }
        else {
            return result;
        }

//        switch (toUnit){
//            case "kilometers": return result=(value*1000);
//            case "centimeters": return result=(value/100);
//            default:return result;
//        }
    }
}
