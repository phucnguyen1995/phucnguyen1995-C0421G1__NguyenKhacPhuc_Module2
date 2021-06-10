package _04_class_object.baitap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    private double a, b, c;

    public PhuongTrinhBacHai(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDenTa() {
        return b * b - 4 * a * c;
    }

    public double getNghiem1() {
        return (-b + Math.sqrt(getDenTa())) / (2 * a);
    }

    public double getNghiem2() {
        return (-b - Math.sqrt(getDenTa())) / (2 * a);
    }

    public String getHienThi() {
        if (getDenTa() > 0) {
            return "phuong trinh co 2 nghiem,nghiem thu nhat la " + getNghiem1() + " nghiem thu 2 la" + getNghiem2();
        } else if (getDenTa() == 0) {
            return "phuong kinh co nghiem kep x1=x2=" + -b / (2 * a);
        } else {
            return "phuong trinh vo nghiem";
        }
    }

    @Override
    public String toString() {
        return "Phuong trinh bac 2 co dang aX2+bX+c=0;a =" + a + ";" + "b=" + b + ";" + "c=" + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so a :");
        double soA = scanner.nextDouble();
        System.out.print("Nhap vao so b:");
        double soB = scanner.nextDouble();
        System.out.print("Nhap vao so c:");
        double soC = scanner.nextDouble();
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai(soA, soB, soC);
        System.out.println(pt);
        System.out.println(pt.getHienThi());
    }
}
