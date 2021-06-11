package _7_abstract_class_interface.baitap;

public class TestResizeable {
    public static void main(String[] args) {
        Shape []shape = new Shape[3];
        shape[0] = new Circle(5.5);
        shape[1] = new Rectangle(7.0,4.0);
        shape[2] = new Square(2.0);

        for (Shape shapes: shape) {
            System.out.println("Gia tri cu " + shapes);
        }

        System.out.println("Gia tri moi: ");
        ((Circle)shape[0]).resize(Math.random() * 100);
        System.out.println("Gia tri moi: " + shape[0]);
        System.out.println("Dien tich moi: " + ((Circle)shape[0]).getArea());

        ((Rectangle)shape[1]).resize(Math.random() * 100);
        System.out.println("Gia tri moi: " + shape[1]);
        System.out.println("Dien tich moi: " + ((Rectangle)shape[1]).getArea());

        ((Square)shape[2]).resize(Math.random() * 100);
        System.out.println("Gia tri moi: " + shape[2]);
        System.out.println("Dien tich moi: " + ((Square)shape[2]).getArea());
    }
}
