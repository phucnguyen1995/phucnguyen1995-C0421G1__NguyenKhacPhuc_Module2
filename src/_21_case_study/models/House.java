package _21_case_study.models;

public class House extends Facility {
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
