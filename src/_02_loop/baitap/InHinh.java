package _02_loop.baitap;

import java.util.Scanner;

public class InHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("go phim 1 de ra hinh chu nhat");
            System.out.println("go phim 2 de ra hinh tam giac");
            System.out.println("go phim 3 de ra hinh vuong");
            System.out.println("go phim 4 de ra hinh vuong co canh goc vuong o botton-left");
            int input = scanner.nextInt();
            switch (input) {

                case 1:
                    for (int i = 0; i <= 4; i++) {
                        for (int j = 0; j <= 8; j++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= 5; j++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    for (int i = 0;i<=5;i++) {
                        for (int j = 0;j<=i;j++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                default:
                    System.out.println("Khong co lua chon phu hop,vui long chon so tu 1 den 4");
                    break;
            }
        }
    }
}