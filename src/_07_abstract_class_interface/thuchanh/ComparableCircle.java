package _07_abstract_class_interface.thuchanh;

import _06_ke_thua.thuchanh.Circle;

public class ComparableCircle extends Circle implements  Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

//    @Override
//    public int compareTo(ComparableCircle o) {
//        if (getRadius() > o.getRadius()) return -1;
//        else if (getRadius() < o.getRadius()) return 1;
//        else return 1;
//    }
//
//    (lớn đến nhỏ)
}
