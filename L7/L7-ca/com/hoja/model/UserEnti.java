package com.hoja.model;

public class UserEnti implements AutoCloseable {
    private String userName;
    private String pass;
    private String name;
    private String email;

    public String getUserName() {
        return userName;
    }

    public UserEnti setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public UserEnti setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEnti setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public void close() throws Exception {}
}
