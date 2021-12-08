package com.bvtruong.lab1;

import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        String hoten;
        int namsinh;
        String lophoc;
        String email;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên : ");
        hoten = scanner.nextLine();

        System.out.print("Nhập lớp học: ");
        lophoc = scanner.nextLine();
        System.out.print("Nhập địa chỉ email: ");
        email = scanner.nextLine();
        System.out.print("Nhập năm sinh: ");
        namsinh = scanner.nextInt();
        System.out.println("Thông tin sinh viên: " +hoten +" "+ namsinh +" " +lophoc +" " +email);

        for (int i = 9; i > 0; i--) {
            System.out.println(i+ " bottles of beer on the wall,"+i +" bottles of beer. ");
            System.out.println("Take one down, pass it around, ");
        }
        System.out.println("No more bottles of beer on the wall.");



    }
}
