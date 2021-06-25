package _15_ngoai_le.thuchanh;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập gia tri x");
      double x=sc.nextDouble();
        System.out.println("nhập gia tri y");
        double y=sc.nextDouble();

        Ham(x,y);
    }
    public static void Ham(double x,double y) {
        try{
            double a = x + y;
            double b = x - y;
            double c = x * y;
            double d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }
        catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }

    }
}
