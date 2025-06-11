package com.xworkz.rcbStampedeCase.repository;

import com.xworkz.rcbStampedeCase.dto.StampedeCaseDto;
import com.xworkz.rcbStampedeCase.service.StampedeCaseService;

import java.sql.*;

public class StampedeCaseRepositoryImpl implements StampedeCaseRepository {
    @Override
    public boolean persist(StampedeCaseDto stampedeCaseDto) {
        System.out.println("running persist in StampedeCaseRepositoryImpl");
        if(stampedeCaseDto!=null){
            System.out.println("dto in persist is not null");
            String url="jdbc:mysql://localhost:3306/stampede";
            String username="root";
            String password="Sonal@7715";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection= DriverManager.getConnection(url,username,password);
                //String sql="insert into rcb_stampede_case values(0,'"+stampedeCaseDto.getEvent()+"','"+stampedeCaseDto.getLocation()+"',"+stampedeCaseDto.getDeaths()+","+stampedeCaseDto.getInjuries()+")";
                String sql1="INSERT INTO stampede_case(event,location,deaths,injuries) VALUES ('"+stampedeCaseDto.getEvent()+"','"+stampedeCaseDto.getLocation()+"',"+stampedeCaseDto.getDeaths()+","+stampedeCaseDto.getInjuries()+")";
                System.out.println(sql1);
                PreparedStatement preparedStatement = connection.prepareStatement(sql1);
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Rows inserted: " + rowsAffected);

//                Statement statement=connection.createStatement();
//                statement.executeUpdate(sql1);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
        return false;
    }
}
