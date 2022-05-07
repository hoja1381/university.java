package com.hoja.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection
                ("jdbc:oracle:thin:@localhost:1521:xe","hoja","hj123456hj");
        connection.setAutoCommit(false);
    }
public void Insert(UserEnti userEnti) throws Exception {
        preparedStatement = connection.prepareStatement("insert into USERS (username,pass,name,email) values (?,?,?,?)");
        preparedStatement.setString(1,userEnti.getUserName());
        preparedStatement.setString(2,userEnti.getPass());
        preparedStatement.setString(3,userEnti.getName());
        preparedStatement.setString(4,userEnti.getEmail());
        preparedStatement.executeUpdate();

}
    public List<UserEnti> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT username , pass FROM USERS ");
                ResultSet resultSet=preparedStatement.executeQuery ();
        List<UserEnti> userEntiList=new ArrayList<>();
        while (resultSet.next ()){
           UserEnti userEnti=new UserEnti();
            userEnti.setUserName(resultSet.getString ("username"));
            userEnti.setPass(resultSet.getString("pass"));
            userEntiList.add (userEnti);
        }
        return userEntiList;
    }

    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
    public void commit() throws Exception{
        connection.commit ();
    }
}

