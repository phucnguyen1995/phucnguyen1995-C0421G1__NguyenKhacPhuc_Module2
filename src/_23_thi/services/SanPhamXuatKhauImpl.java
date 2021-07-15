package _23_thi.services;

import _23_thi.libs.CheckChoice;
import _23_thi.model.SanPhamNhapKhau;
import _23_thi.model.SanPhamXuatKhau;
import _23_thi.utils.ReadAndWriteByteStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamXuatKhauImpl implements SanPhamXuatKhauService {
    static Scanner sc = new Scanner(System.in);
    private static List<SanPhamXuatKhau> xuatKhaus = new ArrayList<>();

    ReadAndWriteByteStream<SanPhamXuatKhau> readAndWrite = new ReadAndWriteByteStream<>();
    static final String path = "src\\_23_thi\\data\\SanPhamXuatKhau.csv";


    @Override
    public void addNew() {
        xuatKhaus = readAndWrite.readFileByteStream(path);
        int id = 0;
        if (xuatKhaus.isEmpty()) {
            id = 1;
        } else {
            id = xuatKhaus.get(xuatKhaus.size() - 1).getId() + 1;
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

        System.out.println("giá xuât khẩu");
        int giaXuatKhau = CheckChoice.soNguyen();

        System.out.println("Quốc gia nhâp sản phẩm");
        String quocGia = sc.nextLine();


        SanPhamXuatKhau newSanPham = new SanPhamXuatKhau(id, code, name, gia, soLuong, nhaXuatBan, giaXuatKhau, quocGia);
        xuatKhaus.add(newSanPham);
        System.out.println("Bạn đã nhập dữ liệu thành công ");
        readAndWrite.writeFileByteStream(xuatKhaus, path);

    }

    @Override
    public void xoa() {
        xuatKhaus = readAndWrite.readFileByteStream(path);
        if (!xuatKhaus.isEmpty()) {
            System.out.println("Nhập id muốn xóa");
            int id = sc.nextInt();
            boolean check4 = false;
            for (int i = 0; i < xuatKhaus.size(); i++) {
                if (id == xuatKhaus.get(i).getId()) {
                    check4 = true;
                    xuatKhaus.remove(i);
                    break;
                }
            }
            if (check4) {
                System.out.println("bạn đã xóa thành công");
            } else {
                System.out.println("id bạn nhập không tồn tại");
            }
            readAndWrite.writeFileByteStream(xuatKhaus, path);
        }

    }

    @Override
    public void displayList() {
        xuatKhaus = readAndWrite.readFileByteStream(path);
        for (SanPhamXuatKhau e : xuatKhaus) {
            System.out.println(e.toString());
        }

    }

    @Override
    public void timKiem() {
        xuatKhaus = readAndWrite.readFileByteStream(path);
        if (!xuatKhaus.isEmpty()) {
            System.out.println("Nhập id muốn tìm");
            int id = sc.nextInt();
            boolean check4 = false;
            for (int i = 0; i < xuatKhaus.size(); i++) {
                if (id == xuatKhaus.get(i).getId()) {
                    check4 = true;
                    break;
                }
            }
            if (check4) {
                System.out.println("sản phẩm bạn muốn tìm là" + xuatKhaus.get(id));
            } else {
                System.out.println("id bạn nhập không tồn tại");
            }
            readAndWrite.writeFileByteStream(xuatKhaus, path);
        }

    }
//
//    @Override
//    public void thoat() {
//
//    }
}
