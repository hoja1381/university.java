package com.hoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name,fatherName and StudentNumber :");

        Student student = new Student();
        student.setStudentName(scanner.nextLine());
        student.setStudentFatherName(scanner.nextLine());
        student.setStudentNumber(scanner.nextLine());

        System.out.println("Enter five of your grades :");
        List<Double> list = new ArrayList<>();
        list.add(scanner.nextDouble());
        list.add(scanner.nextDouble());
        list.add(scanner.nextDouble());
        list.add(scanner.nextDouble());
        list.add(scanner.nextDouble());

        System.out.print(student.getStudentName());
        System.out.println(student.getStudentNumber()+":");

        for (Double s:
             list) {
            System.out.println(s);
        }

    }
}
