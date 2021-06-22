package _12_java_collection_framework.baitap;

import java.util.*;

public class ProductManagerArrayList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Product product1 = new Product(1, "Bánh", 5000);
        Product product2 = new Product(3, "Kẹo", 2500);
        Product product3 = new Product(6, "Dép", 12000);
        Product product4 = new Product(4, "lọ hoa", 25000);

        List<Product> products = new ArrayList<>();
        System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--------");
        while (true) {
            System.out.println("1.Hiển thị danh sách sản phẩm");
            System.out.println("2.Hiển thị danh sách sắp xếp theo tên abc");
            System.out.println("3.Hiển thị sắp xếp theo giá");
            System.out.println("4.Thêm sản phẩm");
            System.out.println("5.sửa sản phẩm qua cách nhập id");
            System.out.println("6.Xóa sản phẩm qua id");
            System.out.println("7.Tìm sản phẩm bằng tên");
            System.out.println("8.Thoát khoi chuong trinh");
            System.out.println("Chọn chức năng muốn sử dụng");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    display(products);
                    break;
                case 2:
                    displayAbc(products);
                    break;
                case 3:
                    displayGia(products);
                    break;
                case 4:
                    addSanPham(products);
                    break;
                case 5:
                    suaSanPham(products);
                    break;
                case 6:
                    xoaSanPhamTuId(products);
                    break;
                case 7:
                    timSanPham(products);
                    break;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Chọn sai,vui lòng chọn lại");
            }
        }
    }

    public static void display(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("Sản phẩm đang trống,vui lòng thêm sản phâm vào");
        } else {
            for (Product product : products) {
                System.out.println(product.toString());
            }
        }
    }

    public static void displayAbc(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("Sản phẩm đang trống");
        } else {
            products.sort(Product::compareTo);
            System.out.println("sắp xếp sản phẩm theo tên abc ");
            for (Product productabc : products) {
                System.out.println(productabc);
            }
        }
    }

    public static void displayGia(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("Sản phẩm đang trống");
        } else {
            products.sort(Product::compareTo);
            System.out.println("sắp xếp sản phẩm theo giá tiền tăng dần ");
            for (Product productabc : products) {
                System.out.println(productabc);
            }
        }
    }

    public static void addSanPham(List<Product> products) {
        System.out.println("Nhập id cho sản phẩm");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();

        System.out.println("Nhập giá của sản phẩm");
        double price = Double.parseDouble(sc.nextLine());

        Product product = new Product(id, name, price);
        products.add(product);
        System.out.println("Bạn đã thêm sản phẩm thành công");
    }

    public static void suaSanPham(List<Product> products) {
        System.out.println("Nhập id muốn sửa");
        int id = Integer.parseInt(sc.nextLine());

        boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                check = true;

                System.out.println("Nhập id mới cho sản phẩm");
                int idNew = Integer.parseInt(sc.nextLine());

                System.out.println("Nhập tên mới cho sản phẩm");
                String nameNew = sc.nextLine();

                System.out.println("Nhập giá mới cho sản phẩm");
                double priceNew = Double.parseDouble(sc.nextLine());

                Product product = new Product(idNew, nameNew, priceNew);
                products.set(i, product);
                break;
            }
        }
        if (!check) {
            System.out.println("Không tim thấy id này,vui lòng nhập sô 5 và nhập lại id mới");
        }
    }

    public static void xoaSanPhamTuId(List<Product> products) {
        System.out.println("Nhập id sản phẩm muốn xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
                //trả về đối tượng vừa xóa
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("id bạn nhập không tồn tại,vui lòng nhập số 6 và nhập lại id");
        }
    }

    public static void  timSanPham(List<Product> products) {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String nameTim = sc.nextLine();

        boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if (nameTim.equals(products.get(i).getName())) {
                products.get(i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("tên sản phẩm bạn nhập không tồn tại,vui lòng nhập số 6 và nhập lại tên sản phẩm");
        }

    }
}













