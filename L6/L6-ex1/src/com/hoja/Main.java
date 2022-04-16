package com.hoja;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection =
                    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
                            , "hoja", "hj123456hj");


            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into Users (id primary key ,UserName,Email,Pass,Age,Education) values (?,?,?,?,?,?)");
            Scanner scanner = new Scanner(System.in);
            connection.setAutoCommit(false);

            String c = null;
            do  {
                System.out.println("enter id,Name,Pass,UserName,Email : ");
                getter(preparedStatement, scanner);

                System.out.println("if you want to enter a new user enter '+': ");
                c = scanner.next();

                preparedStatement.executeUpdate();
            } while (c == "+");
            connection.commit();
            preparedStatement.close();

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("update Users (UserName,Email,Pass,Age,Education) values (?,?,?,?,?) where  id=? ");
            getter(preparedStatement, scanner);
            connection.commit();
            preparedStatement1.close();
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getter(PreparedStatement preparedStatement, Scanner scanner) throws SQLException {
        preparedStatement.setInt(1,scanner.nextInt());
        preparedStatement.setString(2, scanner.nextLine());
        preparedStatement.setString(3, scanner.nextLine());
        preparedStatement.setString(4, scanner.nextLine());
        preparedStatement.setInt(5, scanner.nextInt());
        preparedStatement.setString(6,scanner.nextLine());
    }
}
