package _21_case_study.models;

public class House extends Facility {
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

    public House(String roomStandard, int numberOfLevel) {
        super();
        this.roomStandard = roomStandard;
        this.numberOfLevel = numberOfLevel;
    }

    public House(String s, String s1, String s2, int i, String daily_pay, String standard, int i1) {
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
