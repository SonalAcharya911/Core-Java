package com.xworkz.adharCheck;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/check")
public class AadharCheckServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in AadharCheckServlet");
        String aadhar=servletRequest.getParameter("aadhar");
        servletResponse.setContentType("text/html");
        PrintWriter write=servletResponse.getWriter();
        if(checkNumber(aadhar)){
            write.println("Aadhar Number "+aadhar+ " is valid");
        }
        else{
            write.println("Aadhar Number "+aadhar+ " is invalid");
        }


    }

    public static boolean checkNumber(String num){
        if(num.length()==12){
            return true;
        }
        else{
            return false;
        }
    }
}
