package com.hoja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String main ;
        int n = 0;
        main = scanner.nextLine();
        char[] chars = main.toCharArray();
        for(char c : chars) {

            if (Character.isDigit(c)) {
                System.out.println("you cant enter numbers!!");
                n++;
                break;
            }
        }
        if (n==0)
            System.out.println(main.length());
    }
}
