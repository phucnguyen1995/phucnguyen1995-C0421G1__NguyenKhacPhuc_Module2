package _11_dsa_stack_queue.baitap;

import java.util.Arrays;
import java.util.Stack;

public class DaoChieu {
    public static void main(String[] args) {
        //  tao  mảng số nguyên :
        int []soNguyen = {6,2,1,5,9};
        System.out.println("Chưa  ngược: " + Arrays.toString(soNguyen));
        // Khởi tạo stack kiểu số nguyên
        Stack<Integer> number = new Stack<>();
        // Thêm từ mảng vào stack
        for (int i = 0; i < soNguyen.length; i++) {
            number.push(soNguyen[i]);
        }
        // Thêm ngược lại vào
        for (int i = 0; i < soNguyen.length; i++) {
            soNguyen[i] = number.pop();
        }
        System.out.println("Đã  ngược: " + Arrays.toString(soNguyen));
        //  tạo chuỗi
        String str = "Nguyễn Khắc Phục";
        Stack<String> mStack = new Stack<>();
        // Chuyển chuỗi thành mảng
        String[] strArr = str.split(" ");
        System.out.println("Chưa  ngược: " + Arrays.toString(strArr));
        // Thêm từ mảng  vào stack
        for (int i = 0; i < strArr.length; i++) {
            mStack.push(strArr[i]);
        }
        // Thêm ngược lại vào mảng
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = mStack.pop();
        }
        System.out.println("Đã  ngược: " + Arrays.toString(strArr));
    }
    }

