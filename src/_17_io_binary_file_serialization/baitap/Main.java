package _17_io_binary_file_serialization.baitap;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CacHam object = new CacHam();
        List<Product> products = new ArrayList<>();
        products.add(new Product("2b", "Banh", 25000));
        products.add(new Product("3c", "keo", 15000));
        products.add(new Product("4d", "giay", 84000));
        //tạo file
        File file = new File("src\\_17_io_binary_file_serialization\\baitap\\test.csv");
//        goi ham write
        object.writeToFile(file,products);

//        gọi hàm đọc
        List<Product> result = object.readFile(file); //đã ép kiểu trong hàm
        for (Product element: result) {
            System.out.println(element);
        }


//        //goi ham search()
        object.searchProductByName(file);
    }
}
