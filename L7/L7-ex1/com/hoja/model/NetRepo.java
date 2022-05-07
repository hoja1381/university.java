package com.hoja.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NetRepo {
        private Connection connection;
        private PreparedStatement preparedStatement;
        private ResultSet resultSet;

        public NetRepo() throws Exception {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE","hoja","hj123456hj");
        }
        public void insert (NetEnt netEnt) throws Exception {
            preparedStatement = connection.prepareStatement("insert into PERSON values(?,?,?,?)");
            preparedStatement.setString(1,netEnt.getUsername());
            preparedStatement.setString(2,netEnt.getPass());
            preparedStatement.setDouble(3,netEnt.getNet());
            preparedStatement.setLong(4,netEnt.getMoney());
            preparedStatement.executeQuery();
        }
        public void  update (NetEnt netEnt) throws Exception {
            preparedStatement = connection.prepareStatement(
                    "update PERSON set NET=? , MONEY=? where USERNAME=?");
            preparedStatement.setDouble(1,netEnt.getNet());
            preparedStatement.setLong(2,netEnt.getMoney());
            preparedStatement.setString(3,netEnt.getUsername());
            preparedStatement.executeUpdate();
        }

        public List<String> select (NetEnt netEnt) throws Exception {
            preparedStatement = connection.prepareStatement(
                    "select USERNAME,PASS,NET,MONEY from PERSON where USERNAME =?");
            preparedStatement.setString(1,netEnt.getUsername());
            List <String> list = new ArrayList<String>();
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(resultSet.getString("USERNAME"));
                list.add(resultSet.getString("Pass"));
                list.add(resultSet.getString("NET"));
                list.add(resultSet.getString("MONEY"));
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
