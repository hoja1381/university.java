package com.hoja;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        char[] chars = new char[enter.length()];
        for (int i = 0; i < enter.length(); i++) {
            chars[i] = enter.charAt(i);
        }
        char c = '+';
        char c2 = '-';
        char a = chars[1];
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        if ( a == c) {
            Calculate calculate = new calcPlus();
            System.out.println(calculate.calc(Integer.parseInt(String.valueOf(chars[0])),Integer.parseInt(String.valueOf(chars[2]))));
        }
        else if ( a == c2) {
            Calculate calculate = new calcMinus();
            System.out.println(calculate.calc(Integer.parseInt(String.valueOf(chars[0])),Integer.parseInt(String.valueOf(chars[2]))));
        }
    }
}