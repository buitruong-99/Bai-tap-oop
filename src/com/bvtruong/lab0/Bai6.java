package com.bvtruong.lab0;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = input.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1.0/i);
        }
        System.out.println(sum);
    }


}
