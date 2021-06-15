package _08_clean_code_refactoring.thuchanh;

public class Cylinder {
//    public static double getVolume(int radius, int height){
//        double baseArea = Math.PI * radius * radius;
//        double perimeter = 2 * Math.PI  * radius;
//        double volume = perimeter * height + 2 * baseArea;
//        return volume;
//    }
//    Ở trong mã nguồn hiện tại, phương thức getVolume() đang
//    thực hiện quá nhiều công việc:
//    Tính diện tích đáy
//    Tính chu vi của hình trụ
//    Tính thể tích của hình trụ
//    Do đó, chúng ta cần tách thành các phương thức riêng biệt
//    để mã nguồn trở nên gọn gàng và dễ quản lý hơn.
//    Trong trường hợp này, chúng ta sẽ tách thêm 2 phương thức
//    để thực hiện các nhiệm vụ:
//    getBaseArea(): Tính diện tích đáy
//    getPerimeter(): Tính chu vi
//
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

//    public static double getVolume(int radius, int height) {
//
//
//        return getPerimeter(int radius) * height + 2 * getBaseArea(int radius);
//
//    }

}
