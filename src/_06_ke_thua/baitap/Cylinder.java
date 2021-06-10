package _06_ke_thua.baitap;

public class Cylinder extends Circle {
    private double chieuCao = 4;

    public Cylinder() {

    }

    public Cylinder(double radius, String colos, double chieuCao) {
        super(radius, colos);
        this.chieuCao = chieuCao;
    }

    public Cylinder(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double gettheTich() {
        return getArea() * this.chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao + " " + super.toString() +
                '}';
    }
}
