package _10_dsa_danhsach.baitap;

import java.util.Arrays;

public class MyArrayList<E> {
//    so luong phan tử có trong MyarrayList
    private int size=0;
//    sưc chứa của  MyarrayList
    private static final int DEFAULT_CAPACITY =10;
//    mngr chứa các phần tử
    Object elements[];

    public MyArrayList() {
        elements =new Object[DEFAULT_CAPACITY];
    }

//    phương thức contructor với sức chứa truyền vào capacity
    public MyArrayList(int capacity) {
      if(capacity>=0) {
          elements=new Object[capacity];
      }else {
          throw new IllegalArgumentException("capacity:"+capacity);
      }
    }
//    phương thức trả về số lượng phần tử

    private int size() {
        return this.size;
    }
//    phương thức clear
    private void clear() {
        size=0;
        for(int i=0;i<elements.length;i++) {
            elements[i]=null;
        }
    }

//    private boolean add (Object object) {
//        size++;
//        elements[size]=object;
//        return true;
//    }
//    sau đó cho e vào trên

//    phương thức thêm phần tử
    private boolean add (E element) {
        if(elements.length==size) {
            this.ensureCapacity(5);
        }

        elements[size]=element;
        size++;
        return true;
    }

    private void add (E element,int index) {
        if(index>elements.length) {
            throw new IllegalArgumentException("index:"+index);
        }else if(elements.length==size){
            this.ensureCapacity(5);
        }

        if(elements[index]==null) {
            elements[index]=element;
            size++;
        }
        else {
            for(int i=size+1;i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }

//    phương thức tăng số lượng phần tử
    private void ensureCapacity(int minCapacity) {
        if(minCapacity>=0) {
            int newSize=this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: "+minCapacity)
        }
    }




















}
