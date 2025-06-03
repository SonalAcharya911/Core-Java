package servlet;

import exceptions.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("name");
        String password=req.getParameter("password");
        String email=req.getParameter("email");
        String phone=req.getParameter("contact");
//        long contact=0;
//        if(phone!=null){
//            contact=Long.parseLong(phone);
//        }
        String aadharNo=req.getParameter("aadhar");
//        long aadhar=0;
//        if(aadharNo!=null){
//            aadhar=Long.parseLong(aadharNo);
//        }
        String address=req.getParameter("address");
        String country=req.getParameter("country");

        System.out.println("inputs taken Successfully");
//
//        if(userName.charAt(0)==1){
//
//        }
//        else{
//            System.out.println("valid Username");
//        }
        if(userName.length()<3){
            throw new UserNameLengthException("Name length should be greater than or equal to 3");

        }else {
            System.out.println("valid userName");
        }

        if(password.length()<8 || password.length()>16){
            throw new PasswordLengthException("password length should be greater than 8 and less than 16");
        }else{
            System.out.println("valid password");
        }

        if(phone.length()!=10){
            throw new ContactLengthexception("phone number should be exactly 10 digits");

        }else{
            System.out.println("valid phone number");
        }

        if(aadharNo.length()!=12){
            throw new AadharlengthException("Aadhar number length should be exactly 12 digits");
        }else {
            System.out.println("valid aadhar");
        }

        if(address==null){
            throw new NullAddressException("address should not be null");
        }
        else{
            System.out.println("valid address");
        }

        if(!country.equals("India")){
            throw new CountryException("country should be India");
        }
        else{
            System.out.println("valid country");
        }


    }
}
