package com.hoja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       SighIn sighIn = SighIn.getLogInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your username:");
        sighIn.setUserName(scanner.nextLine());

        System.out.print("enter your password :");
        sighIn.setPass(scanner.nextLine());

        System.out.println(sighIn.getUserName()+"\n"+sighIn.getPass());
    }
}
