package _04_class_object.thuchanh;

import java.util.Scanner;

public class Rectangle {
    private double chieuDai;
    private double chieuRong;

//    alt+insert;
//    chon tat ca Ctrl+a;

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getDienTich() {
        return this.chieuDai*this.chieuRong;
    }
    public double getChuVi() {
        return (this.chieuDai+this.chieuRong)*2;
    }
    public String gethienThiKichThuoc() {
        return "Hinh chu nhat co chieu dai la: "+this.chieuDai+" chieu rong la:"+this.chieuRong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai:");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhap vao chieu rong:");
        double chieuRong = scanner.nextDouble();
        Rectangle rt = new Rectangle(chieuDai,chieuRong);
        System.out.println(rt.gethienThiKichThuoc());
        System.out.println("Chu vi hinh chu nhat la:"+rt.getChuVi());
        System.out.println("Dien tich hinh chu nhat la:"+rt.getDienTich());
    }
}
