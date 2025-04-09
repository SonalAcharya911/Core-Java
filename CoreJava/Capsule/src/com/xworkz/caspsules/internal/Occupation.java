package com.xworkz.caspsules.internal;

public class Occupation {
    private String name = "Writer";
    private String field = "Media";
    private int years = 3;
    private double salary = 45000.00;
    private boolean remote = true;

    public Occupation() {
        System.out.println("no-arg constructor for Occupation");
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public int getYears() {
        return years;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getRemote() {
        return remote;
    }

    void setName(String name) {
        this.name = name;
    }

    void setField(String field) {
        this.field = field;
    }

    void setYears(int years) {
        this.years = years;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setRemote(boolean remote) {
        this.remote = remote;
    }
}

