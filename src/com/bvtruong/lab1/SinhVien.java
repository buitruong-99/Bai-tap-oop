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
        System.out.print("Nhập năm sinh: ");
        namsinh = scanner.nextInt();
        System.out.print("Nhập lớp học: ");
        lophoc = scanner.nextLine();
        System.out.print("Nhập địa chỉ email: ");
        email = scanner.nextLine();

        System.out.println("Thông tin sinh viên đã nhập: " +hoten +" "+ namsinh +" " +lophoc +" " +email);

    }
}
