package _16_io_text_file.thuchanh;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Onha {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=null;
        FileInputStream coPy=null;

//        try{
//            dòng 8 và 9 phục vụ cho dòng 60 khi đó dòng 60 sẽ chỉnh lại là:

//
        File file = new File("text.txt");
//        if (file.isFile()) {
//            System.out.println("in ra chữ file có tồn tại");
//            file.delete():nếu file tồn tai ta xóa file
//        } else {
//            System.out.println("in ra chữ file ko tồn tại");
//        }
//        kêt quả chạy đến đây là ra else

//        ta tạo file:
//        file.createNewFile();
//        =>bây giờ thì đã tồn tại file text.txt

//   A     lấy ra đường dẫn của file vừa tạo
//        System.out.println(file.getAbsoluteFile());
//        kết quả chạy :D:\bai_tap_codedym\phucnguyen1995-C0421G1__NguyenKhacPhuc_Module2\text.txt

//   B     xem tổng dung lượng chứa của file vừa tạo
//        System.out.println(file.getTotalSpace());
//        KẾT QUẢ CHẠY SẼ RA:78497144832

//    ...

//        các cách nhập dữ liệu từ bàn phím
//        c1:đã dc học
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập vào số nguyên N");
//        int N=sc.nextInt();

//        c2: ĐA SỐ CHÚNG TA ỨNG DỤNG TRONG PHẦN DỌC DỮ LIỆU TRÊN FILE

//        DataInputStream inputStream=new DataInputStream(System.in);
//        System.out.println("Nhập vào số nguyên N");
//        String N=inputStream.readLine();
//        System.out.println(N);

//        c2':ĐA SỐ CHÚNG TA ỨNG DỤNG TRONG PHẦN DỌC DỮ LIỆU TRÊN FILE

//        DataInputStream inputStream=new DataInputStream(System.in);
//        System.out.println("Nhập vào số nguyên N");
//        int N=Integer.parseInt(inputStream.readLine());
//        System.out.println(N);

//        VÀ CÒN NHIỀU CÁCH CHO NGƯỜI DÙNG NHAOAJ VÀO KHÁC

//        * ĐỌC DỮ LIỆU TỪ FILE
//                        truyên vào trong ("") tên file hoặc dường dẫn:tên file dòng 8 và đường dẫn dòng 24

//        FileInputStream fileInputStream = new FileInputStream("text.txt");
             try {
            fileInputStream = new FileInputStream("text.txt");
//             dùng fileInputStream .   chấm để sử dụng mục đích ta cần
//            fileInputStream.read():đọc từng file 1

            int ch ;
            while ( ( ch = fileInputStream.read() ) != -1 ) {
                System.out.print((char)ch);
              
//                break;

//                dùng break thì sẽ in ra chữ đầu tiên
//                ko dùng sẽ in ra tât cả chữ nếu cú pháp vẫn dữ nguyên là   System.out.println((char)ch);
//                nếu muốn in ra giông hệt ta bỏ đi ln  chỉ còn print
//                -1  kêt thúc file  nếu  ì đọc dc khác -1 thì in ra còn =-1 thì kêt thúc rồi   "kí tự kết thúc" có giá trị là -1
//                này là đọc từng kí tự 1

            }


//        } catch (FileNotFoundException ex) {
        } catch (Exception ex) {
//            dòng 70 là exception cha nên dùng vậy cho an toàn tổng quát ko dùng dòng 69
            Logger.getLogger(Onha.class.getName()).log(Level.SEVERE,null,ex);
        }
        finally {
            if(fileInputStream!=null) {
                try{
                    fileInputStream.close();
                }catch (IOException ex) {
                    Logger.getLogger(Onha.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }





////
//        FileReader reader = null;
//        FileReader writer = null;
//
////              bộ riêng cho file text
//        try {
//            reader = new FileReader("text.txt");
//            writer = new FileReader("textcopy");
//            int ch;
//            while ((ch = reader.read()) != -1) {
//                System.out.println((char) ch);
//                writer.write(ch);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(Onha.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if (reader != null) {
//                reader.close();
//            }
//            if (writer != null) {
//                writer.close();
//            }
//        }
//    }











    }
}
