package com.hoja.model;

public class NetEnt {
    private String username;
    private String pass;
    private double net;
    private long money;

    public String getUsername() {
        return username;
    }

    public NetEnt setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public NetEnt setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public double getNet() {
        return net;
    }

    public NetEnt setNet(double net) {
        this.net = net;
        return this;
    }

    public long getMoney() {
        return money;
    }

    public NetEnt setMoney(long money) {
        this.money = money;
        return this;
    }
}
