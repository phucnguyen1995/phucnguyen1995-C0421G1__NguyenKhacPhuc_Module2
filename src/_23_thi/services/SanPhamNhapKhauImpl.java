package _23_thi.services;

import _23_thi.libs.CheckChoice;
import _23_thi.model.SanPhamNhapKhau;
import _23_thi.utils.ReadAndWriteByteStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamNhapKhauImpl implements SanPhamNhapKhauService {

    static Scanner sc = new Scanner(System.in);
    private static List<SanPhamNhapKhau> nhapKhaus = new ArrayList<>();

    ReadAndWriteByteStream<SanPhamNhapKhau> readAndWrite = new ReadAndWriteByteStream<>();
    static final String path = "src\\_23_thi\\data\\SanPhamNhapKhau.csv";


    @Override
    public void addNew() {
        nhapKhaus = readAndWrite.readFileByteStream(path);
        int id = 0;
        if (nhapKhaus.isEmpty()) {
            id = 1;
        } else {
            id = nhapKhaus.get(nhapKhaus.size() - 1).getId() + 1;
        }
        System.out.println("Mã");
        String code = sc.nextLine();

        System.out.println("Tên ");
        String name = sc.nextLine();

        System.out.println("Gía");
        int gia = CheckChoice.soNguyen();

        System.out.println("Số lương");
        int soLuong = CheckChoice.soNguyen();

        System.out.println("Nhà xuất bản");
        String nhaXuatBan = sc.nextLine();

        System.out.println("giá nhập khâu");
        int giaNhapKhau = CheckChoice.soNguyen();

        System.out.println("tỉnh nhập khẩu");
        String tinhNhapKhau = sc.nextLine();

        System.out.println("thuế nhâp khẩu");
        int thueNhapKhau = CheckChoice.soNguyen();


        SanPhamNhapKhau newSanPham = new SanPhamNhapKhau(id, code, name, gia, soLuong, nhaXuatBan, giaNhapKhau,
                tinhNhapKhau, thueNhapKhau);
        nhapKhaus.add(newSanPham);
        System.out.println("Bạn đã nhập dữ liệu thành công ");
        readAndWrite.writeFileByteStream(nhapKhaus, path);

    }

    @Override
    public void xoa() {
        nhapKhaus = readAndWrite.readFileByteStream(path);
        if (!nhapKhaus.isEmpty()) {
            System.out.println("Nhập id muốn xóa");
            int id = sc.nextInt();
            boolean check4 = false;
            for (int i = 0; i < nhapKhaus.size(); i++) {
                if (id == nhapKhaus.get(i).getId()) {
                    check4 = true;
                    nhapKhaus.remove(i);
                    break;
                }
            }
            if (check4) {
                System.out.println("bạn đã xóa thành công");
            } else {
                System.out.println("id bạn nhập không tồn tại");
            }
            readAndWrite.writeFileByteStream(nhapKhaus, path);
        }

    }

    @Override
    public void displayList() {
        nhapKhaus = readAndWrite.readFileByteStream(path);
        for (SanPhamNhapKhau e : nhapKhaus) {
            System.out.println(e.toString());
        }

    }

    @Override
    public void timKiem() {
        nhapKhaus = readAndWrite.readFileByteStream(path);
        if (!nhapKhaus.isEmpty()) {
            System.out.println("Nhập id muốn tìm");
            int id = sc.nextInt();
            boolean check4 = false;
            for (int i = 0; i < nhapKhaus.size(); i++) {
                if (id == nhapKhaus.get(i).getId()) {
                    check4 = true;
                    break;
                }
            }
            if (check4) {
                System.out.println("sản phẩm bạn muốn tìm là" + nhapKhaus.get(id));
            } else {
                System.out.println("id bạn nhập không tồn tại");
            }
            readAndWrite.writeFileByteStream(nhapKhaus, path);
        }

    }
//
//    @Override
//    public void thoat() {
//
//    }
}
