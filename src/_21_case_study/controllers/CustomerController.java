package _21_case_study.controllers;

import _21_case_study.libs.CheckChoice;
import _21_case_study.services.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    static Scanner sc = new Scanner(System.in);
    public static void caSe2() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        System.out.println("1.Display list customers");
        System.out.println("2.Edit customer");
        System.out.println("3.Add new customer");
        System.out.println("4.Return main menu");

//        int choiceTwo = sc.nextInt();
        int choiceTwo = CheckChoice.checkIntException();
        switch (choiceTwo) {
            case 1:
                customerService.displayList();
                break;

            case 2:
                customerService.editCustomer();
                break;

            case 3:
                customerService.addNew();
                break;

            case 4:
//                displayMainMenu();
//                copy qua và sửa lại thành:
                FuramaController.displayMainMenu();
                break;

            default:
                System.err.println("Vui lòng nhập sô nguyên từ 1 đến 4");
        }
    }
}
