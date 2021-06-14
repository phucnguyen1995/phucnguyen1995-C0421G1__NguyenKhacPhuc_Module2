package _7_abstract_class_interface.baitap;

public class TestSquare1 {
    public static void main(String[] args) {
        Shape shape = new Square1(4);
//        cách 1 bị lỗi khi ko khai báo constructor hoặc khai
//        báo mà có void,xóa void đi hoặc khởi tạo thêm

//      c2:  ((Square1) shape).setSide(4);
        System.out.println("dien thich la " + ((Square1) shape).getArea());

        if (((Square1) shape) instanceof Colorable) {
            ((Square1) shape).howToColor();

//            System.out.println(((Square1) shape));
        } else {
            System.out.println("Khong phai la mot Colorable");
        }
    }
//    còn 1 vấn đề chưa hiểu là sau khi chạy nó lại ra lun tostring dòng kia??
// dòng không mong muốn có:
// A Square1 with side=4.0, which is a subclass of A Shape with color of green and filled
//    giải đáp :do dòng 15
}
