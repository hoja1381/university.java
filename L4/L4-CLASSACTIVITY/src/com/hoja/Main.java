package com.hoja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	Person person1 = new Person();


    System.out.print("Enter your firstname :");
    person1.setName(scanner.nextLine());

    System.out.print("Enter your lastname :");
    person1.setFamily(scanner.nextLine());

    System.out.print("Enter your age :");
    person1.setAge(scanner.nextInt());

        System.out.println("Enter your username :");

     person1.setU(scanner.nextLine());

    System.out.print("Enter your password :");
    person1.setPassword(scanner.nextLine());

    System.out.print("Enter your Job :");
    person1.setJob(scanner.nextLine());

        System.out.println("your personal information :");
        System.out.println(person1.getName());
        System.out.println(person1.getFamily());
        System.out.println(person1.getAge());
        System.out.println(person1.getU());
        System.out.println(person1.getPassword());
        System.out.println(person1.getJob());
    }
}
