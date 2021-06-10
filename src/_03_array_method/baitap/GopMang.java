package _03_array_method.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chieu dai mang");
        size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("moi ban nhap phan tu thu " + i);
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + "");
        }


        int size2;

        System.out.println("moi ban nhap chieu dai mang");
        size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("moi ban nhap phan tu thu " + i);
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + "");
        }

        int size3 = size1 + size2;
        int[] arr3 = new int[size3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int b = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr3[b] = arr2[i];
            b++;
        }
//        từ dòng 39 đến 43 có cách 2 là
//        for(int i=0;i<arr2.length;i++) {
//            arr3[arr1.length+i]=arr2[i];
//
//
//
//
//        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
