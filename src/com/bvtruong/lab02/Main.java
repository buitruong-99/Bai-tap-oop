package com.bvtruong.lab02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày ");
        int date = scanner.nextInt();
        System.out.print("Nhập tháng ");
        int mouth = scanner.nextInt();
        System.out.print("Nhập năm ");
        int year = scanner.nextInt();
        System.out.println("Ngày tháng năm đã nhập là " +date +"/"+ mouth +"/"+ year);
    }
}
