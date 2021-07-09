package _21_case_study.libs;

import java.util.Scanner;

public class CheckChoice {
    static Scanner sc = new Scanner(System.in);

    public static int checkIntException() {
        boolean check = false;
        int choice = 0;
        while (!check) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        }
        return choice;
    }

    public static double checkFloatException() {  //sửa: chuyển float --> double
        boolean check = false;
        double value = 0;
        while (!check) {
            try {
                value = Double.parseDouble(sc.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.err.println("Wrong format! Please enter NUMBER!");
            }
        }
        return value;
    }
}
