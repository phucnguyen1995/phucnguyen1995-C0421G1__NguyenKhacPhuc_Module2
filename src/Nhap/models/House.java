package _21_case_study.models;

import java.io.Serializable;

public class House extends Facility implements Serializable {
    //    Các loại dịch vụ này sẽ bao có các thông tin:
//    Tên dịch vụ,
//    Diện tích sử dụng
//    Chi phí thuê,
//    Số lượng người tối đa,
//    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.

    //    -	Riêng loại House sẽ có thêm thông tin:
    //    Tiêu chuẩn phòng
    //    Số tầng
    private String roomStandard;
    private int numberOfLevel;

    public House(String nameOfService, String usingArea, String price, int capacity, String typeOfHiring, String roomStandard, int numberOfLevel) {
        super(nameOfService, usingArea, price, capacity, typeOfHiring);
        this.roomStandard = roomStandard;
        this.numberOfLevel = numberOfLevel;
    }

    public House() {

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfLevel() {
        return numberOfLevel;
    }

    public void setNumberOfLevel(int numberOfLevel) {
        this.numberOfLevel = numberOfLevel;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfLevel=" + numberOfLevel +
                ", nameOfService='" + nameOfService + '\'' +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", capacity=" + capacity +
                ", typeOfHiring='" + typeOfHiring + '\'' +
                '}';
    }
}
