package _06_ke_thua.baitap;

public class Circle {
    private double radius=5.0;
    private String colos="pink";

    public Circle(double radius, String colos) {
        this.radius = radius;
        this.colos = colos;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColos() {
        return colos;
    }

    public void setColos(String colos) {
        this.colos = colos;
    }

    public double getArea() {
        return this.radius*this.radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colos='" + colos + '\'' +
                '}';
    }
}
