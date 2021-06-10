package _03_array_method.thuchanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
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
        System.out.println("Nhap vao gia tri muon tim trong mang");
        input = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (input == arr[i]) {
                System.out.println("vi tri cua " + arr[i] + " la " + (i+1));
//                gia tri hien thi no bat dau tu 1
                check = true;
                break;
            }

        }
        if (check==false) {
            System.out.println("khong ton tai gia tri da nhap trong mang");
        }
    }


}



//
//        int input;
//        System.out.println("Nhap vao gia tri muon tim trong mang");
//        input = scanner.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (input==arr[i]) {
//                System.out.println("vi tri cua " + arr[i] + "la" + i);
//            } else {
//                System.out.println("khong ton tai gia tri da nhap trong mang");
//            }
//        }






//    public static void main(String[] args) {
//        String[] students = {"nhat", "ha", "tai", "danh", "quan"};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a name’s student:");
//        String input_name = scanner.nextLine();
//        boolean isExist = false;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].equals(input_name)) {
//                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
//                isExist = true;
//                break;
//            }
//        }
//        if (!isExist) {
//            System.out.println("Not found" + input_name + " in the list.");
//        }
//    }
