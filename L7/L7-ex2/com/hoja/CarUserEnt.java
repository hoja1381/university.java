package com.hoja;

public class CarUserEnt {
    private int carUserId;
    private String username;
    private String pass;
    private long money;
    private int car;

    public int getCarUserId() {
        return carUserId;
    }

    public CarUserEnt setCarUserId(int carUserId) {
        this.carUserId = carUserId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CarUserEnt setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public CarUserEnt setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public long getMoney() {
        return money;
    }

    public CarUserEnt setMoney(long money) {
        this.money = money;
        return this;
    }

    public int getCar() {
        return car;
    }

    public CarUserEnt setCar(int car) {
        this.car = car;
        return this;
    }
}
