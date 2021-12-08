package com.bvtruong.lab05_kethua;

public class Student extends Person{
    private String className;

    public Student() {
    }

    public Student(String name, String address, String deparment, String className) {
        super(name, address, deparment);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
