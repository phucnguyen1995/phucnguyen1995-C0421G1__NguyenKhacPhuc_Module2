package _12_java_collection_framework.thuchanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
//      Map<Integer, Student> studentMap = new HashMap<>();
//      khai báo như dòng 12 ko như dòng 13 có dc ko?
//        giải đáp:chạy thử vẫn ok
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
//        ket qua chay :
//        1=Student{name='Nam', age=20, address='HN'}
//        2=Student{name='Hung', age=21, address='HN'}
//        3=Student{name='Ha', age=22, address='HN'}
//        4=Student{name='Nam', age=20, address='HN'}

        System.out.println(" bay gio la code voi Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
//        kết quả chạy:
//        Student{name='Ha', age=22, address='HN'}
//        Student{name='Hung', age=21, address='HN'}
//        Student{name='Nam', age=20, address='HN'}


//        => hashset ko cho add giá trị trùng lặp còn hashmap thì dc
//        nếu đề ko nói gì đến trùng lặp thì ta thấy làm theo kiểu hashset
//        có vẻ như đơn giản và gọn hơn






    }
}
