package com.hoja;

public class Information<Number,Pass,User> implements Cloneable{
    public Number age;
    public Pass   password;
    public User   username;
    protected Object clone()throws CloneNotSupportedException {
        return super.clone();
    }
}
