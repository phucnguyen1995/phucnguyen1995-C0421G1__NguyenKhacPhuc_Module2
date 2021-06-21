package _11_dsa_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ThapSangNhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> thapSangNhi = new Stack<>();

        System.out.println("Nhập số thập phân cần chuyển: ");
        int input = scanner.nextInt();

        while (input != 0) {
            int result = input % 2;
            thapSangNhi.push(result);
            input /= 2;
        }

        int size = thapSangNhi.size();
        System.out.println(thapSangNhi);

        System.out.println("Đổi sang nhị phân: ");
        for (int i = 0; i < size; i++) {
            System.out.println(thapSangNhi.pop());
        }

    }
}
