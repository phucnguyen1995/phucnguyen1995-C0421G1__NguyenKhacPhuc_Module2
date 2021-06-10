package _03_array_method.thuchanh;

import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("moi ban nhap chieu dai mang");
            size = scanner.nextInt();
            if (size>20) {
                System.out.println("vuot qua so luong");
            }
        }while (size>20);
        int[] arr = new int[size];
        for (int i = 0 ; i<arr.length;i++) {
            System.out.println("moi ban nhap phan tu thu " +i);
            arr[i]=scanner.nextInt();
        }
        for (int i =0; i<arr.length;i++) {
            System.out.println(arr[i]+"");
        }
        int dau = 0;
        int cuoi = arr.length-1;
        while (dau<cuoi) {
            int b = arr[dau];
            arr[dau]=arr[cuoi];
            arr[cuoi] = b;
            dau++;
            cuoi--;
        }
        for (int i = 0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
