package _13_thuat_toan_tim_kiem.baitap;

import java.util.LinkedList;
import java.util.Scanner;
//Mô tả
//Viết chương trình cho phép người dùng nhập vào một chuỗi bất kỳ và sau khi nhập xong chương trình sẽ hiển
// thị một chuỗi kí tự con được sắp xếp theo thứ tự từ bé đến lớn.
//Ví dụ: Nhập vào chuỗi Welcome thì chuỗi tăng dần lớn nhất sẽ là Welo. Vì theo bảng ASCII thì chữ W sẽ nhỏ
// hơn e, e nhỏ hơn l, l nhỏ hơn o vậy nên chuỗi chúng ta thu được là Welo.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
//        bước này để làm gì?


        for (int i = 0; i < string.length(); i++) {

            LinkedList<Character> list = new LinkedList<>();

            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) { //vòng lặp bên trong
                //Kiểm tra kí tự tiếp theo có lớn hơn kí tự cuối cùng trong list hay không
                if (string.charAt(j) > list.getLast()) {
                    //Nếu có thì thêm vào trong list
                    list.add(string.charAt(j));
                }
            }
            //So sánh kích cỡ của list trung gian và list chứa chuỗi tăng dần có kích thước lớn nhất
            if (list.size() > max.size()) {
                //Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
                max.clear();
                max.addAll(list);

            }
            list.clear();

        }

        // Hiển thị chuỗi tăng dần dài nhất
        for (Character ch: max) { // 1 vòng lặp
            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();
    }
}
