package _23_thi.controllers;


import _23_thi.libs.CheckChoice;

import java.util.Scanner;

public class Controller {
    public static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {

        System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--------");

        System.out.println("Chọn chức năng theo số ( để tiếp tục)");
        System.out.println("1.Sản phẩm nhạp khẩu");
        System.out.println("2.Sản phẩm xuất khẩu");
        System.out.println("3.Thoat");
        int choice = CheckChoice.soNguyen();
        while (true) {
            switch (choice) {
                case 1:
                    ControllerSanPhamNhapKhau.caSe1();
                    break;
                case 2:
                    ControllerSanPhamXuatKhau.caSe2();
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Chọn sai,vui lòng chỉ chọn số nguyên từ 1 đến 3");
            }
        }

    }
}
