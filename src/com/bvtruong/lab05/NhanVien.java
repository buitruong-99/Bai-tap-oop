package com.bvtruong.lab05;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congviec;

    public NhanVien() {
    }

    public NhanVien(String hoten, String namsinh, Boolean gioitinh, String diachi, String congviec) {
        super(hoten, namsinh, gioitinh, diachi);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return super.toString() + "NhanVien{" +
                "congviec='" + congviec + '\'' +
                '}';
    }
    public void input() {
        super.input();
        System.out.print("Nhập công việc ");
        this.setCongviec(new Scanner(System.in).nextLine());
    }
}
