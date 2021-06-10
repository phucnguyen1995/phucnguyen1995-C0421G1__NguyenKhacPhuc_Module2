package _03_array_method.thuchanh;

import java.util.Scanner;

public class TimMaxMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("moi ban nhap chieu dai mang");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("vuot qua so luong");
            }
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("moi ban nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        int index = HamMax(arr);
        System.out.println("vị trí " + index + " đạt giá trị lớn nhất trong mang");
    }

    public static int HamMax(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}