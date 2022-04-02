package com.hoja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	Information information = new Information();
    information.username = scanner.nextLine();
    information.password = scanner.nextLine();
    information.age = scanner.nextInt();
    Information information2 = null;
    Information information3 = null;


    try {
        information2 = information3 = (Information) information.clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }

        System.out.println(information);
        System.out.println(information2);
        System.out.println(information3);
    }
}
