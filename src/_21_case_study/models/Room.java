package _21_case_study.models;

import java.io.Serializable;

public class Room extends Facility implements Serializable {
    //    Các loại dịch vụ này sẽ bao có các thông tin:
//    Tên dịch vụ,
//    Diện tích sử dụng
//    Chi phí thuê,
//    Số lượng người tối đa,
//    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.


//    -	Riêng loại Room sẽ có thêm thông tin:
//    Dịch vụ miễn phí đi kèm.

    private String freeServices;


    public Room(String nameOfService, String usingArea, String price, int capacity, String typeOfHiring, String freeServices) {
        super(nameOfService, usingArea, price, capacity, typeOfHiring);
        this.freeServices = freeServices;
    }

    public Room() {

    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                ", nameOfService='" + nameOfService + '\'' +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", capacity=" + capacity +
                ", typeOfHiring='" + typeOfHiring + '\'' +
                '}';
    }
}
