package _21_case_study.controllers;

import _21_case_study.libs.CheckChoice;
import _21_case_study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    static Scanner sc = new Scanner(System.in);

    public static void caSe1() {

            EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
            System.out.println("1.Display list employees");
            System.out.println("2.Edit employee");
            System.out.println("3.Add new employee");
            System.out.println("4.Return main menu");

//            int choiceOne = sc.nextInt();

        int choiceOne = CheckChoice.checkIntException();
            switch (choiceOne) {
                case 1:
                    employeeService.displayList();
//                EmployeeServiceImpl.disPlayList();  sao ko xài dc??,nếu muốn xài phải chỉnh kiểu sao
                    break;

                case 2:
                    employeeService.editEmployee();
                    break;

                case 3:
                    employeeService.addNew();
                    break;

                case 4:
                    FuramaController.displayMainMenu();
                    break;

                default:
                    System.err.println("Vui lòng nhập sô nguyên từ 1 đến 4");
            }

    }
}
