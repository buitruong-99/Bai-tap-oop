package com.bvtruong.lab05;

import java.util.Scanner;

public class CanBo {
    private String hoten;
    private String namsinh;
    private Boolean gioitinh; //đúng là trai, sai là gái
    private String diachi;

    public CanBo() {
    }
    public CanBo(String hoten, String namsinh, Boolean gioitinh, String diachi) {
        // hàm tạo có đối số
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoten='" + hoten + '\'' +
                ", namsinh='" + namsinh + '\'' +
                ", gioitinh=" + gioitinh +
                ", diachi='" + diachi + '\'' +
                '}';
    }
    public void input() {
        // hàm nhập
        System.out.print("Nhập họ tên ");
        this.setHoten(new Scanner(System.in).nextLine());
        System.out.print("Nhập năm đẻ ");
        this.setNamsinh(new Scanner(System.in).nextLine());
        System.out.print("Nhập giới tính ");
        this.setGioitinh(new Scanner(System.in).nextBoolean());
        System.out.print("Nhập địa chỉ ");
        this.setDiachi(new Scanner(System.in).nextLine());
    }

}
