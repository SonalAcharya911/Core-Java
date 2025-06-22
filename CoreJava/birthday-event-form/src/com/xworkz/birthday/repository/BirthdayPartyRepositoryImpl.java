package com.xworkz.birthday.repository;

import com.xworkz.birthday.dto.BirthdayPartyDto;
import com.xworkz.birthday.utils.JdbcUtils;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class BirthdayPartyRepositoryImpl implements BirthdayPartyRepository{
    @Override
    public boolean persist(BirthdayPartyDto birthdayPartyDto) {
        System.out.println("running persist in BirthdayPartyRepositoryImpl");
        if(birthdayPartyDto!=null){
            System.out.println("dto in persist is not null");
            try{
                Class.forName(JdbcUtils.DRIVER);
                String insertQuery="INSERT into birthday_guest_details values(?,?,?,?,?,?,?,?,?,?)";
                try(Connection connection= DriverManager.getConnection(JdbcUtils.URL,JdbcUtils.USERNAME,JdbcUtils.PASSWORD);
                    PreparedStatement preparedStatement=connection.prepareStatement(insertQuery)){
                    preparedStatement.setInt(1,0);
                    preparedStatement.setString(2,birthdayPartyDto.getGuestName());
                    preparedStatement.setLong(3, birthdayPartyDto.getContactNumber());
                    preparedStatement.setString(4, birthdayPartyDto.getEmail());
                    preparedStatement.setString(5, birthdayPartyDto.getRsvpStatus());
                    preparedStatement.setInt(6, birthdayPartyDto.getNumberOfAttendees());
                    preparedStatement.setString(7, birthdayPartyDto.getFoodPreference());
                    preparedStatement.setString(8, birthdayPartyDto.getSpecialRequests());
                    preparedStatement.setDate(9,Date.valueOf(birthdayPartyDto.getCreatedDate()));
                    preparedStatement.setTime(10,Time.valueOf(birthdayPartyDto.getCreatedTime()));

                    int rows=preparedStatement.executeUpdate();
                    System.out.println("rows affected: "+rows);
                }
                catch(SQLException e){
                    System.out.println(e.getMessage());
                }
            }
            catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }


            return true;
        }
        else{
            System.out.println("dto in persist is null");
        }
        return false;
    }

    @SneakyThrows
    @Override
    public Optional<BirthdayPartyDto[]> findAll() {

        System.out.println("running findAll in BirthdayPartyRepositoryImpl");
        Class.forName(JdbcUtils.DRIVER);
        String fetchAll ="select * from birthday_guest_details";

        int index=0;
        int arraySize=1;

        try(Connection connection = DriverManager.getConnection(JdbcUtils.URL, JdbcUtils.USERNAME, JdbcUtils.PASSWORD);
            PreparedStatement statement = connection.prepareStatement(fetchAll);) {
            BirthdayPartyDto[] birthdayPartyDtos=new BirthdayPartyDto[arraySize];
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){

                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getLong(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString(5));
                System.out.println(resultSet.getInt(6));
                System.out.println(resultSet.getString(7));
                System.out.println(resultSet.getString(8));
                System.out.println(resultSet.getDate(9));
                System.out.println(resultSet.getTime(10));

                System.out.println("===============");

                BirthdayPartyDto birthdayPartyDto=new BirthdayPartyDto();
                birthdayPartyDto.setGuestId(resultSet.getInt(1));
                birthdayPartyDto.setGuestName(resultSet.getString(2));
                birthdayPartyDto.setContactNumber(resultSet.getLong(3));
                birthdayPartyDto.setEmail(resultSet.getString(4));
                birthdayPartyDto.setRsvpStatus(resultSet.getString(5));
                birthdayPartyDto.setNumberOfAttendees(resultSet.getInt(6));
                birthdayPartyDto.setFoodPreference(resultSet.getString(7));
                birthdayPartyDto.setSpecialRequests(resultSet.getString(8));
                birthdayPartyDto.setCreatedDate(resultSet.getDate(9).toLocalDate());
                birthdayPartyDto.setCreatedTime(resultSet.getTime(10).toLocalTime());

                birthdayPartyDtos[index]=birthdayPartyDto;
                arraySize++;
                index++;


            }
            return java.util.Optional.of(birthdayPartyDtos);

        }catch (SQLException e){
            e.printStackTrace();
        }

        return java.util.Optional.empty();
    }

    @Override
    public Optional<BirthdayPartyDto> findByID(int id) {
        BirthdayPartyDto birthdayPartyDto=new BirthdayPartyDto();
        String findByIdQuery="SELECT * FROM birthday_guest_details b where b.id=?";
        try{
            Class.forName(JdbcUtils.DRIVER);
            try(Connection connection=DriverManager.getConnection(JdbcUtils.URL,JdbcUtils.USERNAME,JdbcUtils.PASSWORD);
            PreparedStatement preparedStatement=connection.prepareStatement(findByIdQuery))
            {
                preparedStatement.setInt(1,id);

                ResultSet resultSet=preparedStatement.executeQuery();
                birthdayPartyDto.setGuestId(resultSet.getInt(1));
                birthdayPartyDto.setGuestName(resultSet.getString(2));
                birthdayPartyDto.setContactNumber(resultSet.getLong(3));
                birthdayPartyDto.setEmail(resultSet.getString(4));
                birthdayPartyDto.setRsvpStatus(resultSet.getString(5));
                birthdayPartyDto.setNumberOfAttendees(resultSet.getInt(6));
                birthdayPartyDto.setFoodPreference(resultSet.getString(7));
                birthdayPartyDto.setSpecialRequests(resultSet.getString(8));
                birthdayPartyDto.setCreatedDate(resultSet.getDate(9).toLocalDate());
                birthdayPartyDto.setCreatedTime(resultSet.getTime(10).toLocalTime());

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("");
        return java.util.Optional.of(birthdayPartyDto);

    }
}
