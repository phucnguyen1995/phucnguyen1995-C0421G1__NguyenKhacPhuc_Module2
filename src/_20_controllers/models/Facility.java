package _20_controllers.models;

public abstract class Facility {
//    Các loại dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử
//    dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo
//    năm, tháng, ngày, giờ.

    protected String nameOfService;
    protected double usingArea;
    protected double price;
    protected int capacity;
    protected String typeOfHiring;

    public Facility() {
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTypeOfHiring() {
        return typeOfHiring;
    }

    public void setTypeOfHiring(String typeOfHiring) {
        this.typeOfHiring = typeOfHiring;
    }

    
}
