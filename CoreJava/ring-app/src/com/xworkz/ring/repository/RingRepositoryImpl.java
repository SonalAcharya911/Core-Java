package com.xworkz.ring.repository;

import com.xworkz.ring.constant.DBProperties;
import com.xworkz.ring.dto.RingDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

public class RingRepositoryImpl implements RingRepository {
    @SneakyThrows
    @Override
    public boolean persist(RingDto ringDto) {
        System.out.println("running persist in RingRepositoryImpl");
        if (ringDto != null) {
            System.out.println("dto is not null....should save into repo");


            try {
                Class.forName(DBProperties.DRIVER.getProp());

                Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
//                String sql = "INSERT INTO ring_data(material,weight,size,price,purchase_date,have_stones,custom_made) VALUES ('" + ringDto.getMaterial()
//                        + "'," + ringDto.getWeight() + "," + ringDto.getSize() + "," + ringDto.getPrice() + ",'" + ringDto.getPurchaseDate() + "'," + ringDto.isHaveStones() + "," + ringDto.isCustomMade() + ");";
//
//                String query = "INSERT into ring_data VALUES(material,weight,size,price,purchase_date,have_stones,custom_made,created_by,created_time)";
//                Statement statement = connection.createStatement();
//                int row = statement.executeUpdate(sql);

                String query = "INSERT into ring_data(material,weight,size,price,purchase_date,have_stones,custom_made,created_by,created_time) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                preparedStatement.setString(1, ringDto.getMaterial());
                preparedStatement.setDouble(2, ringDto.getWeight());
                preparedStatement.setInt(3, ringDto.getSize());
                preparedStatement.setDouble(4, ringDto.getPrice());
                preparedStatement.setDate(5,Date.valueOf(ringDto.getPurchaseDate()));
                preparedStatement.setBoolean(6, ringDto.isHaveStones());
                preparedStatement.setBoolean(7, ringDto.isCustomMade());
                preparedStatement.setString(8, ringDto.getCreatedBy());
                preparedStatement.setTimestamp(9,ringDto.getCreatedTime());

                int rows=preparedStatement.executeUpdate();

                System.out.println("statement executed........rows affected: " + rows);

                if(rows>0){
                    return true;
                }
            }
            catch (SQLException|ClassNotFoundException e) {
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
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());

            String findByIdSql = "SELECT * FROM ring_data r WHERE r.id=" + id + ";";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(findByIdSql);
            System.out.println("resultSet: " + resultSet);

            while (resultSet.next()) {
                int pk = resultSet.getInt("id");
                String material = resultSet.getString("material");
                double weight = resultSet.getDouble("weight");
                int size = resultSet.getInt("size");
                double price = resultSet.getDouble("price");
                LocalDate purchaseDate = resultSet.getDate("purchase_date").toLocalDate();
                boolean haveStones = resultSet.getBoolean("have_stones");
                boolean customMade = resultSet.getBoolean("custom_made");


                RingDto ringDto = new RingDto(material, weight, size, price, purchaseDate, haveStones, customMade, "", Timestamp.valueOf(LocalDateTime.now()));
                return Optional.of(ringDto);
            }


        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return Optional.empty();
    }


}

