package com.hoja.control;

import com.hoja.model.UserEnti;
import com.hoja.model.UserServ;
import java.sql.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your information : (NAME-EMAIL-USERNAME-PASSWORD)");
            UserServ.getInstance().write(
                    new UserEnti().setName(scanner.nextLine()).setEmail(scanner.nextLine())
                            .setUserName(scanner.nextLine()).setPass(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println ("Fail to save!"+e.getMessage ());
        }
       try {
           System.out.println(UserServ.getInstance().report());
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
