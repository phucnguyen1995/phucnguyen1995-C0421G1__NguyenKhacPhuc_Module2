package _12_java_collection_framework.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Bước 1: Tạo lớp TestMap chứa phương thức main
public class TestMap {
    public static void main(String[] args) {
//        Bước 2: Tạo HashMap trong main để lưu danh sách sinh viên
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
//        dịch:Hiển thị các mục trong HashMap
        System.out.println(hashMap + "\n");
//        kquachay:{Lewis=29, Smith=30, Cook=29, Anderson=31}
//        System.out.println(hashMap );
//        ket qua van như vậy  chưa hiêu "\n" để làm gì????
//        giải thích:để cách với dòng dưới

//Bước 3: Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
//       dịch:Hiển thị các mục nhập theo thứ tự tăng dần của key
        System.out.println(treeMap);
//        kết quả chạy:{Anderson=31, Cook=29, Lewis=29, Smith=30}

//        Bước 4: Tạo LinkedHashMap trong main lưu danh sách sinh viên
//        và hiển thị dữ liệu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
