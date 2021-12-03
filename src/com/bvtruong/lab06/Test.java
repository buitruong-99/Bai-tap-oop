package com.bvtruong.lab06;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Shape>  figure = new ArrayList<>();
        Shape s1 = new Line();
        Shape s2 = new Circular();
        Shape s3 = new Circular();
        Composite com = new Composite();

        Shape l1 = new Line();
        Shape l2 = new Line();
        Shape l3 = new Line();
        Shape c1 = new Circular();

        com.add(l1);
        com.add(l2);
        com.add(l3);
        com.add(c1);

        figure.add(s1);
        figure.add(s2);
        figure.add(s3);
        figure.add(com);

        System.out.println("Đổi màu đồng bộ các hình line, circular, composite");
        for (Shape shape: figure) {
            shape.setColor(103);
        }

        System.out.println("Quay 1 góc 90 độ các hình line, circular, composite");
        for (int i = 0; i < figure.size(); i++) {
            Shape shape = figure.get(i);
            shape.rotate(200);
        }
    }
}
