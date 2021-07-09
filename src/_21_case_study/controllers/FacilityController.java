package _21_case_study.controllers;

import _21_case_study.libs.CheckChoice;
import _21_case_study.services.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityController {
    static Scanner sc = new Scanner(System.in);
    public static void caSe3() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("1.Display list facility");
        System.out.println("2.Add new facility");
        System.out.println("3.Display list facility maintenance");
        System.out.println("4.Return main menu");
        System.out.println("");
        System.out.println("Vui lòng chọn số tương ứng với chức năng muốn sử dụng");

//        int choice3 = sc.nextInt();
        int choice3 = CheckChoice.checkIntException();
        switch (choice3) {
            case 1:
                facilityService.displayList();
                break;
            case 2:
                System.out.println("Chọn số tương ứng với mục bạn muốn thêm vào: ");
                System.out.println("1) Add new villa");
                System.out.println("2) Add new house");
                System.out.println("3) Add new room");
                System.out.println("4) Back to menu");
                facilityService.addNew();
                break;
            case 3:
                facilityService.displayListMaintenance();
                break;
            case 4:
                FuramaController.displayMainMenu();
                break;

            default:
                System.err.println("False input. Please retry.");
        }



    }
}
