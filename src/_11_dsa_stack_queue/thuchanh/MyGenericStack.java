package _11_dsa_stack_queue.thuchanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

//    Bước 2: Cài đặt phương thức push()
    public void push(T element) {
    stack.addFirst(element);
    }

//    Bước 3: Cài đặt phương thức pop()
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
//Bước 4: Cài đặt phương thức size()
    public int size() {
        return stack.size();
    }
//    Bước 5: Cài đặt phương thức isEmpty()

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
//    Bước 6: Cài đặt lớp GenericStackClient chứa hai phương thức stackOfStrings()
//    và stackOfIntegers()


//Bước 7: Cài đặt phương thức main() để thực thi chương trình



}
