package com.bvtruong.lab06;

public class Circular extends Shape {
    @Override
    public void draw() {
        System.out.println("Ve hinh tron");
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Quay hinh tron 1 goc "+angle+ " do");
    }

    @Override
    public void moveLeft(int point) {
        System.out.println("Di chuyen hinh tron den diem " +point);
    }

    @Override
    public void setColor(int color) {
        System.out.println("To mau hinh tron voi ma mau " +color);
    }
    public int getArea() {
        return 200;
    }
}
