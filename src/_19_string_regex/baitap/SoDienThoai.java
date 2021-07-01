package _19_string_regex.baitap;

import java.util.Scanner;

public class SoDienThoai {
//    Mô tả
//Viết phương thức để kiểm tra tính hợp lệ của số điên thoại.
//Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
//x là ký tự số
//Không chứa các ký tự đặc biệt
//Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
//Ví dụ tên lớp không hợp lệ: (a8)-(22222222)

    private static final String Sdt = "^[(]{1}[0-9]{2}[)]{1}[-]{1}[(]{1}[0]{1}[0-9]{9}[)]{1}$";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isLegal = false;
        while(!isLegal) {
            System.out.println("Mời bạn nhập số điện thoại ");
            String input = sc.nextLine();
            if (input.matches(Sdt)) {
                isLegal = true;
                System.out.println("bạn đã nhập thành công");
            } else {
                System.out.println("bạn đã nhập sai,vui lòng nhập lại");
            }
        }
    }
}
