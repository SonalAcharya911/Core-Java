package com.xworkz.rcbStampedeCase.repository;

import com.xworkz.rcbStampedeCase.dto.StampedeCaseDto;
import com.xworkz.rcbStampedeCase.service.StampedeCaseService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedeCaseRepositoryImpl implements StampedeCaseRepository {
    @Override
    public boolean persist(StampedeCaseDto stampedeCaseDto) {
        System.out.println("running persist in StampedeCaseRepositoryImpl");
        if(stampedeCaseDto!=null){
            System.out.println("dto in persist is not null");
            String url="jdbc:mysql://localhost:3306/stampede";
            String username="root";
            String password="Sonal@7715";
            //4 steps
            //Step1 : Load the Driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Step 2 : Create the Connection
                Connection connection= DriverManager.getConnection(url,username,password);
                //Step 3 : Prepare the Statement
                String sql="insert into stampede_case values(0,'"+stampedeCaseDto.getEvent()+"','"+stampedeCaseDto.getLocation()+"',"+stampedeCaseDto.getDeaths()+","+stampedeCaseDto.getInjuries()+")";
                Statement statement=connection.createStatement();
                //step 4 : execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
        return false;
    }
}
