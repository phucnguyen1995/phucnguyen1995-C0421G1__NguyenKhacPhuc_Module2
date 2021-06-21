package _11_dsa_stack_queue.baitap;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần test");
        String str = scanner.nextLine();

//        String str = "Able was I ere I saw Elba";
        String input = str.toLowerCase();
        String[] inputArr = input.split("");

        Stack<String> stack = new Stack();
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < inputArr.length; i++) {
            stack.push(inputArr[i]);
            queue.offer(inputArr[i]);
        }

        System.out.println(stack);
        System.out.println(queue);

        int dem = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (stack.pop().equals(queue.poll())) {
                dem++;
            }
        }
        if (dem == inputArr.length) {
            System.out.println("True-là chuỗi palindrome");
        } else {
            System.out.println("False-ko là chuỗi palindrome");
        }

//        for (int i = 0; i < inputArr.length; i++) {
//            if(stack.pop().equals(queue.poll())) {
//                System.out.println("True-là chuỗi palindrome");
//            }else {
//                System.out.println("False-ko là chuỗi palindrome");
//            }


    }
}
