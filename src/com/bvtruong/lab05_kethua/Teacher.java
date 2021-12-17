package com.bvtruong.lab05_kethua;

import java.util.Scanner;

public class Teacher extends Person {
    private String rank;

    public Teacher() {
    }

    public Teacher(String name, String address, String deparment, String rank) {
        super(name, address, deparment);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("rank = " + rank);;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhập bậc: ");
        this.setRank(new Scanner(System.in).nextLine());
    }
}
