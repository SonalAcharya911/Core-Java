package com.xworkz.marvel.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/action",loadOnStartup = 2)
public class ActionServlet extends GenericServlet {

    public ActionServlet(){
        System.out.println("ActionServlet created by tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in ActionServlet");
    }
}
