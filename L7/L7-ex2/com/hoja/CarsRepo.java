package com.hoja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarsRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public CarsRepo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE","hoja","hj123456hj");
    }
    public void  update (CarUserEnt carUserEnt,CarsEnt carsEnt) throws Exception {
        preparedStatement = connection.prepareStatement(
                "update CARSUSERS set CAR=?,MONEY=? where USERNAME=?");
        preparedStatement.setInt(1,carsEnt.getId());
        preparedStatement.setLong(2,carsEnt.getPrice());
        preparedStatement.setString(3,carUserEnt.getUsername());
        preparedStatement.executeUpdate();
    }
    public List<String> selectCARUSERS (CarUserEnt carUserEnt,CarsEnt carsEnt) throws Exception {
        preparedStatement = connection.prepareStatement(
                "select * from CARSUSERS where USERNAME =?");
        preparedStatement.setString(1,carUserEnt.getUsername());
        List <String> list = new ArrayList<String>();
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            list.add(resultSet.getString("CARUSER_ID"));
            list.add(resultSet.getString("USERNAME"));
            list.add(resultSet.getString("PASS"));
            list.add(resultSet.getString("MONEY"));
            list.add(resultSet.getString("CAR"));
        }

        return list;
    }

    public List<String> selectCAR (CarUserEnt carUserEnt,CarsEnt carsEnt) throws Exception {
        preparedStatement = connection.prepareStatement(
                "select * from CARS where CAR_ID =?");
        preparedStatement.setInt(1,carsEnt.getId());
        List <String> list = new ArrayList<String>();
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            list.add(resultSet.getString("CAR_ID"));
            list.add(resultSet.getString("CAR_NAME"));
            list.add(resultSet.getString("PRODUCTION_YEAR"));
            list.add(resultSet.getString("PRICE"));
        }
        return list;
    }

    public void commit () throws Exception {
        connection.commit();
    }
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }

}
