package com.xworkz.monsoon.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getFeedback")
public class FeedbackServlet extends HttpServlet {
    public FeedbackServlet(){
        System.out.println("FeedbackServlet created....");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter("name");
        String userAge=req.getParameter("age");
        String feedback=req.getParameter("feedback");
        String subject=req.getParameter("subject");
        int age=0;
        if(userAge!=null){
            age=Integer.parseInt(userAge);
        }


    }
}
