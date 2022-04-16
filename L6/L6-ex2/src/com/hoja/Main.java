package com.hoja;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection =
                    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
                            , "hoja", "hj123456hj");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into Users (id primary key ,UserName,nationalCode,FatherName,Role,Curency,History) values (?,?,?,?,?,?,?)");
            Scanner scanner = new Scanner(System.in);
            connection.setAutoCommit(false);

            String c = null;
            do {
                preparedStatement.setInt(1, scanner.nextInt());
                preparedStatement.setString(2, scanner.nextLine());
                preparedStatement.setString(3, scanner.nextLine());
                preparedStatement.setString(4, scanner.nextLine());
                preparedStatement.setString(5, scanner.nextLine());
                preparedStatement.setString(6, scanner.nextLine());
                preparedStatement.setString(7, scanner.nextLine());

                System.out.println("if you want to enter a new user enter '+': ");
                c = scanner.next();
                connection.commit();
            }while (c == "+");
            preparedStatement.close();

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("delete from Users where id=?");
            System.out.println("if you want to delete a user enter 1 . ");
            int num = scanner.nextInt();
            while (num==1) {
                preparedStatement1.setInt(1, scanner.nextInt());
                System.out.println("deleted from DB:" + preparedStatement1.executeUpdate());

                System.out.println("if you want to delete a user enter 1 . ");
                num = scanner.nextInt();
                connection.commit();
            }
            preparedStatement1.close();
            connection.commit();
            connection.close();

            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


