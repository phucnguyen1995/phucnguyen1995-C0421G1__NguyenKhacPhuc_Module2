package _21_case_study.models;

import java.io.Serializable;

public class Villa extends Facility implements Serializable {
    //    Các loại dịch vụ này sẽ bao có các thông tin:
//    Tên dịch vụ,
//    Diện tích sử dụng
//    Chi phí thuê,
//    Số lượng người tối đa,
//    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.

//    -	Riêng loại Villa sẽ có thêm thông tin:
//    Tiêu chuẩn phòng,
//    Diện tích hồ bơi,
//    Số tầng.

    private String roomStandard;
    private String poolArea;
    private int numberOfLevel;


    public Villa(String nameOfService, String usingArea, String price, int capacity, String typeOfHiring, String roomStandard, String poolArea, int numberOfLevel) {
        super(nameOfService, usingArea, price, capacity, typeOfHiring);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfLevel = numberOfLevel;
    }

    public Villa() {

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfLevel() {
        return numberOfLevel;
    }

    public void setNumberOfLevel(int numberOfLevel) {
        this.numberOfLevel = numberOfLevel;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfLevel=" + numberOfLevel +
                ", nameOfService='" + nameOfService + '\'' +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", capacity=" + capacity +
                ", typeOfHiring='" + typeOfHiring + '\'' +
                '}';
    }
}
