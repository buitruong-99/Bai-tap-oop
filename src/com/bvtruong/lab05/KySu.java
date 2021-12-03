package com.bvtruong.lab05;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhdt;

    public KySu() {
    }

    public KySu(String hoten, String namsinh, Boolean gioitinh, String diachi, String nganhdt) {
        super(hoten, namsinh, gioitinh, diachi);
        this.nganhdt = nganhdt;
    }

    public String getNganhdt() {
        return nganhdt;
    }

    public void setNganhdt(String nganhdt) {
        this.nganhdt = nganhdt;
    }

    @Override
    public String toString() {
        return super.toString() + "KySu{" +
                "nganhdt='" + nganhdt + '\'' +
                '}';
    }
    public void input() {
        super.input();
        System.out.print("Nhập ngành đào tạo ");
        this.setNganhdt(new Scanner(System.in).nextLine());
    }
}
