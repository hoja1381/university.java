package com.hoja;

public class CarsEnt {
    private int id;
    private String name;
    private long year;
    private long price;

    public int getId() {
        return id;
    }

    public CarsEnt setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CarsEnt setName(String name) {
        this.name = name;
        return this;
    }

    public long getYear() {
        return year;
    }

    public CarsEnt setYear(long year) {
        this.year = year;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public CarsEnt setPrice(long price) {
        this.price = price;
        return this;
    }
}
