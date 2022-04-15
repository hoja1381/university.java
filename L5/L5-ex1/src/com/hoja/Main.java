package com.hoja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your information :\n (username,fullname,password,age,phonenumber,adress,educationalrate)" );
        Builder builder = new Builder(scanner.nextLine(),scanner.nextLine(), scanner.nextLine(),
                scanner.nextInt(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());


        System.out.println(builder.getUserName()+"\n"+ builder.getFullName()+"\n"+builder.getPassword()+"\n"+builder.getAge()+"\n"+
                builder.getPhoneNumber()+"\n"+builder.getAddress()+"\n"+builder.getEducationRate());

    }
}
