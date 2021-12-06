package com.bvtruong.lab02;

import java.util.Scanner;

public class PS {
    private int tuso, mauso;

    public PS() {
    }

    public PS(int tuso, int mauso) {
        super();
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    public void congPS(PS ps) {
        int tuso = this.getTuso() * ps.getMauso() + ps.getTuso() * this.getMauso();
        int mauso = this.getMauso() * ps.getMauso();
        PS pstong = new PS(tuso, mauso);
        System.out.println("Tong 2 phan so = " +pstong.tuso +"/"+ pstong.mauso);
    }
    public void truPS(PS ps) {
        int tuso = this.getTuso() * ps.getMauso() - ps.getTuso() * this.getMauso();
        int mauso = this.getMauso() * ps.getMauso();
        PS pshieu = new PS(tuso, mauso);
        System.out.println("Hieu 2 phan so = " +pshieu.tuso +"/"+ pshieu.mauso);
    }
    public void nhanPS(PS ps) {
        int tuso = this.getTuso() * this.getTuso();
        int mauso = this.getMauso() * this.getMauso();
        PS pstich = new PS(tuso, mauso);
        System.out.println("Tich 2 phan so = " +pstich.tuso +"/"+ pstich.mauso);
    }
    public void chiaPS(PS ps) {
        int tuso = this.getTuso() * this.getMauso();
        int mauso = this.getMauso() * this.getTuso();
        PS psthuong = new PS(tuso, mauso);
        System.out.println("Thuong 2 phan so = " +psthuong.tuso +"/"+ psthuong.mauso);
    }

    public static void main(String[] args) {
        PS ps1 = new  PS(2,3);
        PS ps2 = new PS(1,3);
        ps1.congPS(ps2);
        ps1.truPS(ps2);
        ps1.nhanPS(ps2);
        ps1.chiaPS(ps2);
    }
}
