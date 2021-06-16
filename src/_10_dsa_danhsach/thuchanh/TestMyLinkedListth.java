package _10_dsa_danhsach.thuchanh;

public class TestMyLinkedListth {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedthList ll = new MyLinkedthList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }

//    Bước 7: Chạy chương trình.
//    Với việc gọi phương thức addFist(), add() với
//    các giá trị khác. Hiển thị kết quả.
}
