package _19_string_regex.baitap;

import java.util.Scanner;

public class TenLop {

//    Tên một lớp học hợp lệ cần đạt các yêu cầu sau:
//    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//    Không chứa các ký tự đặc biệt
//    Theo sau ký tự bắt đầu là 4 ký tự số
//    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

//    [APC]

    private static final String Tenlop = "^[CAP][0-9]{4}[GHIKLM]$";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        while(!check) {
            System.out.println("Vui lòng nhập tên lớp: ");
            String input = sc.nextLine();
            if (input.matches(Tenlop)) {
                check = true;
                System.out.println("Bạn đã nhập tên thành công");
            } else {
                System.out.println("Sai rồi ,vui lòng nhập lại cho đúng");
            }
        }
    }
}
