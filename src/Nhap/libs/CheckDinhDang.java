package _21_case_study.libs;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckDinhDang {
    public static Scanner sc = new Scanner(System.in);
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
            villaCode = sc.nextLine();

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
            houseCode = sc.nextLine();

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
            roomCode = sc.nextLine();

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

//   -	Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường,-	 Kiểu thuê, Tiêu chuẩn
//   phòng chuẩn hóa dữ liệu giống tên dịch vu

    public static String serviceName() {
        String regex = "^[A-Z][a-zA-Z0-9]+$";
        boolean check = false;
        String name = null;
        while (!check) {
//            name = Choice.inputOutput("Enter util name: ");

            System.out.println("Enter util name:");
            name = sc.nextLine();

            if (Pattern.matches(regex, name)) {
                check = true;
            } else {
                System.err.println("Service name must start with a capital letter . Please enter in correct format!");
            }
        }
        return name;
    }

//    -	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2:

    public static String dienTichHoBoi() {
        String stringArea = "";
        int area = 0;
        boolean check = false;
        while (!check) {
            stringArea = sc.nextLine();
            try {
                area = Integer.parseInt(stringArea);
            } catch (NumberFormatException e) {
                System.err.println("Input number only");
            }
            if (area < 30) {
                System.err.println("Input false. Retry.");
            } else {
                System.out.println("Success.");
                check = true;
            }
        }
        return stringArea;
    }

//    -	Chi phí thuê phải là số dương,-	Số tầng phải là số nguyên dương.

    public static String chiPhiVaSoTang() {
        String stringPrice = "";
        double price = 0;
        boolean check = false;
        while (!check) {
            stringPrice = sc.nextLine();
            try {
                price = Integer.parseInt(stringPrice);
            } catch (NumberFormatException e) {
                System.err.println("Input number only");
            }
            if (price <= 0) {
                System.err.println("Input false. Retry.");
            } else {
                System.out.println("Success.");
                check = true;
            }
        }
        return stringPrice;
    }

// -	Số lượng người tối đa phải >0 và nhỏ hơn <20

    public static String soLuongNguoi() {
        String stringCapacity = "";
        int capacity = 0;
        boolean check = false;
        while (!check) {
            stringCapacity = sc.nextLine();
            try {
                capacity = Integer.parseInt(stringCapacity);
            } catch (NumberFormatException e) {
                System.err.println("Input number only");
            }
            if (capacity <= 0 || capacity > 20) {
                System.err.println("Input false. Retry.");
            } else {
                System.out.println("Success.");
                check = true;
            }
        }
        return stringCapacity;
    }

//    -	Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi và
//    phải đúng định dạng dd/mm/YYYY (sử dụng User Exception)


    public static String ngaySinh() {
        String legalRegex = "^\\d{2}[/]\\d{2}[/]\\d{4}$";
        boolean check = false;
        String stringDob = "";
        int day = 0;
        int month = 0;
        int year = 0;
        while (!check) {
            stringDob = sc.nextLine();
            if (stringDob.length() > 10) {
                System.err.println("Wrong format. Retry");
            } else if (stringDob.length() < 10) {
                System.err.println("Wrong format. Retry");
            } else {
                String[] arrDob = stringDob.split("/");
                try {
                    day = Integer.parseInt(arrDob[0]);
                    month = Integer.parseInt(arrDob[1]);
                    year = Integer.parseInt(arrDob[2]);
                } catch (NumberFormatException e) {
                    System.err.println("Input number only");
                }
                check = Pattern.matches(legalRegex, stringDob);
                LocalDate currentDate = LocalDate.now();
// hàm trên trả về ngay

                if (check) {
                    if ((day > 0) && (day <= 31) && (month > 0) && (month <12) && (year > (currentDate.getYear() - 100))
                            && (year <= ( currentDate.getYear()-18))) {
                        if(month==2) {
                            if(day<=29) {
                                System.out.println("Success.");
                                check = true;
                            }
                            else {
                                System.out.println("tháng 2 không duoc quá 29 ngày");
                                check=false;
                            }

                        } else {
                            System.out.println("Success.");
                            check = true;

                        }

                    }


                    else {
                        System.err.println("Input false. Retry");
                        check = false;
                    }
                } else {
                    System.err.println("Input false. Retry");
                }
            }
        }
        return stringDob;
    }
}


