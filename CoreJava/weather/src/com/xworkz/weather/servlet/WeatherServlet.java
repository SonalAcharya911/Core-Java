package com.xworkz.weather.servlet;

import com.xworkz.weather.dto.WeatherDto;
import com.xworkz.weather.service.WeatherService;
import com.xworkz.weather.service.WeatherServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

@WebServlet(urlPatterns = "/weather")
public class WeatherServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String placeName=req.getParameter("place");
        String weather=req.getParameter("weather");
        String minTemp=req.getParameter("minTemp");
        String maxTemp=req.getParameter("maxTemp");
        String cloudy=req.getParameter("cloudy");
        String raining=req.getParameter("raining");
        String rainAmount=req.getParameter("rainAmount");
        String humidity=req.getParameter("humidity");
        String windSpeed=req.getParameter("windSpeed");
        String sunriseTime=req.getParameter("sunriseTime");
        String sunsetTime=req.getParameter("sunsetTime");
        String moonriseTime=req.getParameter("moonriseTime");
        String moonsetTime=req.getParameter("moonsetTime");
        String rainStartTime=req.getParameter("rainStartTime");
        String rainEndTime=req.getParameter("rainEndTime");
        String precipitation=req.getParameter("precipitation");
        LocalDateTime createdDate= LocalDateTime.now();

        WeatherDto weatherDto=new WeatherDto(placeName,weather,Integer.parseInt(minTemp),Integer.parseInt(maxTemp),cloudy,raining,Integer.parseInt(rainAmount),Integer.parseInt(humidity), Integer.parseInt(windSpeed),LocalTime.parse(sunriseTime),LocalTime.parse(sunsetTime),LocalTime.parse(moonriseTime),LocalTime.parse(moonsetTime),LocalTime.parse(rainStartTime),LocalTime.parse(rainEndTime),precipitation,createdDate);



        WeatherService weatherService=new WeatherServiceImpl();

        boolean valid=weatherService.validate(weatherDto);

        resp.sendRedirect("WeatherSuccess.jsp");

//        if(valid){
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("WeatherSuccess.jsp");
//            requestDispatcher.forward(req,resp);
////            resp.sendRedirect("Weather.jsp");
//        }
//        else{
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Weather.jsp");
//            req.setAttribute("message", "Saving of Weather details Failed");
//            requestDispatcher.forward(req,resp);
//        }
    }
}
