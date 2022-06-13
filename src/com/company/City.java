package com.company;

public class City implements Comparable<City> {
    private int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.company.City code: " + this.getCode() + ", name: " + this.getName();
    }

    @Override
    public int compareTo(City code) {
        if (this.code == code.getCode()) {
            return 0;
        } else if (this.code > code.getCode()) {
            return -1;
        } else return 1;
    }
}
