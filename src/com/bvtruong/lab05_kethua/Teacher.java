package com.bvtruong.lab05_kethua;

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
}
