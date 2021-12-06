package com.bvtruong.lab02;

import java.util.Scanner;

public class myDate {
    public int date;
    public int mouth;
    public int year;

    public myDate() {
    }

    public myDate(int date, int mouth, int year) {
        this.date = date;
        this.mouth = mouth;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
