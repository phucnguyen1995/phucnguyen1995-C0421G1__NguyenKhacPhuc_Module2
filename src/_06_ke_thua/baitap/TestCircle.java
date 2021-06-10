package _06_ke_thua.baitap;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);

        c = new Circle(6.2, "blue");
        System.out.println(c.getArea());
    }
}
