package com.hoja;



public class Main {

    public static void main(String[] args) {
        Student me = new Student();
        Student field = new Student();
        Test test =new Test();

        System.out.print("emter your name:");
        me.name = me.getName();
        System.out.print("enter your username:");
        me.username = me.getUsername();
        System.out.print("enter your password:");
        me.password = me.getPassword();
        try {
            test.nameTest(me.name , field.name);
        } catch (WrongFields e) {
            e.wrongName();
        }
        try {
            test.userNameTest(me.username, field.username);
            test.passWorldTest(me.password, field.password);
        } catch (WrongFields e) {
            e.wrongUserNameOrPassWord();
        }
    }
}
