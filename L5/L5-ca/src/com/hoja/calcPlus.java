package com.hoja;

public class calcPlus implements Calculate{

    @Override
    public int calc(int a, int b) {
        int c = b+a;
        return c;
    }
}
