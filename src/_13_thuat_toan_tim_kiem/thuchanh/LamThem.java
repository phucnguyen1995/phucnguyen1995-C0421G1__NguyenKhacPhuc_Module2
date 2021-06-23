package _13_thuat_toan_tim_kiem.thuchanh;

import java.util.LinkedList;
import java.util.Scanner;

public class LamThem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] number={20,24,11,6,44,25,56,77};

        LinkedList<Integer> max = new LinkedList<>();
        for(int i=0;i<number.length;i++) {
            max.add(number[i]);
        }


        Ham(number);
    }
    public static void Ham(int[] a) {
        System.out.println("Nhập giá trị muốn tìm ");
        int value = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (value==a[i]) {
                System.out.println("tồn tại giá trị bạn đã nhập trong mảng và nó nằm ở vị trí thứ "+i+" trong mảng");
                check = true;
                break;
            }
        }
        if(!check) {
            System.out.println("không tồn tại giá trị đã nhập");
        }
    }


}
