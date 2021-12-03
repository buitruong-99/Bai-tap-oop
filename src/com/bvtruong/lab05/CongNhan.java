package com.bvtruong.lab05;

import java.util.Scanner;

public class CongNhan extends CanBo {

    private String bac;

    public CongNhan() {
    }

    public CongNhan(String hoten, String namsinh, Boolean gioitinh, String diachi, String bac) {
        super(hoten, namsinh, gioitinh, diachi);
        // super gọi hàm tạo ghi đè
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "CongNhan{" +
                "bac='" + bac + '\'' +
                '}';
    }
    public void input() {
        super.input();
        System.out.print("Nhập bậc ");
        this.setBac(new Scanner(System.in).nextLine());
    }
}
