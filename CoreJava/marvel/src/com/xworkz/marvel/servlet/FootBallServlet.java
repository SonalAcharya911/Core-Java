package com.xworkz.marvel.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/football",loadOnStartup = 1)
public class FootBallServlet extends GenericServlet {

    public FootBallServlet(){
        System.out.println("FootBallServlet created by tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in FootBallServlet");
    }
}
