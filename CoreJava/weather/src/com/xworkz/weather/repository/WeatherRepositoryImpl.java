package com.xworkz.weather.repository;

import com.xworkz.weather.dto.WeatherDto;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class WeatherRepositoryImpl implements WeatherRepository{
    @SneakyThrows
    @Override
    public boolean persist(WeatherDto weatherDto) {
        System.out.println("running persist in WeatherRepositoryImpl...");
        if (weatherDto != null) {
            String url="jdbc:mysql://localhost:3306/weather";
            String username="root";
            String password="Sonal@7715";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(url,username,password);

            String sql="INSERT INTO weather_data(place_name,weather_type,min_temp,max_temp,cloudy,raining,rain_in_mm,humidity,wind_speed," +
                    "sunrise_time,sunset_time,moonrise_time,moonset_time,rain_start_time,rain_end_time,precipitation,created_date) VALUES ('"+weatherDto.getPlaceName()+"','"+weatherDto.getWeather()+"'," +
                    weatherDto.getMinTemp()+","+weatherDto.getMaxTemp()+",'"+weatherDto.getCloudy()+"','"+weatherDto.getRaining()+
                    "',"+ weatherDto.getRainAmount()+","+ weatherDto.getHumidity()+","+ weatherDto.getWindSpeed()+",'"+ weatherDto.getSunriseTime()+"','"+ weatherDto.getSunsetTime()+"','"+
                    weatherDto.getMoonriseTime()+"','"+ weatherDto.getMoonsetTime()+"','"+ weatherDto.getRainStartTime()+"','"+ weatherDto.getRainEndTime()+"','"+ weatherDto.getPrecipitation()+"','"+ weatherDto.getCreatedDate()+"');";

            System.out.println(sql);

            Statement statement= connection.createStatement();
            int rowsAffected=statement.executeUpdate(sql);
            System.out.println("rows affected: "+rowsAffected);

            System.out.println("saved successfully");

            return true;
        }
        return false;
    }
}
