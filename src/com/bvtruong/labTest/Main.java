package com.bvtruong.labTest;

public class Main {
    public static void main(String[] args) {
        GuesGame guesGame = new GuesGame();
        GuesGame guesGame1 = new GuesGame();
        guesGame.name = "Truong";
        guesGame.birthday = "22/11/1999";
        guesGame.age = 25;


        System.out.println(guesGame.name);
        System.out.println(guesGame.birthday);
        System.out.println(guesGame.age);
    }
}
