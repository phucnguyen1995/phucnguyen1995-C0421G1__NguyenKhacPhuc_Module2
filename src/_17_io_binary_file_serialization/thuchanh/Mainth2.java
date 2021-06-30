package _17_io_binary_file_serialization.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Mainth2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nhật", "quảng trị"));
        students.add(new Student(2, "Tài", "đà nẵng"));
        students.add(new Student(3, "Phục", "Đà Nẵng"));
        students.add(new Student(4, "Hà", "Hà Nội"));
        students.add(new Student(5, "Đức", "quảng nam"));
        writeToFile("src\\_17_io_binary_file_serialization\\data\\student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
