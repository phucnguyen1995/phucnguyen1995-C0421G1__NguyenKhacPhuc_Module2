package _21_case_study.controllers;


import _21_case_study.libs.CheckChoice;

import java.util.Scanner;

public class FuramaController {
    public static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {

        System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ  KHU NGHỈ DƯỠNG Furama--------");

        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management ");
        System.out.println("4.Booking Managerment");
        System.out.println("5.Promotion Management");
        System.out.println("6.Thoát khoi chuong trinh");
        System.out.println("");
        System.out.println("Vui lòng chọn số tương ứng với chức năng muốn sử dụng");
// ban đầu chỉ có dòng 21
//        int choice = sc.nextInt();

        int choice = CheckChoice.checkIntException();
        while (true) {
//            không khai báo như dòng 28 sẽ sảy ra lỗi ,chưa hiểu tao sao xưa a
//            trung khuyên dùng     int choice = Integer.parseInt(scanner.nextLine()); giờ làm chạy thử lại ra lỗi
            switch (choice) {
                case 1:
                    EmployeeController.caSe1();
//                    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//                    System.out.println("1.Display list employees");
//                    System.out.println("2.Edit employee");
//                    System.out.println("3.Add new employee");
//                    System.out.println("4.Return main menu");
//
//                    int choiceOne = sc.nextInt();
//                    switch (choiceOne) {
//                        case 1:
//                            employeeService.displayList();
//                            break;
//
//                        case 2:
//                            employeeService.editEmployee();
//                            break;
//
//                        case 3:
//                            employeeService.addNew();
//                            break;
//
//                        case 4:
//                            displayMainMenu();
//                            break;
//
//                        default:
//                            System.err.println("Vui lòng nhập lại cho đúng");
//                    }
                    break;

                case 2:
                    CustomerController.caSe2();
//                    CustomerServiceImpl customerService = new CustomerServiceImpl();
//                    System.out.println("1.Display list customers");
//                    System.out.println("2.Edit customer");
//                    System.out.println("3.Add new customer");
//                    System.out.println("4.Return main menu");
//
//                    int choiceTwo = sc.nextInt();
//                    switch (choiceTwo) {
//                        case 1:
//                            customerService.displayList();
//                            break;
//
//                        case 2:
//                            customerService.editCustomer();
//                            break;
//
//                        case 3:
//                            customerService.addNew();
//                            break;
//
//                        case 4:
//                            displayMainMenu();
//                            break;
//
//                        default:
//                            System.err.println("Vui lòng nhập lại cho đúng");
//                    }
                    break;
                case 3:
                    FacilityController.caSe3();
//                    FacilityServiceImpl facilityService = new FacilityServiceImpl();
//                    System.out.println("1.Display list facility");
//                    System.out.println("2.Add new facility");
//                    System.out.println("3.Display list facility maintenance");
//                    System.out.println("4.Return main menu");
//                    int choice3 = sc.nextInt();
//                    switch (choice3) {
//                        case 1:
//                            facilityService.displayList();
//                            break;
//
//                        case 2:
//                            facilityService.addNew();
//                            break;
//
//                        case 3:
//                            facilityService.displayListMaintenance();
//                            break;
//
//                        case 4:
//                            displayMainMenu();
//                            break;
//
//                        default:
//                            System.err.println("False input. Please retry.");
//                    }

                    break;
                case 4:
                    BookingController.caSe4();
//                    System.out.println("1.Add new booking");
//                    System.out.println("2.Display list booking");
//                    System.out.println("3.Create new constracts");
//                    System.out.println("4.Display list contracts");
//                    System.out.println("5.Edit contracts");
//                    System.out.println("6.Return main menu");
                    break;

                case 5:
                    PromotionController.caSe5();
//                    System.out.println("1.Display list customers use service" +
//                    "\n" + "2.Display list customers get voucher" +
//                    "\n" + "3.Return main menu");
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Chọn sai,vui lòng chọn lại");
                    FuramaController.displayMainMenu();
            }
        }

    }

//    public static void main(String[] args) {
//        displayMainMenu();
//    }

}
