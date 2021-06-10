package _06_ke_thua.baitap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        System.out.println(cy);
        cy = new Cylinder(7);
        System.out.println("The tich hinh tru la " + cy.gettheTich());
        cy=new Cylinder(4,"red",7);
        System.out.println(cy.gettheTich());
    }
}
