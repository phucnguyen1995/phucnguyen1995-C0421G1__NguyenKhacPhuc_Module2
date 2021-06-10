package _04_class_object.baitap;

//Mô tả:
//        Thiết kế lớp Fan to để mô tả về cái quạt.
//        Hướng dẫn:
//        Lớp này gồm các thành phần sau:
//        2 hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3 để biểu thị tốc độ quạt.

//        Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc định là SLOW
//        Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định là false (tắt).
//        Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5
//        Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue

//        Các getter và setter cho các thuộc tính
//        Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
//        Phương thức toString() trả về chuỗi chứa thông tin của quạt. Nếu quạt đang ở trạng thái on, phương
//        thức trả về speed, color, và radius với chuỗi “fan is on”. Nếu quạt không ở trạng thái on, phương thức
//        trả về color, radius với chuỗi “fan is off”.
//        Vẽ sơ đồ UML cho lớp và cài đặt lớp
//        Viết chương trìnhHiển thị các đối tượng bằng cách gọi phương thức toString
//        Tạo 2 đối tượng Fan
//        Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
//        Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toStringFan() {
        return "status " + this.on + " speed " + displaySpeed() + " Radius " + this.radius + " color " + this.color;
    }


    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + this.speed
//                luu y co the la this.displaySpeed() hoac chi displaySpeed() tuy theo ta muon gi
                +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public String displaySpeed() {
        if (this.speed == 3) {
            return "SLOW";
        } else if (this.speed == 2) {
            return "MEDIUM";
        } else if (this.speed == 1) {
            return "FAST";
        } else {
            return "không hợp lệ";
        }

    }

    public static void main(String[] args) {
        Fan md = new Fan();
        System.out.println(md.toStringFan());
        Fan newFan1 = new Fan(3, true, 10, "yellow");
//        String fan1 = newFan1.toString();
//        System.out.println(fan1);
        System.out.println(newFan1);
        System.out.println(newFan1.toStringFan());
        Fan newFan2 = new Fan(2, false, 5, "blue");
//        String fan2 = newFan2.toString();
//        System.out.println(fan2);
        System.out.println(newFan2);
    }

}
