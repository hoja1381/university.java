package com.hoja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection connection =
                        DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
                                , "hoja", "hj123456hj");


                PreparedStatement preparedStatement =
                        connection.prepareStatement("insert into Student (id PRIMARY key ,Name,enteryYear,avrage) values (?,?,?,?)");
                Scanner scanner = new Scanner(System.in);
                connection.setAutoCommit(false);
                String c = null;
                do  {
                    System.out.println(" enter id,Name,enteryYear,avrage: ");
                    preparedStatement.setInt(1, scanner.nextInt());
                    preparedStatement.setString(2, scanner.nextLine());
                    preparedStatement.setString(3, scanner.nextLine());
                    preparedStatement.setDouble(4, scanner.nextDouble());

                    System.out.println("if you want to enter a new user enter '+': ");
                    c = scanner.next();

                    preparedStatement.executeUpdate();
                    connection.commit();
                } while (c == "+");
                preparedStatement.close();

                PreparedStatement preparedStatement1 =
                        connection.prepareStatement("update Student where id=?");
                System.out.println("if you want to delete a user enter 1 . ");
                int num = scanner.nextInt();
                while (num==1) {
                    preparedStatement1.setInt(1, scanner.nextInt());
                    System.out.println("updated inside DB:" + preparedStatement1.executeUpdate());

                    System.out.println("if you want to update a user enter 1 . ");
                    num = scanner.nextInt();
                    connection.commit();
                }
                preparedStatement1.close();

                PreparedStatement preparedStatement2 =
                        connection.prepareStatement("delete from Student where id=?");
                System.out.println("if you want to delete a user enter 1 . ");
                int num1 = scanner.nextInt();
                while (num1 ==1) {
                    preparedStatement1.setInt(1, scanner.nextInt());
                    System.out.println("deleted from DB:" + preparedStatement1.executeUpdate());

                    System.out.println("if you want to delete a user enter 1 . ");
                    num1 = scanner.nextInt();
                    connection.commit();
                }
                preparedStatement2.close();
                connection.commit();
                connection.close();




            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }
}
