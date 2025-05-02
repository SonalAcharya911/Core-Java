package com.xworkz.tom;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/serv", loadOnStartup = 1)
public class MyServlet extends GenericServlet {

    public MyServlet(){
        System.out.println("no arg const of MyServlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in MyServlet");
    }
}
