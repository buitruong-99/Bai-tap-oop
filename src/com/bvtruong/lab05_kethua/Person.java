package com.bvtruong.lab05_kethua;

public class Person {
    private String name;
    private String address;
    private String deparment;

    public Person() {
    }

    public Person(String name, String address, String deparment) {
        this.name = name;
        this.address = address;
        this.deparment = deparment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
    public void print() {
        System.out.println(name +" "+ address +" "+ deparment);
    }

}
