package com.hoja;

public class WrongFields extends Exception {
    public void wrongName() {
        System.out.println("we dont have that name in our library");
    }
    public void wrongUserNameOrPassWord(){
        System.out.println("wrong username or passwprd ");
    }

}
