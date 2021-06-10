package _05_access_modifier.baitap;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setClasses("C04");
        student1.setName("Phuc");
        System.out.println(student1.getClasses());
        System.out.println(student1.getName());
        Student st=new Student();
        System.out.println(st.getName());
        System.out.println(st.getClasses());
        System.out.println(st);

    }
}

