package _10_dsa_danhsach.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> listInteger1 = new MyList<String>(5);
//        Test tạo mảng mới với capacity: 5

        listInteger1.add(0, "value 1");
        listInteger1.add(1, "value 2");
        listInteger1.add(2, null);

        //test get():nhập vào chỉ số lấy ra giá trị
        System.out.println(listInteger1.get(0));
//        ket qua ra:value 1
//        System.out.println(listInteger1.get(-1));
//        ket qua ra:Exception in thread "main"
//        java.lang.IndexOutOfBoundsException: index: -1, size:3
//        System.out.println(listInteger1.get(3));
//        bôi dòng 16 trên kết quả se ra:
//        Exception in thread "main" java.lang.
//        IndexOutOfBoundsException: index: 3, size:3

        //test method clone: sao chép arrayList hiện tại sang arrayList mới
        System.out.println("in ra mảng clone");
        MyList<String> list2 = listInteger1.clone();
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        //test remove(): xóa
//        listInteger1.remove(1);
        System.out.println(listInteger1.remove(1));
        System.out.println(listInteger1.size());
//        ket qua chay ra value 2
//        sau do ra 2
//        dong tren la hien ra gia tri xóa,dòng dưới là hiện ra size


        //test indexOf(), contains():
        System.out.println(listInteger1.indexOf("value 3"));
        System.out.println(listInteger1.contains("value 3"));

        //test boolean add():
        System.out.println(listInteger1.add("value add"));
        //test clear():
        System.out.println("sau khi clear: ");
        list2.clear();
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
    }

    }



