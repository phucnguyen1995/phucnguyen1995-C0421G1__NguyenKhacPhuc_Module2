package _21_case_study.services;

import _21_case_study.models.Employee;
import _21_case_study.utils.ReadAndWriteByteStream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    static Scanner sc = new Scanner(System.in);

    ReadAndWriteByteStream<Employee>  readAndWriteByteStream = new ReadAndWriteByteStream<>();
    private static final String filePath ="src\\\\_21_case_study\\\\data\\\\Employee.csv";

//    File file=new File(" src\\_21_case_study\\data\\Employee.csv");

    public static List<Employee> employees = new ArrayList<>();
//     ReadAndWriteByteStream<Employee> employeeReadAndWriteByteStream = new ReadAndWriteByteStream<>();
    String[] trinhDoArr = {"Đại học", "Cao đẳng", "Trung cấp", "Sau đại học"};
    String[] viTriArr = {"Lễ tân", "Người phục vụ", "Chuyên viên", "Giám sát", "Người quản lý", "Giám đốc"};

    @Override
    public void  displayList() {
        if (employees.isEmpty()) {
            System.out.println("Danh sách đang trống");
        } else {
            getAll1();
            for (Employee hienThi : employees) {
                System.out.println(hienThi);

            }
        }


    }

    public List getAll1() {
        employees = readAndWriteByteStream.readFileByteStream(filePath);
        return employees;
    }




    @Override
    public void editEmployee() {
        if (employees.isEmpty()) {
            System.out.println("Danh sách đang trống");
        } else {

            System.out.println("Vui lòng chọn nhân viên muốn chỉnh sửa");
            boolean isTrueCode = false;
            while (!isTrueCode) {
                System.out.println("Nhập mã nhân viên bạn muốn sửa: ");
                int input = Integer.parseInt(sc.nextLine());
                boolean isExist = false;
                int index = 0;
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).getCode() == input) {
                        isExist = true;
                        index = i;
                        break;
                    }
                }
                if (!isExist) {
                    System.err.println("Mã bạn nhập không tồn tại,vui lòng nhập lại nhé");
                } else {
                    isTrueCode = true;
                    System.out.println(employees.get(index).toString());
                    System.out.println("Nhập vào số tương ứng với mục muốn chỉnh sửa ");
                    System.out.println("1 Sửa tên");
                    System.out.println("2 Sửa ngày tháng năm sinh");
                    System.out.println("3 Sửa giới tính");
                    System.out.println("4 Sửa gmail");
                    System.out.println("5 Sửa số chứng minh nhân dân");
                    System.out.println("6 Sửa sô điện thoại");
                    System.out.println("7 Sửa vị trí");
                    System.out.println("8 Sửa tiền lương ");
                    System.out.println("9 Sửa trình dộ");
                    System.out.println("10 Quay lại menu lớn");
                    int empChoice = Integer.parseInt(sc.nextLine());
                    switch (empChoice) {
                        case 1:
                            System.out.println("Vui lòng nhập lại tên ban muốm sửa ");
                            String newName = sc.nextLine();
                            employees.get(index).setName(newName);
                            break;

                        case 2:
                            System.out.println("Vui lòng nhập lại ngày tháng năm sinh ban muốm sửa ");
                            String newDob = sc.nextLine();
                            employees.get(index).setDayOfBirth(newDob);
                            break;

                        case 3:
                            System.out.println("Vui lòng nhập lại giới tính ban muốm sửa ");
                            String newSex = sc.nextLine();
                            employees.get(index).setSex(newSex);
                            break;

                        case 4:
                            System.out.println("Vui lòng nhập lại gmail ban muốm sửa ");
                            String newEmail = sc.nextLine();
                            employees.get(index).setEmail(newEmail);
                            break;

                        case 5:
                            System.out.println("Vui lòng nhập lại số CMND ban muốm sửa ");
                            int newIdNumb = Integer.parseInt(sc.nextLine());
                            employees.get(index).setIdNumber(newIdNumb);
                            break;

                        case 6:
                            System.out.println("Vui lòng nhập lại số điện thoại ban muốm sửa ");
                            String newPhone = sc.nextLine();
                            employees.get(index).setPhoneNumber(newPhone);
                            break;

                        case 7:

                            System.out.println("Vui lòng chọn lựa chọn số từ 0 đến 3 tương ứng vị trí của nhân viên muốn sửa");
                            for (int i = 0; i < viTriArr.length; i++) {
                                System.out.println(i + " " + viTriArr[i]);
                            }
                            String viTriEdit = "";
                            boolean checkEditViTri = false;
                            while (!checkEditViTri) {
                                int choicePos = Integer.parseInt(sc.nextLine());
                                switch (choicePos) {
                                    case 0:
                                        checkEditViTri = true;
                                        viTriEdit = viTriArr[0];
                                        break;
                                    case 1:
                                        checkEditViTri = true;
                                        viTriEdit = viTriArr[1];
                                        break;
                                    case 2:
                                        checkEditViTri = true;
                                        viTriEdit = viTriArr[2];
                                        break;
                                    case 3:
                                        checkEditViTri = true;
                                        viTriEdit = viTriArr[3];
                                        break;
                                    case 4:
                                        checkEditViTri = true;
                                        viTriEdit = viTriArr[4];
                                        break;
                                    case 5:
                                        checkEditViTri = true;
                                        viTriEdit = viTriArr[5];
                                        break;
                                    default:
                                        System.err.println("Vui lòng chọn lựa chọn số từ 0 đến 5");
                                }
                            }


                            employees.get(index).setPosition(viTriEdit);
                            break;

                        case 8:
                            System.out.println("Vui lòng nhập vào lương bạn muốn sửa ");
                            double newSalary = Integer.parseInt(sc.nextLine());
                            employees.get(index).setSalary(newSalary);
                            break;

                        case 9:
                            System.out.println("Vui lòng chọn lựa chọn số từ 0 đến 3 tương ứng trình dộ của nhân viên muốn sửa");
                            for (int i = 0; i < trinhDoArr.length; i++) {
                                System.out.println(i + " " + trinhDoArr[i]);
                            }
                            String trinhDoEdit = "";
                            boolean checkEditTrinhDo = false;
                            while (!checkEditTrinhDo) {
                                int choiceQual = Integer.parseInt(sc.nextLine());
                                switch (choiceQual) {
                                    case 0:
                                        checkEditTrinhDo = true;
                                        trinhDoEdit = trinhDoArr[0];
                                        break;
                                    case 1:
                                        checkEditTrinhDo = true;
                                        trinhDoEdit = trinhDoArr[1];
                                        break;
                                    case 2:
                                        checkEditTrinhDo = true;
                                        trinhDoEdit = trinhDoArr[2];
                                        break;
                                    case 3:
                                        checkEditTrinhDo = true;
                                        trinhDoEdit = trinhDoArr[3];
                                        break;
                                    default:
                                        System.err.println("Vui lòng chỉ nhập số nguyên tù 0 đến 3");
                                }
                            }

                        case 10:
                            return;

                        default:
                            System.err.println("Vui lòng chỉ nhập số nguyên tù 1 đến 10");
                    }
                }
            }

            readAndWriteByteStream.clearData(filePath);
            readAndWriteByteStream.writeFileByteStream(employees,filePath);
        }



    }





    @Override
    public void addNew() {
        System.out.println("Nhập mã nhân viên muốn thêm: ");
        int code = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên nhân viên muốn thêm: ");
        String name = sc.nextLine();

        System.out.println("Nhập ngày tháng năm sinh nhân viên muốn thêm:  ");
        String dayOfBirth = sc.nextLine();

        System.out.println("Nhập giơi tính nhân viên muốn thêm: ");
        String sex = sc.nextLine();

        System.out.println("Nhập địa chỉ mail nhân viên muốn thêm: ");
        String email = sc.nextLine();

        System.out.println("Nhập số CMND nhân viên muốn thêm: ");
        int idNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập sô điện thoại nhân viên muốn thêm: ");
        String phone = sc.nextLine();

        System.out.println("Nhập tiền lương nhân viên muốn thêm: ");
//        double salary = Integer.parseInt(sc.nextLine());
        double salary = Double.parseDouble(sc.nextLine());

        System.out.println("Vui lòng chọn lựa chọn số từ 0 đến 3 tương ứng trình dộ của nhân viên muốn thêm");
        for (int i = 0; i < trinhDoArr.length; i++) {
            System.out.println(i + " " + trinhDoArr[i]);
        }
        String trinhDoAdd = "";
        boolean checkAddTrinhDo = false;
        while (!checkAddTrinhDo) {
            int choiceQual = Integer.parseInt(sc.nextLine());
            switch (choiceQual) {
                case 0:
                    checkAddTrinhDo = true;
                    trinhDoAdd = trinhDoArr[0];
                    break;
                case 1:
                    checkAddTrinhDo = true;
                    trinhDoAdd = trinhDoArr[1];
                    break;
                case 2:
                    checkAddTrinhDo = true;
                    trinhDoAdd = trinhDoArr[2];
                    break;
                case 3:
                    checkAddTrinhDo = true;
                    trinhDoAdd = trinhDoArr[3];
                    break;
                default:
                    System.err.println("Vui lòng chỉ nhập số nguyên tù 0 đến 3");
            }
        }


        System.out.println("Vui lòng chọn lựa chọn số từ 0 đến 5 tương ứng vị trí của nhân viên muốn thêm");
        for (int i = 0; i < viTriArr.length; i++) {
            System.out.println(i + " " + viTriArr[i]);
        }
        String viTriAdd = "";
        boolean checkAddViTri = false;
        while (!checkAddViTri) {
            int choicePos = Integer.parseInt(sc.nextLine());
            switch (choicePos) {
                case 0:
                    checkAddViTri = true;
                    viTriAdd = viTriArr[0];
                    break;
                case 1:
                    checkAddViTri = true;
                    viTriAdd = viTriArr[1];
                    break;
                case 2:
                    checkAddViTri = true;
                    viTriAdd = viTriArr[2];
                    break;
                case 3:
                    checkAddViTri = true;
                    viTriAdd = viTriArr[3];
                    break;
                case 4:
                    checkAddViTri = true;
                    viTriAdd = viTriArr[4];
                    break;
                case 5:
                    checkAddViTri = true;
                    viTriAdd = viTriArr[5];
                    break;
                default:
                    System.err.println("Vui lòng chọn lựa chọn số từ 0 đến 5");
            }
        }

        Employee newEmployee = new Employee(code, name, dayOfBirth, sex, email, idNumber, phone, viTriAdd, trinhDoAdd, salary);
        employees.add(newEmployee);
        System.out.println("Bạn đã nhập dữ liệu thành công ");
        readAndWriteByteStream.writeFileByteStream(employees,filePath);

    }


}
