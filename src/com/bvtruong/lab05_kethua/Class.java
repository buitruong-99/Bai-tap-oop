package com.bvtruong.lab05_kethua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class {
    private String name;
    List<Student> studentList;
    private int numOfStudents;
    private Teacher advisor;

    public Class() {
    }

    public Class(String name, List<Student> studentList, int numOfStudents, Teacher advisor) {
        this.name = name;
        this.studentList = studentList;
        this.numOfStudents = numOfStudents;
        this.advisor = advisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public Teacher getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Teacher advisor) {
        this.advisor = advisor;
    }
    public void input() {
        System.out.println("Nhập số lượng SV: ");
        this.setNumOfStudents(new Scanner(System.in).nextInt());

        Student student = null;
        for (int i = 0; i < this.getNumOfStudents(); i++) {
            student = new Student();
            student.input();
            student.setClassName(this.getName());
            studentList.add(student);
        }
        System.out.println("Nhập GVCN: ");
        Teacher teacher = new Teacher();
        teacher.input();
        this.setAdvisor(teacher);
    }
    public void print() {
        System.out.println("Tên lớp: "+this.getName() +"Số lượng SV: " +this.getNumOfStudents());
        System.out.println("Thông tin GVCN: ");
        this.getAdvisor().print();
        System.out.println("Danh sách lớp: ");
        Student student = null;

        for (int i = 0; i < studentList.size(); i++) {
            student = studentList.get(i);
            System.out.println((i+1) +"-");
            student.print();
        }


    }

}
