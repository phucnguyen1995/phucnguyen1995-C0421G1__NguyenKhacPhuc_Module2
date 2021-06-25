package _14_thuat_toan_sap_xep.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vui lòng nhập độ dài mảng: ");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Nhập vào phần tử vị trí thứ " + i);
//            System.out.println("Nhập vào phần tử vị trí thứ " + (i+1));
            Arr[i] = sc.nextInt();
        }
        System.out.println("Hiển thị dãy số người dùng đã nhập:");
        for (Integer hienThi: Arr) {
            System.out.print(hienThi+" ");
        }
        System.out.println();
//        mục đích có dòng 22 là để nó xuống hàng
//        nếu ko kết quả chạy ra sẽ:
//        Hiển thị dãy số người dùng đã nhập:
//        2 1 9 Sắp xêp từ nhỏ đến lớn A=[1, 2, 9]

        insertionSort(Arr);
        System.out.println("Sắp xêp từ nhỏ đến lớn A=" + Arrays.toString(Arr));
    }

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
