package _01_introduction.baitap;

import java.util.Scanner;

public class ChuyenDoiNgoaiTe {
    public static void main(String[] args) {
        double a,usd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số đô muốn đổi");
        a=sc.nextDouble();
        usd=a*23000;
        System.out.println(a+" USD đổi sang tiền  việt là "+usd+" VND");

    }

}
