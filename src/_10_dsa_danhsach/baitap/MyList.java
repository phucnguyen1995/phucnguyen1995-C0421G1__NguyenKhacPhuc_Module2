package _10_dsa_danhsach.baitap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    //constructor K tham số
    public MyList() {
        System.out.println("Khởi tạo list bằng Constructor khoog tham số");
        elements = new Object[DEFAULT_CAPACITY];
    }


    //constructor có tham số:
    public MyList(int capacity) {
        if (capacity > 0) {
            System.out.println("Test tạo mảng mới với capacity: " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Test throw ok!");
            throw new IllegalArgumentException("capacity = " + capacity);
        }
    }

    //    Hàm add
    public void add(int index, E e) {
        if (size == elements.length) {
            this.ensureCapacity(1);
        }
        for (int i = size - 1; i >= index; i--) {
            elements[size + 1] = elements[size];
        }
        elements[index] = e;// NOTE!!!!: PHẢI KHAI BÁO ĐÚNG Object của thư viện java.lang, nếu gọi nhầm Object của thư viện khác
        size++;             // --> sẽ báo lỗi: kiểu dữ "provide: E, require: Object"
    }

    //check  và tăng độ dài mảng:bo tro cho ham add
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("khởi tạo thành công với kích thước mới:" + newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    //hàm xóa:
    public E remove(int index) {
        checkIndexException(index);
        E removeElement = (E) elements[index];  //phải khởi tạo temp = null, nếu chỉ để "Object temp;" --> Lỗi, vì trong block, biến k đc gán giá trị mặc định
        if (elements[index] == null) {
            System.out.println("không có gì để xoa");
        } else {
//            temp = elements[index];
            elements[index] = null;
            for (int i = index; i < size - 1; i++) {
                elements[index] = elements[index + 1]; //Dồn mảng sau khi xóa
            }
            size--;
//            size trừ trừ chưa hiểu lắm,cần hỏi lại
        }
        return removeElement;
    }

    public void checkIndexException(int index) {
//    checkIndexException:kiểm tra Ngoại lệ

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size:" + size);
        }
    }



    //hàm size():
    public int size() {
        return size;
    }

    //hàm clone(): sao chép arrayList hiện tại sang arrayList mới
    public MyList<E> clone() {
        MyList<E> cloneElements = new MyList<>();
        cloneElements.elements = Arrays.copyOf(elements, size);
        cloneElements.size = size;
        return cloneElements;
    }

    //ham contains:
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    //ham indexOf:
    public int indexOf(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return i;
        return -1;
    }

    // hàm add(E e):
    public boolean add(E e) {
        if (size == elements.length) {
            this.ensureCapacity(1);
        }
        elements[size++] = e;
        size++;
        return true;
    }

    //hàm get:
    public E get(int i) {
        this.checkIndexException(i);
        return (E) elements[i];
    }
//
//    public void checkIndexException(int index) {
////    checkIndexException:kiểm tra Ngoại lệ
//
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("index: " + index + ", size:" + size);
//        }
//    }
//



    //hàm clear:
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }


}
