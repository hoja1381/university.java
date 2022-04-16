package com.hoja;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection =
                    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
                    ,"hoja" , "hj123456hj");


            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into userInfo (id,Name,Pass,UserName,Email) values (?,?,?,?,?)");
            Scanner scanner = new Scanner(System.in);
            connection.setAutoCommit(false);
            String c = null;

            do  {
            System.out.println("enter id,Name,Pass,UserName,Email : ");
            preparedStatement.setInt(1, scanner.nextInt());
            preparedStatement.setString(2, scanner.nextLine());
            preparedStatement.setString(3, scanner.nextLine());
            preparedStatement.setString(4, scanner.nextLine());
            preparedStatement.setString(5, scanner.nextLine());

            System.out.println("if you want to enter a new user enter '+': ");
            c = scanner.next();

            preparedStatement.executeUpdate();
        } while (c == "+");
            connection.commit();

        PreparedStatement preparedStatement1 =
                connection.prepareStatement("select UserName,Pass from userInfo where UserName = ? ");
        preparedStatement1.setString(1,scanner.nextLine());
        ResultSet resultSet = preparedStatement1.executeQuery();
        while (resultSet.next()){
            System.out.println("Username : "+ resultSet.getString("UserName"));
            System.out.println("Pass : "+ resultSet.getString("Pass"));
            connection.commit();

            preparedStatement.close();
            preparedStatement1.close();
            connection.close();

        }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
