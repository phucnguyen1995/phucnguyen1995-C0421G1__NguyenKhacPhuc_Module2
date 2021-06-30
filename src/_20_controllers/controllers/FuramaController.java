package _20_controllers.controllers;

import _12_java_collection_framework.baitap.Product;
import _20_controllers.services.EmployeeServiceImpl;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        List<Product> products = new ArrayList<>();


        System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ  KHU NGHỈ DƯỠNG Furama--------");

            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Managerment");
            System.out.println("5.Promotion Management");
            System.out.println("6.Thoát khoi chuong trinh");
            System.out.println("Chọn chức năng muốn sử dụng");

            int choice = sc.nextInt();
        while (true) {
//            không khai báo như dòng 28 sẽ sảy ra lỗi ,chưa hiểu tao sao xưa a
//            trung khuyên dùng     int choice = Integer.parseInt(scanner.nextLine()); giờ làm chạy thử lại ra lỗi
            switch (choice) {
                case 1:
                    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
                    System.out.println("1.Display list employees");
                    System.out.println("2.Edit employee");
                    System.out.println("3.Add new employee");
                    System.out.println("4.Return main menu");
                    int choiceOne = sc.nextInt();
                    switch (choiceOne) {
                        case 1:
                            employeeService.displayList();
                            break;

                        case 2:
                            employeeService.editEmployee();
                            break;

                        case 3:
                             employeeService.addNew();
                            break;

                        case 4:
                            displayMainMenu();
                            break;

                        default:
                            System.err.println("Vui lòng nhập lại cho đúng");
                    }
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
