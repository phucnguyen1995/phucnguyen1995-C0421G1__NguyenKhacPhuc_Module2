package _21_case_study.models;

public class Room extends Facility {
//    -	Riêng loại Room sẽ có thêm thông tin:
//    Dịch vụ miễn phí đi kèm.

    private String freeServices;

    public Room(String freeServices) {
        super();
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
