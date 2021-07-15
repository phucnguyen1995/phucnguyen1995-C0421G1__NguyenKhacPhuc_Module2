package _23_thi.controllers;


import _23_thi.libs.CheckChoice;

import _23_thi.services.SanPhamXuatKhauImpl;

import java.util.Scanner;

public class ControllerSanPhamXuatKhau {

    public static void caSe2() {

        SanPhamXuatKhauImpl sanPhamXuatKhauService = new SanPhamXuatKhauImpl();

        System.out.println("Chọn chức năng theo số ( để tiếp tục)");
        System.out.println("1.Thêm mới");
        System.out.println("2.Xóa");
        System.out.println("3.Xem danh sách các sản phẩm");
        System.out.println("4.Tìm kiếm");
        System.out.println("5.Thoat");
        System.out.println("Chọn chức năng");

        int choiceOne = CheckChoice.soNguyen();
        switch (choiceOne) {
            case 1:
                sanPhamXuatKhauService.addNew();
                break;
            case 2:
                sanPhamXuatKhauService.xoa();
                break;
            case 3:
                sanPhamXuatKhauService.displayList();
                break;
            case 4:
                sanPhamXuatKhauService.timKiem();
                break;
            case 5:
                Controller.displayMenu();
            default:
                System.err.println("Vui lòng nhập sô nguyên từ 1 đến 5");
                Controller.displayMenu();
        }

    }
}
