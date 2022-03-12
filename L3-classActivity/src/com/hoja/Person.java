package com.hoja;

import java.util.Scanner;

public class Person {
    String name ;
    String family ;
    int age ;
    public String getName (){
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        return name.trim();
    }
    public String getFamily (){
        Scanner scanner = new Scanner(System.in);
        family = scanner.nextLine();
        return family.trim();
    }
    public int getAge (){
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        return age;
    }

}
