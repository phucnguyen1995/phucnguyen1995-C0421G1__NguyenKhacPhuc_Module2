package _01_introduction.baitap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        a = input.nextInt();
        int hangTram = a / 100;
        int hangChuc = (a - hangTram * 100) / 10;
        int hangDonVi = (a - hangTram * 100 - hangChuc * 10);
        if (a < 0 || a > 1000) {
            System.out.println("vuot qua gioi han");
        }
        if (a <= 10) {
            soHangDonVi(a);
        }
        if (a < 20 && a > 10) {
            soDacBiet(a);
        }
        if (a >= 20 && a < 1000) {
            soHangTram(hangTram);
            if (hangChuc == 1) {
                soDacBiet((a - hangTram * 100));
            } else {
                soHangChuc(hangChuc);
                soHangDonVi(hangDonVi);
            }
        }
    }

    public static void soHangDonVi(int number) {
        switch (number) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            case 10:
                System.out.print("ten");
                break;
        }
    }

    public static void soDacBiet(int number) {
        switch (number) {
            case 11:
                System.out.print("eleven ");
                break;
            case 12:
                System.out.print("twelve ");
                break;
            case 13:
                System.out.print("thirteen ");
                break;
            case 14:
                System.out.print("fourteen");
                break;
            case 15:
                System.out.print("fifteen ");
                break;
            case 16:
                System.out.print("sixteen ");
                break;
            case 17:
                System.out.print("seventeen");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("nineteen");
                break;
        }
    }

    public static void soHangChuc(int number) {
        switch (number) {
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
    }

    public static void soHangTram(int number) {
        switch (number) {
            case 1:
                System.out.print("one hundred ");
                break;
            case 2:
                System.out.print("two hundred ");
                break;
            case 3:
                System.out.print("three hundred ");
                break;
            case 4:
                System.out.print("four hundred ");
                break;
            case 5:
                System.out.print("five hundred ");
                break;
            case 6:
                System.out.print("six hundred ");
                break;
            case 7:
                System.out.print("seven hundred ");
                break;
            case 8:
                System.out.print("eight hundred ");
                break;
            case 9:
                System.out.print("nine hundred ");
                break;
        }
    }
}
