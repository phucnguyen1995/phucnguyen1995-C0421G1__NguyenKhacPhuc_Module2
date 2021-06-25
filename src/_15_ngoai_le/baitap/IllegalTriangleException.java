package _15_ngoai_le.baitap;


import java.util.Scanner;

//             Viết một ứng dụng nhập vào 3 cạnh của hình tam giác. Kiểm tra nếu giá trị nhập vào là số âm hoặc
//             tổng 2 cạnh không lớn hơn cạnh còn lại thì sinh ngoại lệ.

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập độ dài cạnh a");
            double a = sc.nextDouble();

            System.out.println("Nhập độ dài cạnh b");
            double b = sc.nextDouble();

            System.out.println("Nhập độ dài cạnh c");
            double c = sc.nextDouble();

            KiemTra( a, b, c);

            System.out.println("tạo thành tam giác");
            System.out.println("cạnh a=" + a);
            System.out.println("cạnh b=" + b);
            System.out.println("cạnh c=" + c);

        } catch (NgoaiLe1 phuc) {
            System.out.println("sinh ngoai lê" + phuc.getMessage());
        } catch (NgoaiLe2 phuc) {
            System.out.println("sinh ngoai lê" + phuc.getMessage());
        }

    }

    private static void KiemTra(double a, double b, double c) throws NgoaiLe1, NgoaiLe2 {
        if (a < 0 || b < 0 || c < 0) {
            throw new NgoaiLe1("Bạn không được nhập số âm");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new NgoaiLe2("Tổng 2 cạnh phải lớm hơn cạnh còn lại");
        }
    }

}
