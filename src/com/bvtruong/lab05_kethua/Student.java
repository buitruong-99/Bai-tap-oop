package com.bvtruong.lab05_kethua;

import java.util.Scanner;

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

    @Override
    public void print() {
        super.print();
        System.out.println(" " + className);
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhập tên lớp: ");
        this.setClassName(new Scanner(System.in).nextLine());
    }
}
