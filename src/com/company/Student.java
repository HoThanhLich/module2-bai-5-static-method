package com.company;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    // hàm khởi tạo
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // phương thức static để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }

    // phuong thuc hien thi
    void display() {
        System.out.println(rollNo + " "+name+" "+ college);
    }

}
