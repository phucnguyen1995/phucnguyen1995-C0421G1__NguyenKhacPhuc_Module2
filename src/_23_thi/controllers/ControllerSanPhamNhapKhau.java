package _23_thi.controllers;


import _23_thi.libs.CheckChoice;
import _23_thi.services.SanPhamNhapKhauImpl;

import java.util.Scanner;

public class ControllerSanPhamNhapKhau {

    public static void caSe1() {
        SanPhamNhapKhauImpl sanPhamNhapKhauService = new SanPhamNhapKhauImpl();

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
                sanPhamNhapKhauService.addNew();
                break;
            case 2:
                sanPhamNhapKhauService.xoa();
                break;
            case 3:
                sanPhamNhapKhauService.displayList();
                break;
            case 4:
                sanPhamNhapKhauService.timKiem();
                break;
            case 5:
                Controller.displayMenu();
            default:
                System.err.println("Vui lòng nhập sô nguyên từ 1 đến 5");
                Controller.displayMenu();
        }

    }
}
