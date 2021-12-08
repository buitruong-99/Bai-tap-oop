package com.bvtruong.lab0;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        System.out.println("Tổng của dãy S = 1 + 2 + 3 + ...+ n = " +sum);
    }
}
