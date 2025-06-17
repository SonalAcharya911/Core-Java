package com.xworkz.ring.repository;

import com.xworkz.ring.dto.RingDto;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class RingRepositoryImpl implements RingRepository{
    @SneakyThrows
    @Override
    public boolean persist(RingDto ringDto) {
        System.out.println("running persist in RingRepositoryImpl");
        if(ringDto!=null){
            System.out.println("dto is not null....should save into repo");
            String url="jdbc:mysql://localhost:3306/weather";
            String password="Sonal@7715";
            String username="root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            try(Connection connection= DriverManager.getConnection(url,username,password)){
                String sql="INSERT INTO ring_data(material,weight,size,price,purchase_date,have_stones,custom_made) VALUES ('"+ ringDto.getMaterial()
                        +"',"+ ringDto.getWeight()+","+ ringDto.getSize()+","+ ringDto.getPrice()+",'"+ ringDto.getPurchaseDate()+"',"+ringDto.isHaveStones()+","+ringDto.isCustomMade()+");";
                Statement statement=connection.createStatement();
                int row=statement.executeUpdate(sql);
                System.out.println("statement executed........rows affected: "+row);

            }
            catch(SQLException e){
                System.out.println(e.getMessage());
                return false;
            }

            System.out.println("saving success in repo");

            return true;
        }
        return false;
    }

    @Override
    public Optional<RingDto> findById(int id) {
        System.out.println("running findById in dusterRepositoryImpl...");
        System.out.println("");
        return RingRepository.super.findById(id);
    }
}
