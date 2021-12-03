package com.bvtruong.lab06;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Shape {
    List<Shape> shapeList = new ArrayList<>();
    @Override
    public void draw() {
        System.out.println("Vẽ màu hỗ hợp ");
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Quay mẫu hỗn hợp 1 góc " +angle+ "độ");
    }

    @Override
    public void moveLeft(int point) {
        System.out.println("Di chuyển mẫu hỗn hợp đến điểm "+point);
    }

    @Override
    public void setColor(int color) {
        System.out.println("Tô màu cho mẫu hỗn hợp với mã màu "+color);
    }
    public void add(Shape shape) {
        shapeList.add(shape);
    }
    public void remove(Shape shape) {
        shapeList.remove(shape);
    }
    public Shape getChild(int id) {
        return shapeList.get(id);
    }
}
