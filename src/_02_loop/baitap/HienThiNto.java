package _02_loop.baitap;

import java.util.Scanner;

public class HienThiNto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số lượng nguyên tố bạn muốn in ra ");
        int num = input.nextInt();
        int run = 2;
        int number = 0;
        while (true){
            boolean check = true;
            for (int i = 2; i < run; i++) {
                if (run % i == 0) {
                    check=false;
                    break;
                }
            }
            if (check) {
                System.out.println(run);
                number++;
            }
            if (number == num) {
                break;
            }
            run++;
        }
    }
}
