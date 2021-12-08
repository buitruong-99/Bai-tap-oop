package com.bvtruong.lab05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        CanBo canBo;
        int chucnang;
        do {
            System.out.println("1. Nhập thông tin mới cho cán bộ ");
            System.out.println("2. Tìm kiếm theo họ tên ");
            System.out.println("3. Hiển thị thông tin về danh sách các cán bộ ");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng chính");
            chucnang = new Scanner(System.in).nextInt();

            switch (chucnang) {
                case 1:
                    int chucnang1;
                    do {
                        System.out.println("1. Nhập thông tin công nhân ");
                        System.out.println("2. Nhập thông tin kỹ sư ");
                        System.out.println("3. Nhập thông tin nhân viên");
                        System.out.println("0. Thoát");
                        System.out.println("Chọn chức năng nhập thông tin cho cán bộ");
                        chucnang1 = new Scanner(System.in).nextInt();
                        switch (chucnang1) {
                            case 1:
                                System.out.println("Nhập thông tin công nhân");
                                canBo = new CongNhan();
                                canBo.input();
                                list.add(canBo);
                                break;
                            case 2:
                                System.out.println("Nhập thông tin kỹ sư");
                                canBo = new KySu();
                                canBo.input();
                                list.add(canBo);
                                break;
                            case 3:
                                System.out.println("Nhập thông tin nhân viên");
                                canBo = new NhanVien();
                                canBo.input();
                                list.add(canBo);
                            default:
                                System.out.println("VUi lòng chọn đúng cú pháp");
                        }
                    }
                    while (chucnang1 != 0);
                    System.out.println("Thoát chức năng 1");
                    break;
                case 2:
                    System.out.println("Tìm kiếm theo họ tên");
                    System.out.print("Nhập họ tên cần tìm kiếm: ");
                    String hoten = new Scanner(System.in).nextLine();
                    CanBo cb;
                    for (Object object: list) {
                        cb = (CanBo) object;
                        if (cb.getHoten().equalsIgnoreCase(hoten)) {
                            System.out.println(cb);
                        }

                    }
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách cán bộ");
                    System.out.println(list);
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng cú pháp");
            }
        }
        while (chucnang != 0);
        System.out.println("Chương trình đã kết thúc");
    }
}
