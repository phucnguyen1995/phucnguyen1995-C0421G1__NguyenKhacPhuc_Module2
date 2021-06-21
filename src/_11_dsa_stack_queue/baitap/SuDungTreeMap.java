package _11_dsa_stack_queue.baitap;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class SuDungTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo chuỗi
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // toLowerCase
        String lowerInput = input.toLowerCase();

        // Chuyển chuỗi thành List và xóa khoảng trắng
        String[] inputArr = new String[0];
        ArrayList<String> list = new ArrayList<>();

        if (input.equals("")) {
            System.out.println("Chuỗi rỗng.");
        } else {
            inputArr = lowerInput.split(" ");
            for (int i = 0; i < inputArr.length; i++) {
                if (!inputArr[i].isEmpty()) {
                    list.add(inputArr[i]);
                }
//                co nghia neu phan tu do khong phai la dau cach ta moi them vao
            }
        }

        // Hiển thị List
        System.out.println(list);
        System.out.println(list.size());


        // Tạo TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (treeMap.containsKey(list.get(i))) {
//                trong if là tim tât ca nhung chữ trùng với nó trong list
                int count = treeMap.get(list.get(i)) + 1;
                treeMap.put(list.get(i), count);
            } else {
                treeMap.put(list.get(i), 1);
            }
        }
        System.out.println(treeMap);


//
//        containKey là phương thức kiểm tra có tồn tại trong list ko
//        chạy vòng lặp cho cái list
//        tạo 1 biến count kiểm tra số lần xuất hiện của list(i)
//        nếu nó xuất hiện nhiều lần thì count ++ rồi put vô treemap
//        ko thì put vô treemap là 1 vì nó xuất hiện 1 lần
    }
}
