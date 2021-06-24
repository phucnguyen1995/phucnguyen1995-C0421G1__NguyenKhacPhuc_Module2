package _14_thuat_toan_sap_xep.thuchanh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class LamThemBenNgoai {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] number={20,24,11,6,44,25,56,77};

        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<number.length;i++) {
            ar.add(number[i]);
        }
        System.out.println("mảng ar="+ar);
        ar.sort(Integer::compareTo);
        System.out.println("sau khi sap xep="+ar);
        System.out.println("số nhỏ nhất trong mảng là "+ar.get(0));
        System.out.println("số lớn nhất trong mảng là "+ar.get(ar.size()-1));



        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<ar.size();i++) {
            stack.push(ar.get(i));
        }
        System.out.println("tao mảng mới trong stack="+stack);


        ArrayList<Integer> ab=new ArrayList<>();
        for(int i=0;i<number.length;i++) {
            ab.add(stack.pop());
        }
        System.out.println("mảng đảo ngược="+ab);

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

