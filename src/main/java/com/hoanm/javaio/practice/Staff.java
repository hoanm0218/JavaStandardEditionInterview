package com.hoanm.javaio.practice;

import java.io.Serializable;

public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int age;
    private double salary;

    public Staff() {
    }

    public Staff(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + salary;
    }
}
