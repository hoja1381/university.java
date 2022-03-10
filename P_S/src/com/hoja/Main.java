package com.hoja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     Rectangle number1 = new Rectangle();
     circule number2 = new circule();
     int a;
        System.out.println("1)rectangle \n2)circlue ");
        a = scanner.nextByte();
     switch (a) {
         case 1:
         System.out.print("enter the width of the rectangle :");
         number1.width = scanner.nextDouble();
         System.out.print("enter the lenth of the rectangle :");
         number1.lenth = scanner.nextDouble();
             System.out.println("1)P \n2)S");
             int n1;
             n1 = scanner.nextByte();
             switch (n1) {
             case 1:
                 System.out.println(number1.enviroment());
                 break;
             case 2:
                 System.out.println(number1.area());
                 break;
         }
         break;
         case 2 :
             System.out.print("enter the radius :");
             number2.r=scanner.nextDouble();
             System.out.println("1)P \n2)S");
             int n2 = scanner.nextByte();
             switch (n2){
                 case 1:
                     System.out.println(number2.enviroment());
                     break;
                 case 2:
                     System.out.println(number2.area());
                     break;
             }
     }
    }
}
