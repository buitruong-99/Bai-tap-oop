package com.bvtruong.lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        int chucnang;
        do {
            System.out.println("1. Nhập thông tin cán bộ.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiển thị thông tin về danh sách cán bộ.");
            System.out.println("0. THOÁT.");
            System.out.print("Chọn chức năng: ");
            chucnang = new Scanner(System.in).nextInt();

            switch (chucnang) {
                case 1:
                    int chucnang1;
                    do {
                        System.out.println("1. Nhập công nhân.");
                        System.out.println("2. Nhập kỹ sư.");
                        System.out.println("3. Nhập nhân viên.");
                        System.out.println("0. THOÁT.");
                        System.out.print("Chọn chức năng: ");
                        chucnang1 = new Scanner(System.in).nextInt();
                    }while (chucnang1 != 0);
                    break;
                default:
                    throw new AssertionError();
            }

        }
        while (chucnang != 0);
        System.out.println("Chương trình kết thúc");
    }
}
