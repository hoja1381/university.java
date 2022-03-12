package com.hoja;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);

    public String name = "hossein jahandideh";
    public String username = "hoja";
    public String password = "123456";

    public String getName(){
       name = scanner.nextLine();
       return name;
    }
    public String getUsername(){
        username = scanner.nextLine();
        return username;
    }
    public String getPassword(){
        password = scanner.nextLine();
        return password;
    }
}
