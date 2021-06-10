package _03_array_method.baitap;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chieu dai mang");
        size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("moi ban nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }

        int input;
        System.out.println("Nhap vao gia tri muon xoa trong mang");
        input = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                if (arr[i] == input) {
                    check = true;
                    arr[i]=0;
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                        arr[j + 1] = 0;
                    }
                } else {
                    break;
                }
            }
        }
        if (check == false) {
            System.out.println("khong ton tai gia tri da nhap trong mang");
        }

        for (int a: arr) {
            System.out.println(a);

        }
    }

}


