package com.xworkz.mappy.runner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/quiz")
public class QuizServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String correct1="A";
        String correct2="B";
        String correct3="C";

        String ans1=req.getParameter("ans1");
        String ans2=req.getParameter("ans2");
        String ans3=req.getParameter("ans3");


        int count=0;

        if(ans1.equals(correct1)){
            System.out.println(" 1 is correct");
            count++;
        }
        if(ans2.equals(correct2)){
            System.out.println(" 1 is correct");
            count++;
        }
        if(ans3.equals(correct3)){
            System.out.println(" 1 is correct");
            count++;
        }

        System.out.println(count);
        req.setAttribute("answer1","A");
        req.setAttribute("answer2","B");
        req.setAttribute("answer3","C");
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req,resp);






    }
}
