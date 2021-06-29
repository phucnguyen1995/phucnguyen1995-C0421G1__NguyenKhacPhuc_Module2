package _20_controllers.controllers;

import _12_java_collection_framework.baitap.Product;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        List<Product> products = new ArrayList<>();
        System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ  KHU NGHỈ DƯỠNG Furama--------");
        while (true) {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Managerment");
            System.out.println("5.Promotion Management");
            System.out.println("6.Thoát khoi chuong trinh");
            System.out.println("Chọn chức năng muốn sử dụng");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.Display list employees");
                    System.out.println("2.Edit employee");
                    System.out.println("3.Add new employee");
                    System.out.println("4.Return main menu");
                    break;
                case 2:
                    System.out.println("1.Display list customers");
                    System.out.println("2.Add new customer");
                    System.out.println("3.Edit customer");
                    System.out.println("4.Return main menu");
                    break;
                case 3:
                    System.out.println("1.Display list facility");
                    System.out.println("2.Add new facility");
                    System.out.println("3.Display list facility maintenance");
                    System.out.println("4.Return main menu");

                    break;
                case 4:
                    System.out.println("1.Add new booking");
                    System.out.println("2.Display list booking");
                    System.out.println("3.Create new constracts");
                    System.out.println("4.Display list contracts");
                    System.out.println("5.Edit contracts");
                    System.out.println("6.Return main menu");
                    break;

                case 5:
                    System.out.println("1.Display list customers use service"+"\n"+"2.Display list customers get voucher"+"\n"+"3.Return main menu");
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Chọn sai,vui lòng chọn lại");
            }
        }

    }
//    private static int menuChoice() {
//        boolean check=false;
//        int choice =0;
//        while (!check) {
//            try {
//                choice=Integer.parseInt()
//            }
//        }
//    }

    public static void main(String[] args) {
        displayMainMenu();
    }

}
