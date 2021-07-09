package _21_case_study.libs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckDinhDang {
    public static Scanner sc=new Scanner(System.in);
    //    -	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
    //    -Nếu là Villa thì XX sẽ là VL
    //    -Nếu là House thì XX sẽ là HO
    //    -	Nếu Room thì XX sẽ là RO

    public static String villaCode() {
        String regex = "^(SVVL)-[0-9]{4}$";
        boolean check = false;
        String villaCode = null;
        while (!check) {
            System.out.println("Enter villa service code: ");
            villaCode=sc.nextLine();

//            villaCode = QuickInOut.inputOutput("Enter villa service code: ");

            if (Pattern.matches(regex, villaCode)) {
                check = true;
                System.out.println("ok");
            } else {
                System.err.println("Villa code must be in the format: 'SVVL-XXXX', where X is a number from 0-9");
            }
        }
        return villaCode;
    }

    public static String houseCode() {
        String regex = "^(SVHO)-[0-9]{4}$";
        boolean check = false;
        String houseCode = null;
        while (!check) {
            System.out.println("Enter house code:");
            houseCode=sc.nextLine();

//            houseCode = QuickInOut.inputOutput("Enter house code: ");

            if (Pattern.matches(regex, houseCode)) {
                check = true;
                System.out.println("ok");
            } else {
                System.err.println("House code must be in the format: 'SVHO-XXXX', where X is a number from 0-9");
            }
        }
        return houseCode;
    }

    public static String roomCode() {
        String regex = "^(SVRO)-[0-9]{4}$";
        boolean check = false;
        String roomCode = null;
        while (!check) {
            System.out.println("Enter room code:");
            roomCode=sc.nextLine();

//            roomCode = QuickInOut.inputOutput("Enter room code: ");

            if (Pattern.matches(regex, roomCode)) {
                check = true;
                System.out.println("ok");
            } else {
                System.err.println("Room code must be in the format: 'SVRO-XXXX', where X is a number from 0-9");
            }
        }
        return roomCode;
    }

}
