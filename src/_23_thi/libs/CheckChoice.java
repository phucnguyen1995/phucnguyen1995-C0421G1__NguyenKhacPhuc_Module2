package _23_thi.libs;

import java.util.Scanner;

public class CheckChoice {
    static Scanner sc = new Scanner(System.in);

    public static int soNguyen() {
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
}
