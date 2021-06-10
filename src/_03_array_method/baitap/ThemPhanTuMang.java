package _03_array_method.baitap;

import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chieu dai mang");
        size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("moi ban nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }

        int input;
        System.out.println("Nhap vao gia tri muon them trong mang");
        input = scanner.nextInt();

        int index;
        System.out.println("Nhap vao vi tri muon them trong mang");
        index = scanner.nextInt();

        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (index >= 1 || index < arr.length - 1) {
                for (i = arr.length - 1; i > index; i--) {
                    arr[i] = arr[i - 1];

                }
                arr[index] = input;


            }
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            check = true;
            break;
        }


        if (check == false) {
            System.out.println("nhap vi tri khong dung,khong chen duoc");
        }
    }
}



//public class AddNewElement {
//
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        // Khởi tạo mảng
//        System.out.println("Nhập số lượng phần tử:");
//        int size = scanner.nextInt();
//        int[] number = new int[size];
//        for (int i = 0; i < number.length; i++) {
//            System.out.println("Nhập phần tử thứ " + (i+1));
//            number[i] = scanner.nextInt();
//        }
//A
//        // Hiển thị mảng
//        System.out.println(Arrays.toString(number));
//
//        // Insert X vào mảng
//        System.out.println("Nhập giá trị cần chèn: ");
//        int x = scanner.nextInt();
//        System.out.println("Nhập vị trí muốn chèn:");
//        int index = scanner.nextInt();
//        if (index <= 1 || index > number.length - 1) {
//            System.out.println("Không thể chèn");
//        } else {
//            int temp = 0;
//            for (int i = number.length - 1; i > index; i--) {
//                number[i] = number[i - 1];
//            }
//            number[index] = x;
//        }
//
//        // Hiển thị lại mảng đã thêm X
//        for (int a: number) {
//            System.out.println(a);
//        }
//    }
//}