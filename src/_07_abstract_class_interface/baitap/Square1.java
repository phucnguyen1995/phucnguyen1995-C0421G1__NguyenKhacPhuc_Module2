package _07_abstract_class_interface.baitap;

public class Square1  extends Shape implements Colorable  {
   public double side;

    public Square1() {
    }

    public Square1(double side) {
        this.side = side;
    }

    public void Square1 (double side) {
        this.side = side;
    }

    public Square1 (String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(double side) {
        return this.side*this.side;
    }

    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "A Square1 with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("tô 4 mặt");
    }
}
