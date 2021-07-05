package _21_case_study.services;

import _21_case_study.models.Customer;

import _21_case_study.utils.ReadAndWriteByteStream;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {


    static Scanner sc = new Scanner(System.in);

    ReadAndWriteByteStream<Customer> readAndWriteByteStream = new ReadAndWriteByteStream<>();
    private static final String filePath ="src\\_21_case_study\\data\\Customer.csv";

    public static List<Customer> customers = new LinkedList<>();

    String[] loaiKhachHangArr = {"Diamond", "Platinium", "Gold", "Silver", "Member"};

    @Override
    public void displayList() {
        if (customers.isEmpty()) {
            System.out.println("Danh sách đang trống");
        } else {
            getAll2();
            for (Customer hienThi : customers) {
                System.out.println(hienThi);

            }
        }


    }

    public List getAll2() {
        customers = readAndWriteByteStream.readFileByteStream(filePath);
        return customers;
    }


    @Override
    public void editCustomer() {
        if (customers.isEmpty()) {
            System.out.println("Danh sách đang trống");
        } else {
            System.out.println("Vui lòng chọn khách hàng muốn chỉnh sửa");
            boolean isTrueCode = false;
            while (!isTrueCode) {
                System.out.println("Nhập mã khách hàng bạn muốn sửa: ");
                int input = Integer.parseInt(sc.nextLine());
                boolean isExist = false;
                int index = 0;
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).getCode() == input) {
                        isExist = true;
                        index = i;
                        break;
                    }
                }

                if (!isExist) {
                    System.err.println("Mã bạn nhập không tồn tại,vui lòng nhập lại nhé");
                } else {
                    isTrueCode = true;
                    System.out.println(customers.get(index).toString());
                    System.out.println("Nhập vào số tương ứng với mục muốn chỉnh sửa ");
                    System.out.println("1 Sửa tên");
                    System.out.println("2 Sửa ngày tháng năm sinh");
                    System.out.println("3 Sửa giới tính");
                    System.out.println("4 Sửa gmail");
                    System.out.println("5 Sửa số chứng minh nhân dân");
                    System.out.println("6 Sửa sô điện thoại");
                    System.out.println("7 Sửa loại khách hàng");
                    System.out.println("8 Sửa địa chỉ ");
                    System.out.println("9 Quay lại menu lớn");
                    int empChoice = Integer.parseInt(sc.nextLine());
                    switch (empChoice) {
                        case 1:
                            System.out.println("Vui lòng nhập lại tên ban muốm sửa ");
                            String newName = sc.nextLine();
                            customers.get(index).setName(newName);
                            break;

                        case 2:
                            System.out.println("Vui lòng nhập lại ngày tháng năm sinh ban muốm sửa ");
                            String newDob = sc.nextLine();
                            customers.get(index).setDayOfBirth(newDob);
                            break;

                        case 3:
                            System.out.println("Vui lòng nhập lại giới tính ban muốm sửa ");
                            String newSex = sc.nextLine();
                            customers.get(index).setSex(newSex);
                            break;

                        case 4:
                            System.out.println("Vui lòng nhập lại gmail ban muốm sửa ");
                            String newEmail = sc.nextLine();
                            customers.get(index).setEmail(newEmail);
                            break;

                        case 5:
                            System.out.println("Vui lòng nhập lại số CMND ban muốm sửa ");
                            int newIdNumb = Integer.parseInt(sc.nextLine());
                            customers.get(index).setIdNumber(newIdNumb);
                            break;

                        case 6:
                            System.out.println("Vui lòng nhập lại số điện thoại ban muốm sửa ");
                            String newPhone = sc.nextLine();
                            customers.get(index).setPhoneNumber(newPhone);
                            break;

                        case 7:

                            System.out.println("Vui lòng chọn lựa chọn số nguyên từ 0 đến 4 tương ứng loại khách hàng muốn sửa");
                            for (int i = 0; i < loaiKhachHangArr.length; i++) {
                                System.out.println(i + " " + loaiKhachHangArr[i]);
                            }
                            String newType = "";
                            boolean checkEdit= false;
                            while (!checkEdit) {
                                int choiceType = Integer.parseInt(sc.nextLine());
                                switch (choiceType) {
                                    case 0:
                                        checkEdit = true;
                                        newType = loaiKhachHangArr[0];
                                        break;
                                    case 1:
                                        checkEdit = true;
                                        newType = loaiKhachHangArr[1];
                                        break;
                                    case 2:
                                        checkEdit = true;
                                        newType = loaiKhachHangArr[2];
                                        break;
                                    case 3:
                                        checkEdit = true;
                                        newType = loaiKhachHangArr[3];
                                        break;
                                    case 4:
                                        checkEdit = true;
                                        newType = loaiKhachHangArr[4];
                                        break;
                                    default:
                                        System.err.println("Vui lòng chọn lựa chọn số nguyen từ 0 đến 4");
                                }
                            }
                            customers.get(index).setType(newType);
                            break;

                        case 8:
                            System.out.println("Nhập địa chỉ khách hàng: ");
                            String newAddress = sc.nextLine();
                            customers.get(index).setAddress(newAddress);
                            break;

                        case 9:
                            return;

                        default:
                            System.err.println("Vui lòng chỉ nhập số nguyên tù 1 đến 9");
                    }
                }
            }
            readAndWriteByteStream.clearData(filePath);
            readAndWriteByteStream.writeFileByteStream(customers,filePath);

        }
    }



    @Override
    public void addNew() {
        System.out.println("Nhập mã khách hàng muốn thêm: ");
        int code = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên khách hàng  muốn thêm: ");
        String name = sc.nextLine();

        System.out.println("Nhập ngày tháng năm sinh khách hàng  muốn thêm:  ");
        String dayOfBirth = sc.nextLine();

        System.out.println("Nhập giơi tính khách hàng  muốn thêm: ");
        String sex = sc.nextLine();

        System.out.println("Nhập địa chỉ mail khách hàng  muốn thêm: ");
        String email = sc.nextLine();

        System.out.println("Nhập số CMND khách hàng  muốn thêm: ");
        int idNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập sô điện thoại khách hàng  muốn thêm: ");
        String phone = sc.nextLine();

        System.out.println("Nhập địa chỉ khách hàng muốn thêm: ");
        String address = sc.nextLine();

        System.out.println("Vui lòng chọn lựa chọn số nguyên từ 0 đến 4 tương ứng loại khách hàng muốn sửa");
        for (int i = 0; i < loaiKhachHangArr.length; i++) {
            System.out.println(i + " " + loaiKhachHangArr[i]);
        }
        String type = "";
        boolean isTrue = false;
        while (!isTrue) {
            int choiceType = Integer.parseInt(sc.nextLine());
            switch (choiceType) {
                case 0:
                    isTrue = true;
                    type = loaiKhachHangArr[0];
                    break;
                case 1:
                    isTrue = true;
                    type = loaiKhachHangArr[1];
                    break;
                case 2:
                    isTrue = true;
                    type = loaiKhachHangArr[2];
                    break;
                case 3:
                    isTrue = true;
                    type = loaiKhachHangArr[3];
                    break;
                case 4:
                    isTrue = true;
                    type = loaiKhachHangArr[4];
                    break;
                default:
                    System.err.println("Vui lòng chọn lựa chọn số nguyen từ 0 đến 4");
            }
        }



        Customer newCustomer = new Customer(code, name, dayOfBirth, sex, email, idNumber, phone, type, address);
        customers.add(newCustomer);
        System.out.println("Bạn đã nhập dữ liệu thành công");
        readAndWriteByteStream.writeFileByteStream(customers,filePath);
    }




}
