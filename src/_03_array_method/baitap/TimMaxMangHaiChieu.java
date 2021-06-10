package _03_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxMangHaiChieu {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//       đây là cách tạo ma trận
        System.out.println("Nhập số dòng: ");
        int hang = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        int cot = scanner.nextInt();
        int[][] matran;
        matran = new int[hang][cot];

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhập phần tử vào ma trận: ");
                matran[i][j] = scanner.nextInt();
            }
        }
//        Day la Hiển thị ma trận
        for (int[] x : matran) {
            System.out.println(Arrays.toString(x));
        }

        // Tìm GTLN bằng cách gọi hàm
        System.out.println("Giá trị lớn nhất trong ma trận là: " + HamMaxMangHaiChieu(matran));
    }

    private static int HamMaxMangHaiChieu(int[][] arr) {
        int max = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
